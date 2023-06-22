package Elementos;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;

/**
 *
 * @author Arturo
 */
public class Pieza {

    int idPieza;
    String nombre;
    
    int corTableroX;
    int corTableroY;

    int corVentX;
    int corVentY;

    boolean esBlanco;
    LinkedList<Pieza> listaPiezas;

    public static BufferedImage imgPrincipal;
    public static Image imgs[];

    public Pieza(int corTableroX, int corTableroY, boolean esBlanco, LinkedList<Pieza> listaPiezas) {

        this.corTableroX = corTableroX;
        this.corTableroY = corTableroY;
        this.corVentX = corTableroX * 64;
        this.corVentY = corTableroY * 64;
        this.esBlanco = esBlanco;
        this.listaPiezas = listaPiezas;

        listaPiezas.add(this);
    }

    public void guardarImage() throws IOException {
        imgPrincipal = ImageIO.read(new File("C:\\xampp\\htdocs\\ChessMutiplayerLocal\\src\\img\\pieces.png"));
        imgs = new Image[12];
        int ind = 0;
        for (int y = 0; y < 400; y += 200) {
            for (int x = 0; x < 1200; x += 200) {
                imgs[ind] = imgPrincipal.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                ind++;
            }
        }
    }

    public Image subirImage(int x, int y) {
        for (Pieza p : listaPiezas) {
            int ind = 0;
            if (p.nombre.equalsIgnoreCase("rey")) {
                ind = 0;
            }
            if (p.nombre.equalsIgnoreCase("reina")) {
                ind = 1;
            }
            if (p.nombre.equalsIgnoreCase("alfil")) {
                ind = 2;
            }
            if (p.nombre.equalsIgnoreCase("caballo")) {
                ind = 3;
            }
            if (p.nombre.equalsIgnoreCase("torre")) {
                ind = 4;
            }
            if (p.nombre.equalsIgnoreCase("peon")) {
                ind = 5;
            }
            if (!p.esBlanco) {
                ind += 6;
            }
            //Dibujar la imagen del objeto pieza, 
            //g.drawImage(imgs[ind], p.x, p.y, this);
        }
        return imgs[0];
    }

    
    public int[][] marcarMovimiento(int posicionX, int posicionY) {
        int[][] arrglo= null;
        return arrglo;
    }
    
    public void mover() {
    }

    public void asesinar() {
    }

    public void marcar() {

    }

}
