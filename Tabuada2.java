
import java.util.Scanner;
public class Tabuada2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, contador;
        
        System.out.println("Digite o numaro da tabuada");
        num = teclado.nextInt();
        contador = 1;
        do{
            System.out.println(num + " x "+contador+" = "+(num*contador));
            contador = contador + 1;

        } while(contador <=10);
    }  
}      