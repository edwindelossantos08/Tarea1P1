
package numerosimparesfor;

public class NumerosImparesFor {

   
    public static void main(String[] args) {
        //3. Realizar un programa que imprima los números impares del 1 al 100 utilizando ciclos "for".
        System.out.println("Odd numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    
}
