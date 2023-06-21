package Elementos;

import static Elementos.ventanaPrueba.principal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

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
        //initComponents();
        eventosMouse();
        this.setBounds(50, 50, filas * dimension, columnas * dimension);
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
    
    void colocarPiezas(){
        
    }
    

    private void eventosMouse() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
           
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        }
        );
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                principal.txtCordenadas.setText("arrastrando:  " + e.getX() + " Y " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
