
package ciclo_while;

import java.util.Scanner;


public class Ciclo_while {

    
    public static void main(String[] args) {
        
      /*  int a = 0;
 
        while(a < 10){
            
            System.out.println("blucle hasta 10");
            a++;
            
        }*/
      
        Scanner sc = new Scanner(System.in);

        String nombre = "";
        
        while(!nombre.equalsIgnoreCase("andres")){
                  
            System.out.println("Digite el nombre andres");
            nombre = sc.next();
            System.out.println("Usted no es andres, usted es " + nombre);
        }

        System.out.println("Hola " + nombre);
    }
    
}
