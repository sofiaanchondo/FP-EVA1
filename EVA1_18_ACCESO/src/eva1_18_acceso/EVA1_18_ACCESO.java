/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA1_18_ACCESO {
    final static String USUARIO = "sofia";
    final static String PWD = "1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES:idinteficadores que no pueden
        //CAMBIAR ES EL VALOR ES CON LA PALABRA FINAL
        //
        String usuario, contraseña;
        Scanner input =  new Scanner (System.in);
        System.out.println("--BIENVENIDO--");
        System.out.println("Sistema de venta");
        System.out.print("Usuario: ");
        usuario = input.nextLine();
        System.out.println("Contraseña: ");
        contraseña = input.nextLine();
        if (usuario.equals(USUARIO)){ //COMPARAR CADENAS
        
            if (contraseña.equals(PWD)){ //COMPARAR CADENAS
           System.out.println("ACCESO CONCEDIDO!");
        }else{
            System.out.println("ACCESO DENEGADO!");
            
            
            
            
                     
            
            
        }
        
        
    }}}
    

