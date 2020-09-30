import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        int qtde100, qtde50, qtde20, qtde10, qtde5, qtde2, qtde1;
        int resto;
        
        valor = teclado.nextInt();
      
        qtde100 = valor / 100;
        resto = valor % 100;

        qtde50 = resto / 50;
        resto = resto % 50;

        qtde20 = resto / 20;
        resto = resto % 20;

        qtde10 = resto / 10;
        resto = resto % 10;

        qtde5 = resto / 5;
        resto = resto % 5;

        qtde2 = resto / 2;
        resto = resto % 2;

        qtde1 = resto / 1;
        resto = resto % 1;
          
        System.out.println(valor);
        System.out.println(qtde100 + " nota(s) de R$ 100,00");
        System.out.println(qtde50 + " nota(s) de R$ 50,00");
        System.out.println(qtde20 + " nota(s) de R$ 20,00");
        System.out.println(qtde10 + " nota(s) de R$ 10,00");
        System.out.println(qtde5 + " nota(s) de R$ 5,00");
        System.out.println(qtde2 + " nota(s) de R$ 2,00");
        System.out.println(qtde1 + " nota(s) de R$ 1,00");

    }
}
