/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_17_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
 Scanner captu = new Scanner (System.in);
 System.out.println("Introduzca un mes del año (1 al 12)");
 mes = captu.nextInt();
 if (mes == 1) {
     System.out.println("enero");
 }else if (mes == 2) {
     System.out.println("febrero");
 }else if (mes == 3) {
     System.out.println("Marzo");
 }else if (mes == 4) {
     System.out.println("abril");
 }else if (mes == 5) {
     System.out.println("mayo");
 }else if (mes == 6) {
     System.out.println("junio");
     }else if (mes == 7) {
     System.out.println("julio");
     }else if (mes == 8) {
     System.out.println("agosto");
     }else if (mes == 9) {
     System.out.println("septiembre");
     }else if (mes == 10) {
     System.out.println("octubre");
     }else if (mes == 11) {
     System.out.println("noviembre");
     }else if (mes == 12) {
     System.out.println("diciembre");
     }else{
     System.out.println("Numero no valido");
    }
    }
}
