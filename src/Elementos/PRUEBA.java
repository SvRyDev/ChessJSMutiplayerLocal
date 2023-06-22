/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Elementos;

import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class PRUEBA {

    static int posicionX = 5;
    static int posicionY = 0;


    public static void main(String[] args) {

        ArrayList<Coordenada> coo = new ArrayList<>();

        //HACIA LA IZUIERDA
        for (int i = posicionX; i > 0; i--) {
            coo.add(new Coordenada((i - 1), posicionY));
        }

        //HACIA LA DERECHA
        for (int i = posicionX; i < 7; i++) {
            coo.add(new Coordenada((i + 1), posicionY));
        }

        //HACIA ABAJO
        for (int i = posicionY; i > 0; i--) {
            coo.add(new Coordenada(posicionX, (i - 1)));
        }

        //HACIA LA ARRIBA
        for (int i = posicionY; i < 7; i++) {
            coo.add(new Coordenada(posicionX, (i + 1)));
        }

        for (int i = 0; i < coo.size(); i++) {
            System.out.println(i+ ": "+coo.get(i).x + ":" + coo.get(i).y);
        }
        System.out.println("TOTAL DE MOVIMIENTOS " + coo.size());
    }

}
