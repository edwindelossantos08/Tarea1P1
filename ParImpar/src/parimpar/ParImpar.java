
package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        // 8. Realizar un programa que ingresado un numero, me indique si es par o impar.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero " + num + " es PAR.");
           
        }else {
            System.out.println("El numero " + num + " es IMPAR.");
        }
        
        scanner.close();
    
    }
}
