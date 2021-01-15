package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int a = 0 , b = 0;
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingrese el primer numero");
        a = Entrada.nextInt();
        
        System.out.println("Porfavor Ingrese el segundo numero");
        b = Entrada.nextInt();
        
        if (a > b){ 
        System.out.println("El numero mayor es: " + a);
        } if (b > a){ 
        System.out.println("El numero mayor es: " + b);
        } if (a == b){ 
        System.out.println("Ambos numeros son iguales");
        }
 
        


    }
}
