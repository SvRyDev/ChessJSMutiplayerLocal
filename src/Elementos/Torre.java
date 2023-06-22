/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Arturo
 */
public class Torre extends Pieza {

    static int id = 1;
    static String nombre = "torre";
    Image fotoImage = null;

    public Torre(int corTableroX, int corTableroY, boolean esBlanco, LinkedList<Pieza> listaPiezas) {
        super(corTableroX, corTableroY, esBlanco, listaPiezas, Torre.nombre);
        this.fotoImage = super.fotopieza;
        
       
    }

    public Image getFotoImage() {
        return fotoImage;
    }



    @Override
    public ArrayList<Coordenada> marcarMovimiento(int posicionX, int posicionY) {

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


        
        return coo;
    }

}
