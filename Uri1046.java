import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int HI, HF, DURACAO;

        HI = teclado.nextInt();
        HF = teclado.nextInt();
        DURACAO = HF - HI;

        if (DURACAO <= 0){
            DURACAO = DURACAO + 24;
        }
        System.out.println("O JOGO DUROU "+DURACAO+" HORA(S)");
    
    }    
} 
 
