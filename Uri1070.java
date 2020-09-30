import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        int impares;

        X = teclado.nextInt();
        if (X % 2 == 0){
            X++;
        }
        for (int contador = 1; contador <= 6; contador = contador+1){
            System.out.println(X);
            X = X + 2;

        }
    }
}
