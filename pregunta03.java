
package ejercicio;

import java.util.Scanner;
public class pregunta03 {

    public static void main(String[] args){
        int cantidadDeEspacios = 0;
        Scanner lector=new Scanner(System.in);
        String cadena="";
        char [] Arraycadena;
        char caracter;
        System.out.println("escribe");
        cadena = lector.nextLine();
        Arraycadena = cadena.toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') cantidadDeEspacios++;
        }
        
        
        System.out.println(""+(Arraycadena.length-cantidadDeEspacios));
        
  
    }

}

   
