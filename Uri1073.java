import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        int quadrado = 0;
        //int valor;
        N = teclado.nextInt();

       
        for (int contador = 1; contador <= N; contador = contador+1){
            
            if (contador % 2 == 0){
                quadrado = contador * contador;
                System.out.println(contador+ "^2 = "+quadrado);
            }
                        
        }


    }

}
