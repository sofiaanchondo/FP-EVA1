/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_19_ANTRO {
    final static String INE = "si";
    final static String EDAD = "si";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
         String edad, ine;
        Scanner input =  new Scanner (System.in);
        System.out.println("--BIENVENIDO--");
        System.out.println("Antro");
        System.out.print("Eres mayor de edad?: ");
        edad = input.nextLine();
        System.out.println("Tienes Ine: ");
        ine= input.nextLine();
        if (edad.equals(EDAD)){ 
         
            if (ine.equals(INE)){
           System.out.println("ACCESO CONCEDIDO!");
           }else{
             System.out.println("ACCESO DENEGADO!");   
            }
        }else{
            System.out.println("ACCESO DENEGADO!");
    }
    
        }}
