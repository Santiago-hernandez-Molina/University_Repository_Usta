/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import model.Cliente;
import model.Pan;

/**
 * @author yolima (estudiante que resolvio el quiz: Santiago Hernandez Molina)
 */
public class Panaderia {

	private Cliente clientes[];
	private Pan despensa[];
	private int clienteactual;
	private int[] ventas;
	private int numeroClientes;
	private String[][] visitasCliente;

	public Panaderia() {

		despensa = new Pan[3];
		clienteactual = 0;
		visitasCliente = new String[7][10];

	}

	public void savePan(int id, String tipo, int precio) {
		// Este metodo guarda los panes disponibles en la despensa
		Pan pan = new Pan(tipo, precio);
		despensa[id] = pan;

	}

	public void simulation() {
		for (int day = 0; day < 3; day++) {
			clientes = new Cliente[10];
			numeroClientes = (int) (Math.random() * 3 + 1);
			ventas = new int[15];
			venderPan(day);
		}
		mostrarvisitasCliente();
	}

	public void venderPan(int day) {
		System.out.println("dia: " + (day + 1) + "\n");
		for (int k = 0; k < numeroClientes; k++) {

			Scanner keyboard = new Scanner(System.in);
			Cliente cliente = new Cliente();
			int total = 0;
			boolean reiniciar = false;

			do {
				try {

					System.out.println("Tipo de pan a la venta:");
					for (int i = 0; i < despensa.length; i++) {
						System.out.println(despensa[i].getTipo());

					}

					System.out.println("Ingrese el nombre del cliente");
					String nameString = keyboard.next();
					System.out.println("Cuántos panes desea comprar de cada tipo?:");
					int numeroPanes = 0;
					int numCanasta = 0;

					for (int i = 0; i < despensa.length; i++) {
						System.out.println(despensa[i].getTipo());
						numeroPanes = keyboard.nextInt();

						for (int j = 0; j < numeroPanes; j++) {

							cliente = new Cliente(nameString, cliente.llenarCanasta(numCanasta, despensa[i]));
							clientes[clienteactual] = cliente;
							total += despensa[i].getPrecio();
							numCanasta++;
						}
					}

					System.out.println(clientes[clienteactual].toString() + "\n" + "Total: " + total + "\n");
					reiniciar = false;
					visitasCliente[day][k] = clientes[clienteactual].getNombre();
					ventas[k] = total;
					clienteactual++;

				} catch (InputMismatchException e) {
					reiniciar = true;
					System.err.println("ingrese el tipo de valor que se le pide");
					total = 0;
					keyboard.next();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("El numero de panes exceden el tamaño de la canasta.\n"
							+ "(Presione cualquier tecla para continuar)");
					keyboard.next();
					reiniciar = true;
					total = 0;
				}
			} while (reiniciar == true);
		}
		registroVentas();
	}

	private void registroVentas() {
		System.out.println("las ventas del dia fueron: \n" + Arrays.toString(ventas));
		System.out.println(" ");
	}

	private void mostrarvisitasCliente() {
		for (int i = 0; i < visitasCliente.length; i++) {
			System.out.print("El dia: " + (i + 1) + " vinieron los siguientes clientes: ");
			for (int j = 0; j < 10; j++) {
				if (visitasCliente[i][j] == null) {
				} else {
					System.out.print(visitasCliente[i][j] + " | ");
				}
			}
			System.out.println(" ");
		}
	}

}
