/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;

import model.Cliente;
import model.Pan;

/**
 * @author yolima
 */
public class Panaderia {

	private Cliente clientes[] = new Cliente[3];
	private Pan despensa[] = new Pan[2];
	private int clienteactual=0;

	public Panaderia() {
	}


	public void savePan(int id, String tipo, int precio) {

		try {
			Pan pan = new Pan(tipo, precio);
			despensa[id] = pan;

		} catch (Exception e) {
			System.out.println("hubo un error al guardar");
		}
	}

	public void venderPan() {
		Scanner keyboard = new Scanner(System.in);
		Cliente cliente2= new Cliente();
		Cliente cliente;
		System.out.println("Tipo de pan a la venta:");
		for (int i = 0; i < despensa.length; i++)
			System.out.println(despensa[i].getTipo());
		System.out.println("Cuántos panes desea comprar de cada tipo?:");
		int numeroPanes = 0;
		int numCanasta = 0;
		for (int i = 0; i < despensa.length; i++) {
			System.out.println(despensa[i].getTipo());
			numeroPanes = keyboard.nextInt();
			
			for (int j = 0; j < numeroPanes; j++) {
				cliente = new Cliente("jose",cliente2.llenarCanasta(numCanasta, despensa[i]));
				clientes[clienteactual]=cliente;
				numCanasta++;
			}
		}
		System.out.println(clientes[0].toString());
	}
}
