/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String nombre;
   int edad;
   double promedio;
 
   Scanner input = new Scanner (System.in); 
   System.out.println("Introduce tu nombre completo");
   //CAPTURA DE DATOS
   nombre = input.nextLine(); //captura el texto (next line)
  
      
      System.out.println("Introduce tu edad");
      edad = input.nextInt();
      System.out.println("Captura tu promedio de la preparatoria");
      promedio = input.nextDouble();
      
      System.out.println("El nombre es: ");
      System.out.println(nombre);
      System.out.println("La edad es: ");
      System.out.println(edad);
      System.out.println("El promedio es: ");
      System.out.println(promedio);
      
      
      
      
      
      
      
      
      
      
      
      
   

   
    }
    
}
