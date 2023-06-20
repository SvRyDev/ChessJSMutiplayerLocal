package Elementos;

import java.util.LinkedList;

/**
 *
 * @author Arturo
 */
public class Pieza {

    int corTableroX;
    int corTableroY;

    int corVentX;
    int corVentY;

    boolean esBlanco;
    LinkedList<Pieza> listaPiezas;
    String nombre;

    public Pieza(int corTableroX, int corTableroY, boolean esBlanco, String nombre, LinkedList<Pieza> listaPiezas) {
        this.corTableroX = corTableroX;
        this.corTableroY = corTableroY;
        this.corVentX = corTableroX * 64;
        this.corVentY = corTableroY * 64;
        this.esBlanco = esBlanco;
        this.listaPiezas = listaPiezas;
        this.nombre = nombre;
        listaPiezas.add(this);
    }

    public void mover() {
    }

    public void asesinar() {
    }

    public void marcar() {

    }

}
