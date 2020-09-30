import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, NUMBER;
        double C, SALARY;


        A = teclado.nextInt(); //Numero funcionario
        B = teclado.nextInt(); // Horas trabalhadas
        C = teclado.nextDouble(); // Valor por Hora
       

        NUMBER = A;
        SALARY = (B * C);

        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);

    }
}