/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        // TODO code application logic here
        int califa;
 Scanner captu = new Scanner (System.in);
 System.out.println("Introduzca su calificacion (1 al 100)");
 califa = captu.nextInt();
 if ((califa >= 90) && (califa <= 100)){ 
  System.out.println("Tienes una A");
  }else if((califa >= 80)&& (califa <= 89)){
      System.out.println("Tienes una B");
      }else if((califa >= 70)&& (califa <= 88)){
      System.out.println("Tienes una C");
      }else if((califa >= 60)&& (califa <= 69)){
      System.out.println("Tienes una D");
      }else if((califa >= 0)&& (califa <= 59)){
      System.out.println("Tienes una F");
      
      
      
  }
      
      
      
  }}
    
     

    
 
    
    

