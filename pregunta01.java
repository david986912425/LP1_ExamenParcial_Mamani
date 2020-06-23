
package PREGUNTA;
import java.util.Scanner;

public class PREGUNTA01 {
     public static void main(String[] args){
    Scanner lector = new Scanner(System.in);
    int a = 0, i, numero;
    System.out.println("Ingrese un numero");
    numero = lector.nextInt();
    for (i = 1; i <= numero; i++){
        if (numero % i == 0){
            a++;
        }
    }
    if (a != 2){
        System.out.println("No es Primo");
    }else{
        System.out.println("Si es Primo");
    }
}
}
