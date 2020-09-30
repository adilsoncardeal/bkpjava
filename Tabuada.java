import java.util.Scanner;
public class Tabuada{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numaro da tabuada");
        int num = teclado.nextInt();
        int contador;

        contador = 1;
        while(contador <=10){
        System.out.println(num + " x "+contador+" = "+(num*contador));
            contador = contador + 1;
            
        }
    }
}        
