/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int edad;
   Scanner captu = new Scanner (System.in);
           System.out.println("Introduce tu edad");
           edad = captu.nextInt();
           //ESTRUCTURA DE CONTROL IF
           if(edad >= 18){ //BLOQUE VERDADERO O FALSO
               System.out.println("puedes comprar bebidas alcoholicas");
    }else{ //BLOQUE FALSO --> OPCIONAL SI O NO
               System.out.println("No puedes comprar bebidas alcoholicas");
           }
           }
    }
    

