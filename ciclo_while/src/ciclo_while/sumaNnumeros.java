
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
    
    int cont = 1;
    int suma = 0;
    
    while(cont <= numero){
        
        suma = suma + cont;
        cont = cont + 1;
        
        
    }
    
    System.out.println("La suma de 0 hasta " + numero + " es " + suma);
    
    
}

    
}
