/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Tablero extends JPanel {

    int numeroX;
    int numeroY;
    Color colorblancas;
    Color colornegras;
    int celdapx;

    public Tablero(int numeroX, int numeroY, Color colorblancas, Color colornegras, int celdapx) {
        this.numeroX = numeroX;
        this.numeroY = numeroY;
        this.colorblancas = colorblancas;
        this.colornegras = colornegras;
        this.celdapx = celdapx;
        

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        boolean isblanca = true;

        for (int i = 0; i < numeroX; i++) {
            for (int j = 0; j < numeroY; j++) {
                g.setColor((isblanca) ? colorblancas : colornegras);
                g.fillRect(i * (celdapx) + 60,
                           j * (celdapx) + 60, celdapx, celdapx);
                isblanca = !isblanca;
            }
            isblanca = !isblanca;
        }
    }

    

    public void generarTablero() {

    }

    //funcion para insertar el tablero a la ventana
    public void cargarTablero(JFrame ventana) {
        ventana.getContentPane().add(this);
    }

}
