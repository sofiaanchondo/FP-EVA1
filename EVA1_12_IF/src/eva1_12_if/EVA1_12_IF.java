/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int califa;
   Scanner captu = new Scanner (System.in);
           System.out.println("Introduce tu calificacion");
           califa = captu.nextInt();
           //ESTRUCTURA DE CONTROL IF
           if(califa >= 70){ //BLOQUE VERDADERO O FALSO
               System.out.println("Acrediaste!!");
    }else{ //BLOQUE FALSO --> OPCIONAL SI O NO
               System.out.println("no acreditaste");
           }
           }
               
   
    }
    

