
package ciclo_while;

import java.util.Scanner;

/*

obtener la suma de los primeros N numeros naturales positivos

*/

public class sumaNnumeros {

public static void main(String... andres){
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite hasta que numero positivo se va a realizar la suma");
    int numero = sc.nextInt();
    
    int cont = 0;
    int suma = 1;
    
    while(suma <= numero){
        
        cont = cont + suma;
        suma = suma + 1;
        
    }
    
    System.out.println("La suma de 0 hasta " + numero + " es " + cont);
    
    
}

    
}
