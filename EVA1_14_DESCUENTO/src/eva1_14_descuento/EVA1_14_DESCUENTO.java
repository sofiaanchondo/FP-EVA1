/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   double montoventa, montopagar;
   Scanner captu = new Scanner (System.in);
   System.out.println("monto de la compra");
   montoventa = captu.nextDouble();
   if(montoventa >1000){
       montopagar = montoventa *0.85;
       //MONTOPAGAR = MONTOVENTA*0.15);
       System.out.print("Debes pagar: ");
       System.out.println(montopagar);
       
   }
    }
}
               
    
    
    

