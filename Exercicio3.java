import java.util.Scanner;
public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado; // declarei componente tipo Scanner(chamei de teclado)
        teclado = new Scanner(System.in);
        int valor1;
        System.out.println("Base Maior:");
        valor1 = teclado.nextInt();

        System.out.println("Base Maior = " + valor1);

        int valor2;
        System.out.println("Base Menor:");
        valor2 = teclado.nextInt();

        System.out.println("Base Menor = " + valor2);

        float valor3;
        System.out.println("Altura:");
        valor3 = teclado.nextFloat();
        System.out.println("Altura = " + valor3);

        System.out.println("Area = " + (valor1 + valor2)*valor3/2);
    }

}