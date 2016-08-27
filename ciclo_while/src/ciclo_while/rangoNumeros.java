
package ciclo_while;

import java.util.Scanner;

/*

dado un rango de numeros enteros, obtener la cantidad de numeros enteros que contiene

*/

public class rangoNumeros {

public static void main(String... andres){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite primer numero");
    int num1 = sc.nextInt();
    System.out.println("Digite segundo numero");
    int num2 = sc.nextInt();
    
    int i = 0;
    int cont = 0;
    
    i = num1 + 1;
    
    while(i < num2){
        
        cont = cont + 1;
        i = i + 1;
        
    }
    
    System.out.println("la cantidad de numeros entre " + num1 + " y " + num2 + " es " + cont);
    
}
    
}
