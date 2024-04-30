package operadoresaritmeticos;
import java.lang.Math;
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Incremento
        
        //variableUno = variableUno + 1;
        
        variableUno++;
        
        System.out.println("incremento: " + variableUno);
        
        //Decremento 
        
        //variableDos = variableDos -1;
        
        variableDos--;
        
        System.out.println("Decremento: " + variableDos);
        
        
        double suma = variableUno + variableDos;
        double resta = variableUno - variableDos;
        double multiplicacion = variableUno * variableDos;
        double division = variableUno / variableDos;
        double modulo = variableUno % variableDos;
        
        
        System.out.println("la suma de la variable Uno y la variable 2 es: " + suma);
        System.out.println("la resta de la variable Uno y la variable 2 es: " + resta);
        System.out.println("la miltiplicacion de la variable Uno y la variable 2 es: " + multiplicacion);
        System.out.println("la division de la variable Uno y la variable 2 es: " + division);
        System.out.println("la modulo de la variable Uno y la variable 2 es: " + modulo);
        //Bryan Max Checalla Galarza
    }
}
