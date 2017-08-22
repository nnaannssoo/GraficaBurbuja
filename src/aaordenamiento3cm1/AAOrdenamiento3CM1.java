/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import herramientas.Graficar;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double [] datos = new double[]{6,5,3,1,8,7,2,4};
        double [] datos =herramientas.Datos.generarDatosAleatorios(50000, 100);
        double []dt=new double [10];
        double []dt1=new double [10];
        double []dn=new double [10];
        
        
        for(int i=0;i<10;i++){
        //double [] datos2 = new double[]{8,7,6,5,4,3,2,1};
        double [] datos3 = datos.clone();
        Burbuja b1 = new Burbuja();
        b1.ordenar(datos);
        
        BurbujaOptimizado b2 = new BurbujaOptimizado();
        b2.ordenar(datos3);
        
        dt[i]=b1.getTiempo_total();
        dn[i]=i+1;
        dt1[i]=b2.getTiempo_total();
        
        }
        
       
        
        
        Graficar h= new Graficar("Holi","x","y");
        h.agregarSerie(dt,dn, "burbujanormal");
        h.agregarSerie(dt1,dn, "burbujaoptimizada");
        h.hacerGrafica();
        
        
        
       
        
    }
   
}
