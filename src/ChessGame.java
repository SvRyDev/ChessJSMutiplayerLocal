
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * CODIGO INICIAL BY Khouiled
 * MODIFICADO BY Arthur
 */
public class ChessGame {

    //Creacion de lista doblemente enlazada (LinkedList)para generar las piezas del tablero
    public static LinkedList<Piece> ps = new LinkedList<>();
    //Objeto de la Pieza Seleccionada
    public static Piece selectedPiece = null;

    //Metodo Principal - Metodo de arranque del programa
    public static void main(String[] args) throws IOException {
        
        //Cargar Imagen por BufferedImage - Libreria BufferedImage & ImageIo
        BufferedImage imgPrincipal  = ImageIO.read(new File("D:\\Archivos-Usuario\\Documentos\\NetBeansProjects\\ChessJavaMultiplayer\\src\\img\\pieces.png"));
        
        //Arreglo de imagen - Libreria Awt 
        Image imgs[] = new Image[12];
        //Indice
        int ind = 0;
        //Iteracion respecto a la dimension de la imagen principal 
        //haciendo recortes de la imagen principal en sub imagenes para separar las imagenes de las piezas
        for (int y = 0; y < 400; y += 200) {
            for (int x = 0; x < 1200; x += 200) {
                //almacenar el recorte de la imagen en el arreglos de imagen
                imgs[ind] = imgPrincipal.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                ind++;
            }
        }
        
        //Creacion de los objetos tipo Piezas - 16 Piezas
        
        Piece brook = new Piece(0, 0, false, "torre", ps);
        Piece bkinght = new Piece(1, 0, false, "caballo", ps);
        Piece bbishop = new Piece(2, 0, false, "alfil", ps);
        Piece bqueen = new Piece(3, 0, false, "reina", ps);
        Piece bking = new Piece(4, 0, false, "rey", ps);
        Piece bbishop2 = new Piece(5, 0, false, "alfil", ps);
        Piece bkight2 = new Piece(6, 0, false, "caballo", ps);
        Piece brook2 = new Piece(7, 0, false, "torre", ps);
        Piece bpawn1 = new Piece(1, 1, false, "peon", ps);
        Piece bpawn2 = new Piece(2, 1, false, "peon", ps);
        Piece bpawn3 = new Piece(3, 1, false, "peon", ps);
        Piece bpawn4 = new Piece(4, 1, false, "peon", ps);
        Piece bpawn5 = new Piece(5, 1, false, "peon", ps);
        Piece bpawn6 = new Piece(6, 1, false, "peon", ps);
        Piece bpawn7 = new Piece(7, 1, false, "peon", ps);
        Piece bpawn8 = new Piece(0, 1, false, "peon", ps);

        Piece wrook = new Piece(0, 7, true, "torre", ps);
        Piece wkinght = new Piece(1, 7, true, "caballo", ps);
        Piece wbishop = new Piece(2, 7, true, "alfil", ps);
        Piece wqueen = new Piece(3, 7, true, "reina", ps);
        Piece wking = new Piece(4, 7, true, "rey", ps);
        Piece wbishop2 = new Piece(5, 7, true, "alfil", ps);
        Piece wkight2 = new Piece(6, 7, true, "caballo", ps);
        Piece wrook2 = new Piece(7, 7, true, "torre", ps);
        Piece wpawn1 = new Piece(1, 6, true, "peon", ps);
        Piece wpawn2 = new Piece(2, 6, true, "peon", ps);
        Piece wpawn3 = new Piece(3, 6, true, "peon", ps);
        Piece wpawn4 = new Piece(4, 6, true, "peon", ps);
        Piece wpawn5 = new Piece(5, 6, true, "peon", ps);
        Piece wpawn6 = new Piece(6, 6, true, "peon", ps);
        Piece wpawn7 = new Piece(7, 6, true, "peon", ps);
        Piece wpawn8 = new Piece(0, 6, true, "peon", ps);

        //objeto jframe para la generar la vista principal
        JFrame frame = new JFrame();
        //dimensionar la ventana jframe
        frame.setBounds(10, 10, 812, 812);
        //Eliminar los botones de la barra de titulo: cerrar, minimizar
        frame.setUndecorated(true);
        //objeto jpanel como un pequeño panel que de añadira a la ventana principal
        JPanel pn = new JPanel() {
            //override para el polimorfismo
            @Override
            //generacion de coloreado en la ventana
            public void paint(Graphics g) {
                //bandera para identificar si es blanco o negro: t & f
                boolean white = true;
                //iteracion para pintar las filas
                for (int y = 0; y < 8; y++) {
                    //iteracion para pintar las columnas
                    for (int x = 0; x < 8; x++) {
                        if (white) {
                            g.setColor(new Color(235, 235, 208));
                        } else {
                            g.setColor(new Color(119, 148, 85));

                        }
                        //dibujar una seccion rectangular a traves de fillRect (rellenar rectangulo) de la libreria awt.Grafics g
                        g.fillRect(x * 64, y * 64, 64, 64);
                        //invertir el valor de la bandera
                        white = !white;
                    }
                    //invertir el valor de la bandera
                    white = !white;
                }
                //foreach o recorrido indicando el tipo del objeto y el arreglo del mismo tipo
                for (Piece p : ps) {
                    int ind = 0;
                    if (p.name.equalsIgnoreCase("rey")) {
                        ind = 0;
                    }
                    if (p.name.equalsIgnoreCase("reina")) {
                        ind = 1;
                    }
                    if (p.name.equalsIgnoreCase("alfil")) {
                        ind = 2;
                    }
                    if (p.name.equalsIgnoreCase("caballo")) {
                        ind = 3;
                    }
                    if (p.name.equalsIgnoreCase("torre")) {
                        ind = 4;
                    }
                    if (p.name.equalsIgnoreCase("peon")) {
                        ind = 5;
                    }
                    if (!p.isWhite) {
                        ind += 6;
                    }
                    //Dibujar la imagen del objeto pieza, 
                    g.drawImage(imgs[ind], p.x, p.y, this);
                }
            }

        };
        
        //añadir el panel en el jframe
        frame.add(pn);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (selectedPiece != null) {
                    selectedPiece.x = e.getX() - 32;
                    selectedPiece.y = e.getY() - 32;
                    frame.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println((getPiece(e.getX(), e.getY()).isWhite?"white ":"balck ")+getPiece(e.getX(), e.getY()).name);
                selectedPiece = getPiece(e.getX(), e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                selectedPiece.move(e.getX() / 64, e.getY() / 64);
                frame.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public static Piece getPiece(int x, int y) {
        int xp = x / 64;
        int yp = y / 64;
        for (Piece p : ps) {
            if (p.xp == xp && p.yp == yp) {
                return p;
            }
        }
        return null;
    }
}

