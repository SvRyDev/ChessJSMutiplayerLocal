/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arturo
 */
public class Moves {

    int x = 1;
    int y = 3;

    public Moves(){
        
    }
    
    public Moves(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String imprimirCordenadasSalida() {
        String salida = "";

        boolean ite = true;

        do{
            if (ite) {
                x = -x;
                System.out.println(x + ",  " + y);
                x = -x;
                System.out.println(x + ",  " + y);
            }
            ite = !ite;
        }while (ite);

        return salida;
    }
}
