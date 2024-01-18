/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chessmutiplayerlocal;
import java.awt.Color;
import tablero.Tablero;

/**
 *
 * @author PC
 */
public class ChessMutiplayerLocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo xdxdxd");
        
        Tablero tablero = new Tablero(8, 8, Color.black, Color.white, 60);
        VentanaPrincipal principal = new VentanaPrincipal();
        tablero.cargarTablero(principal);
        
        
    }
    
}



