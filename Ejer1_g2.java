/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_g2;
import java.util.Scanner;
/**
 *Crea un array de 10 posiciones de números con valores pedidos por teclado.
Muestra por consola el índice y el valor al que corresponde. Haz dos métodos,
uno para rellenar valores y otro para mostrar.

 * @author LABMOVIL
 */
public class Ejer_g2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
     int[] posiciones  = new int[10];
     for (int i = 0; i < 10; i++){
         System.out.println("ingrese el numero de la posicion " + (i+1));
         posiciones[i] = scan.nextInt();
        }
      for (int i = 0; i < 10; i++) {
          System.out.println("su valor " + i + " es = " + posiciones[i] );
        
        }
        
        
        
        
        
    }
    
}
