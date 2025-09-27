
package mayormenor;

public class MayorMenor {

    public static void main(String[] args) {
        //7. Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos
         
        int num1 = 15;
        int num2 = 27;
        
        if (num1 > num2){
            System.out.println("El mayor es: " + num1);
             System.out.println("El menor es: " + num2);
        }else if (num2 > num1){
            System.out.println("El mayor es: " + num2);
             System.out.println("El menor es: " + num1);
    } else{
        System.out.println("Ambos numero son iguales.");
    }
    
}
}