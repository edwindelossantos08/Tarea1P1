
package mayormenor;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        //7. Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.
        
        Scanner scanner = new Scanner(System.in);
         int num1;
         int num2;
         
        //Solicitamos al usuario los numeros
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        
        //Comparamos los dos numeros y determinamos cual es mayor o menor
        if (num1 > num2){
            System.out.println("El numero mayor es: " + num1);
            System.out.println("El numero menor es: " + num2);
        }else if (num2 > num1){
            System.out.println("El numero mayor es: " + num2);
            System.out.println("El numero menor es: " + num1);
        }else {
            System.out.println("Ambos numero son iguales. ");
        }
        
        //Cierro scanner
        scanner.close();
    }
    
}
