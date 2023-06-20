/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Elementos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Arturo
 */
public class Tablero1 extends javax.swing.JPanel {

    int filas;
    int columnas;
    int dimension;

    Color color1;
    Color color2;

    public Tablero1() {
        initComponents();
    }

    public Tablero1(int filas, int columnas, int dimension, Color color1, Color color2) {
        initComponents();
        this.setSize(filas * dimension, columnas * dimension);
        this.filas = filas;
        this.columnas = columnas;
        this.dimension = dimension;
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void paint(Graphics g) {
        boolean white = true;
        
        for (int y = 0; y < columnas; y++) {
            for (int x = 0; x < filas; x++) {
                if (white) {
                    g.setColor(color1);
                } else {
                    g.setColor(color2);
                }
                g.fillRect(x * dimension, y * dimension, dimension, dimension);
                white = !white;
            }
            white = !white;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
