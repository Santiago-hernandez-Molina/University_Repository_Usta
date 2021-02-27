/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yolima (estudiante que resolvio el quiz: Santiago Hernandez Molina)
 */
public class Pan {
    
    private String tipo;
    private int precio;

    public Pan() {
    }



	public Pan(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
	public String toString() {
		return "Pan [tipo=" + tipo + ", precio=" + precio + "]";
	}
}
