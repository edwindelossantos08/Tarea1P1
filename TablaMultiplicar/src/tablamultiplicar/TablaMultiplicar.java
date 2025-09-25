

package tablamultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        //6. Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.
        
        //Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
       //Solicitamos al usuario el numero de la tabal de multiplicar
       System.out.println("Ingrese el numeor para generar su tabla de multiplicar: ");
       int num = scanner.nextInt();
       
       //Imprimo la tabla
       System.out.println("Tabla de multiplicar del " + num + ":");
       for (int i = 1; i <12; i++){
           System.out.println(num + " x " + i + " = " + (num * i));
       }
       //Cerramos el Scanner
       scanner.close();
    }
    
}
