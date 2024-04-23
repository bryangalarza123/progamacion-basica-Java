
package operadores.logicos;

public class OperadoresLogicos {

  
    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //Operador AND (&&)
        
        boolean resultadoAnd = esVerdadero && esFalso;
        
        System.out.println("AND: " + resultadoAnd);
        
        //operador OR (||)
        
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("OR: " + resultadoOr);
        
        //operador NOT(=!)
        
        boolean resultadoNot = !esVerdadero;
        System.out.println("NOT: " + resultadoNot);
    }
    
}
