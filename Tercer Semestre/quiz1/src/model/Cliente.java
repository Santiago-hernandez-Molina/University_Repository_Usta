/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author yolima (estudiante que resolvio el quiz: Santiago Hernandez Molina)
 */
public class Cliente {

	private String nombre;
	private Pan canasta[] = new Pan[10];

	public Cliente() {
	}

	public Cliente(String nombre, Pan[] Canasta) {
		this.nombre = nombre;
		this.canasta = Canasta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pan[] llenarCanasta(int i, Pan pan) {
		// fue necesario añadir este metodo para llenar la canasta ya que con los setter
		// y getter
		// salia un error porque la canasta estaba vacia
		canasta[i] = pan;

		return canasta;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", Canasta=" + Arrays.toString(canasta) + "]";
	}

}
