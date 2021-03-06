/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author HP
 */
public class Graficar {
    
    private JFreeChart grafica;
    
    private XYSeriesCollection s;
    private String nombre,ejeX,ejeY;

    public Graficar(String nombre,String X,String Y) {
     this.grafica = null;
     this.s = new XYSeriesCollection();
     this.nombre = nombre;
     this.ejeX =X;
     this.ejeY = Y;
    }
    public void agregarSerie(double[] dt,double[] dn , String nombre){
    XYSeries serie = new XYSeries(nombre);
        for (int x = 0 ; x < dt.length;x++)
        {
        serie.add(dn[x], dt[x]);    
        }
     this.s.addSeries(serie);
    }
    
    
    public void hacerGrafica() {
         this.grafica = ChartFactory.createXYLineChart(nombre, ejeX, ejeY, s);
        
        ChartFrame panel = new ChartFrame("grafica",grafica);
        panel.pack();
        panel.setVisible(true);
        
    }
    
    
}
