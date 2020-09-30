import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        int par   = 0;
        int impar = 0;
        int posit = 0;
        int negat = 0;
        

        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                par++;
            }
            else {
                impar++;
            }
            if (valor > 0){
                posit++;
            }
            else if (valor < 0){
                negat++;
            }
            
        }   
        System.out.println(par+" valor(es) par(es)"); 
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(posit+" valor(es) positivo(s)");
        System.out.println(negat+" valor(es) negativo(s)");
    }
}
