import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        //int valor;
        N = teclado.nextInt();
        if ( 5 < N  && N < 2000){

        }

        for (int valor = 1; valor < 5; valor = valor+2){
            N = N ^ 2;
            System.out.println(N);
        }


    }

}
