/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author yolima
 */
public class Cliente {
    
    private String nombre;
    private Pan Canasta[]=new Pan[10];

    public Cliente() {
    }

    public Cliente(String nombre, Pan[] Canasta) {
        this.nombre = nombre;
        this.Canasta = Canasta;
    }



	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pan[] llenarCanasta(int i,Pan pan){

            Canasta[i]=pan;

        return Canasta;
    }
    
    @Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", Canasta=" + Arrays.toString(Canasta) + "]";
	}
    
}
