/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import controller.Panaderia;

/**
 *
 * @author yolima (estudiante que resolvio el quiz: Santiago Hernandez Molina)
 */
public class Inicio {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Panaderia tienda = new Panaderia();
		// Llenamos la despensa con tres tipos de panes
		tienda.savePan(0, "Rollo", 300);
		tienda.savePan(1, "hojaldrado", 200);
		tienda.savePan(2, "mantequilla", 300);

		tienda.simulation();

	}

}
