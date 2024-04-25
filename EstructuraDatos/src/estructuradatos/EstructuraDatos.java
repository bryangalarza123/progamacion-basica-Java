
package estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class EstructuraDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Salir = false;
        
        while(!Salir){
            
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HasMap");
            System.out.println("4.- Salir");
            
            System.out.print("Ingrese una opcion: ");
            int Opcion = scanner.nextInt();
            
            
            switch (Opcion) {
                case 1:
                    System.out.println("Bienvenido a la ED Array");
                    int[] edades = {12,40,30,50,7,5,60,70,100};
                    String[] nombres = {"Daniel","Marcos","Diego","Ariel"};
                    
                    
                    //Longitud de Array
                    System.out.println("Longitud edades: "+edades.length);
                    System.out.println("Longitud nombres: "+nombres.length);
                    
                    //Cambiar un valor
                    edades[1] = 38;
                    System.out.println("Nuevo dato edad: " +edades[1]);
                    nombres[3] = "David";
                    System.out.println("Nuevo dato nombre: "+nombres[3]);
                    
                    //Conver tir un Array a string
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                    
                    //Clonar
                    int[] edadesClon = edades.clone();
                    System.out.println("Array clonado: "+ Arrays.toString(edadesClon));
                    
                case 2:
                    System.out.println("bienvenido a Array List");
                    
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    
                    //Agregar datos a la lista
                    ListaNombres.add("David");
                    ListaNombres.add("Marco");
                    ListaNombres.add("Julio");
                    
                    //Longitud de la lista
                    System.out.println("Tamaño de la lista: "+ListaNombres.size());
                    
                    //Remover un elemento de la lista
                    //ListaNombres.remove(2);
                    
                    //Obtener un elemento de una lista 
                    //ListaNombres.get(2);
                    
                    System.out.println("Elemento obtenido: "+ListaNombres.remove(2)+ListaNombres.get(1));
                   
                    //Comprobar si la lista esta vacia
                    System.out.println("Lista vacia: "+ListaNombres.isEmpty());
                    
                    //Comprobar si un elemento existe
                    System.out.println("Existe: "+ListaNombres.contains("David"));
                    
                case 3:
                    System.out.println("bienvenido a Array HasMap");
                    break;
                default:
                    throw new AssertionError();
            }
        }
        scanner.close();
    }
    
}
