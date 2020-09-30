import java.util.Scanner;
public class Exercicio{
    public static void main(String args[]){
        Scanner teclado; // declarei componente tipo Scanner(chamei de teclado)
        teclado = new Scanner(System.in);
        int valor1;
        System.out.println("Digite valor");
        valor1 = teclado.nextInt();

        System.out.println("Digitou valor = " + valor1);

        float valor2
        System.out.println("Novo valor:");
        valor2 = teclado.nextFloat();
        System.out.println("Digitou valor = " + valor2);

        System.out.println(valor1 * valor2);
    }

}