/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessmutiplayerlocal;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        
        // Establecer el título de la ventana
        setTitle("Mi Primer Frame");

        // Establecer el tamaño de la ventana (ancho, alto)
        setSize(600, 600);

        // Especificar la operación por defecto cuando se cierra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        //centrar la ventana
        setLocationRelativeTo(null);
        
        
        // Hacer visible la ventana
        setVisible(true);
    }
}
