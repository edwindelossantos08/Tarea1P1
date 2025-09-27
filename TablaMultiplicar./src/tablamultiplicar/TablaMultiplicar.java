
package tablamultiplicar;

public class TablaMultiplicar {

    public static void main(String[] args) {
        //6. Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.
        
        int numero = 6;
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
       
        
    }
    
}
