import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X; 
        float Y, MEDIA;
        
        X = teclado.nextInt(); 
        Y = teclado.nextFloat();
        
        MEDIA = X / Y;

        System.out.printf("%.3f Km/l\n",MEDIA);
    }
}
