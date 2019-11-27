package primoapp;
import java.util.Scanner;

public class PrimoApp {

        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            System.out.println("Introduce un número");
            int numero = teclado.nextInt();
            
            //Un número negativo, el 0 y el 1, son directamente no primos.
            if (numero <= 1){
                System.out.println("El número " + numero + " no es primo");
                
            } else{
                //Hacemos un casting para que nos devuelva un número entero.
                int raiz = (int) Math.sqrt(numero);
                int contador = 0;
                
                //Contamos el número de divisibles.
                for (int i = raiz; i > 1; i--){
                    if (numero % i == 0){
                        contador++;
                        
                    }
                }
                /*Según el número de divisibles, sabemos si es primo o no.
                    *Si es primo el contador será 0.
                */
                //Mensaje de traza
                System.out.println(">>" + contador);
                if (contador < 1){
                    System.out.println("El número " + numero + " es primo");
                } else{
                    System.out.println("El número "+ numero + " no es primo");
                }
                
            }
       
    }
    
}
