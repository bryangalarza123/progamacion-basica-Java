
package javaapplication20;


import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        System.out.println("ingrese su edad: ");
        Scanner Edad = new Scanner(System.in);
        int seleccion = Edad.nextInt();
        
        int EdadLimite=18;
        
        if ( seleccion >= EdadLimite){
            System.out.println("ustes es mayor de edad");
        } 
        
        else{
            System.out.println("usted es menor de edad");
        }
        
        
    }
    
   
    
    
}
