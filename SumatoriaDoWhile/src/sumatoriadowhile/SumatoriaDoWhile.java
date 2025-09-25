
package sumatoriadowhile;

public class SumatoriaDoWhile {

    public static void main(String[] args) {
        // 5. Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
         int sum = 0;
         int i = 1;
         
         do {
             sum += i;
             i ++;
         } while (i <= 50);
         
         System.out.println("La sumatoria de los numeros del 1 al 50 es:" + sum);
    }
    
}
