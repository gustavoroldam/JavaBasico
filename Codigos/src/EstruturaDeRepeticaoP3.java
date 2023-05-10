import javax.swing.*;
import java.util.Scanner;

public class EstruturaDeRepeticaoP3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        for(int cc = 0; cc<4; cc++){
            System.out.println("Cambalhota");
        }
        for(int cc = 0; cc<=100; cc+= 10){
            System.out.println(cc);
        }
        System.out.print("Digite o Inicio(0-5): ");
        int n = teclado.nextInt();
        System.out.print("Digite o Fim(6-20): ");
        int n2 = teclado.nextInt();
        System.out.print("Digite o Passo(1-10): ");
        int n3 = teclado.nextInt();
        for (int num = n;num<=n2;num+=n3){
            System.out.println(num);
        }
    }
}