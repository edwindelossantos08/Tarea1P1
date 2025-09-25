
package numerospareswhile;

public class NumerosParesWhile {

  
    public static void main(String[] args) {
        //4. Realizar un programa que imprima los números pares del 2 al 100 utilizando ciclos "while".
        System.out.println("Even numbers from 1 to 100:");
        
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
        }
            i++;
       
        }
    }
}

