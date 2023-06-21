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
    static String nomnbre = "Torre";

    public Torre(int corTableroX, int corTableroY, boolean esBlanco, LinkedList<Pieza> listaPiezas) {
        super(corTableroX, corTableroY, esBlanco, listaPiezas);
    }



}
