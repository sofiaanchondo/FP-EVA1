/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //VELOCIDAD = DISTANCIA/TIEMPO
   // M/S
   double velocidad, distancia, tiempo;
   Scanner captu = new Scanner (System.in);
   System.out.println("Introduce tu distancia");
   distancia = captu.nextDouble();
   System.out.println("Introduce tu tiempo");
   tiempo = captu.nextDouble();
   // CALCULO
   velocidad = distancia / tiempo;
   System.out.print("La velocidad es: ");
   System.out.print( velocidad);
   System.out.print("m/s");
   
   
   
    }
    
}
