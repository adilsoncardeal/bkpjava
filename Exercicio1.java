import java.util.Scanner;
public class Exercicio1{
    public static void main(String args[]){
        Scanner teclado; // declarei componente tipo Scanner(chamei de teclado)
        teclado = new Scanner(System.in);
        
        float valor2;
        System.out.println("lado:");
        valor2 = teclado.nextFloat();
        System.out.println("lado = " + valor2);

        System.out.println("Area = " + valor2 * valor2);
    }

}