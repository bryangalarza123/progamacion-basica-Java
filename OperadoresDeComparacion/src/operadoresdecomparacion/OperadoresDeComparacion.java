
package operadoresdecomparacion;
import java.util.Scanner;

public class OperadoresDeComparacion {

    public static void main(String[] args) {
        
        Scanner numA = new Scanner(System.in);
        System.out.println("introdusca un numero: ");
        int num1 = numA.nextInt();
        
        Scanner numB = new Scanner(System.in);
        System.out.println("intodusca el segundo numero: ");
        int num2 = numB.nextInt();
        
        if(num1 < num2){
            System.out.println("el numero: "+ num1+ " < "+ num2 );
        }
        else if(num1 == num2 ){
            System.out.println("el numero: "+ num1 +" = "+ num2);
        }
        
        else if(num1 > num2){
            System.out.println("el numero: "+ num1+ " > "+ num2 );
        }
        else if(num1 <= num2){
            System.out.println("el numero: "+ num1 +" <= "+ num2);
        }
        
        else if(num1 >= num2){
            System.out.println("el numero: "+ num1 +" >= "+ num2);
        }
        else{   
            System.out.println("el numero: "+ num1 +" != "+ num2);
        }
                
         
    }
    
}
