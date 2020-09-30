import java.util.Scanner;
public class Exercicio2{
    public static void main(String args[]){
        Scanner teclado; // declarei componente tipo Scanner(chamei de teclado)
        teclado = new Scanner(System.in);
        int valor1;
        System.out.println("Base:");
        valor1 = teclado.nextInt();

        System.out.println("Base = " + valor1);

        float valor2;
        System.out.println("Altura:");
        valor2 = teclado.nextFloat();
        System.out.println("Altura = " + valor2);

        System.out.println("Area = " + valor1 * valor2/2);
    }

}