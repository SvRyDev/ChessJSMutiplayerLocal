/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

import java.util.LinkedList;

/**
 *
 * @author Arturo
 */
public class Torre extends Pieza {

    static int id = 1;
    static String nombre = "Torre";

    public Torre(int corTableroX, int corTableroY, boolean esBlanco, LinkedList<Pieza> listaPiezas) {
        super(corTableroX, corTableroY, esBlanco, listaPiezas);
    }

    @Override
    public int[][] marcarMovimiento(int posicionX, int posicionY) {
        
        int x = posicionX;
        int y = posicionY;

        for (int i = posicionX; i < 0; i--) {
            System.out.println("Coordenada de torre : ("++);
        }
        int[][] arrglo = null;
        return arrglo;
    }

}
