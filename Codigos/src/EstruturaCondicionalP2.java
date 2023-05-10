import java.util.Scanner;

public class EstruturaCondicionalP2 {
    public static void main(String[] args){
        /*
        if(CONDIÇÃO){
        }
        else if(CONDIÇÃO){
        }
         */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de pernas disponiveis: ");
        int nump = teclado.nextInt();
        switch (nump){
            case 1 :
                System.out.println("Saci");
                break;
            case 2 :
                System.out.println("Bípede");
                break;
            case 4 :
                System.out.println("Quadrúpede");
                break;
            case 6 :
                System.out.println("Aranha");
                break;
            case 8 :
                System.out.println("Aranha");
                break;
            default:
                System.out.println("ET");
                break;
                
        }
    }
}
