/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15.mayor;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_15MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numerouno, numerodos;
   Scanner captu = new Scanner (System.in);
           System.out.println("Introduce tu primer numero");
           numerouno = captu.nextInt();
           System.out.println("Introduce tu segundo numero");
           numerodos = captu.nextInt();
          
        
           if(numerouno > numerodos){ 
               System.out.println("El valor mayor es: ");
               System.out.print(numerouno);
               }else{ 
                
               if(numerodos > numerouno){
               System.out.println("El valor mayor es: ");
               System.out.print(numerodos);
                }else{
                System.out.println("Los valores son iguales");
                   }
        }
    }
}

                    
               
           
    
    

