/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;





/**
 *
 * @author vina
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
//        int i =0;
//        while (i<10) {
//            System.out.println(i);
//            i++;
//              
//        }
    
//         for (int i = 0; i < 11; i++) {
//             System.out.println(i);
//            
//        }

        Scanner teclado = new Scanner(System.in);
        int opcion;
        
          do {       
              System.out.println("MENÚ");
              System.out.println("(1)GUARDAR");
              System.out.println("(2)MOSTRAR");
              System.out.println("(0)SALIR");
              System.out.println("SELECCIONE OPCIÓN");
              opcion = teclado.nextInt();
              
              switch(opcion) {
                  case 1:
                      System.out.println("MENÚ GUARDAR");
                      break;
                  case 2:
                      System.out.println("MENÚ MOSTRAR");
                      break;
                  default:
                      System.out.println("OPCIÓN INVÁLIDA");
                              
              }
            
        } while (opcion!=0);
          System.out.println("SALIÓ DEL MENÚ");

          
    }
    
}
