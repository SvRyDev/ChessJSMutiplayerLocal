/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piezas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author PC
 */
public class Pieza {
    
    
    public void a() throws IOException {
         //Cargar Imagen por BufferedImage - Libreria BufferedImage & ImageIo
        BufferedImage imgPrincipal = ImageIO.read(new File("D:\\Archivos-Usuario\\Documentos\\NetBeansProjects\\ChessJavaMultiplayer\\src\\img\\pieces.png"));

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
    }
            
            
            
}
