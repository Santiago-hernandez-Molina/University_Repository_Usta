/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.Panaderia;

/**
 *
 * @author yolima
 */
public class Inicio {

   private Panaderia tienda;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        panaderia.savePan(0,"rollo",200);
        panaderia.savePan(1,"blandito",200);

        panaderia.venderPan();
        
        // añadir panes
        // vender pan: registrar cada cliente que va llegando y decirle el total
        
        //corregir errores (sintaxis y de lógica)
        
        //agregar try/catch correcta y realizar la guía de error para que no se dañe el programa
        
        
    }
    
}
