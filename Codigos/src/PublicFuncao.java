import java.util.Scanner;

public class PublicFuncao {
     static void fatorial(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número que deseja fazer um Fatoria dele: ");
        int n = teclado.nextInt();
        if (n!=-1){
            int cont=1, r=1;
            while (cont<=n){
                r=cont*r;
                cont++;
            }
            System.out.print("O numero "+n+" Fatoriado é:");
            cont = 1;
            while (cont<=n){
                if (cont!=n){
                    System.out.print(" "+cont+" x");
                }
                else {
                    System.out.println(" "+cont);
                }
                cont++;
            }
            System.out.println("Que faz o resultado ser "+r);
        }
    }
}
