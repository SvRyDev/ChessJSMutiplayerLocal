/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Arturo
 */
public class Tablero {

    int filas;
    int columnas;
    int dimension;
    boolean esBlanco;

    Color color1;
    Color color2;

    public Tablero(int filas, int columnas, int dimension, boolean esBlanco, Color color1, Color color2) {
        this.filas = filas;
        this.columnas = columnas;
        this.dimension = dimension;
        this.esBlanco = esBlanco;
        this.color1 = color1;
        this.color2 = color2;
    }
    
    
    public void mostrarTablero(){
        
    }
    
         public void paint(Graphics g) {
                //bandera para identificar si es blanco o negro: t & f
                boolean white = true;
                //iteracion para pintar las filas
                for (int y = 0; y < 8; y++) {
                    //iteracion para pintar las columnas
                    for (int x = 0; x < 8; x++) {
                        if (white) {
                            g.setColor(new Color(235, 235, 208));
                        } else {
                            g.setColor(new Color(119, 148, 85));

                        }
                        //dibujar una seccion rectangular a traves de fillRect (rellenar rectangulo) de la libreria awt.Grafics g
                        g.fillRect(x * 64, y * 64, 64, 64);
                        //invertir el valor de la bandera
                        white = !white;
                    }
                    //invertir el valor de la bandera
                    white = !white;
                }
                //foreach o recorrido indicando el tipo del objeto y el arreglo del mismo tipo
                for (Piece p : ps) {
                    int ind = 0;
                    if (p.name.equalsIgnoreCase("rey")) {
                        ind = 0;
                    }
                    if (p.name.equalsIgnoreCase("reina")) {
                        ind = 1;
                    }
                    if (p.name.equalsIgnoreCase("alfil")) {
                        ind = 2;
                    }
                    if (p.name.equalsIgnoreCase("caballo")) {
                        ind = 3;
                    }
                    if (p.name.equalsIgnoreCase("torre")) {
                        ind = 4;
                    }
                    if (p.name.equalsIgnoreCase("peon")) {
                        ind = 5;
                    }
                    if (!p.isWhite) {
                        ind += 6;
                    }
                    //Dibujar la imagen del objeto pieza, 
                    g.drawImage(imgs[ind], p.x, p.y, this);
                }
            }


}
