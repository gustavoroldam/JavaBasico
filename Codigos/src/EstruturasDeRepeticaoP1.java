import java.util.Scanner;

public class EstruturasDeRepeticaoP1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cc = 0;
        while (cc<4){
            System.out.println("Cambalhota");
            cc++;
        }
        cc = 0;
        while (cc<4){
            cc++;
            if(cc == 1 || cc==2){
                continue;
            }
            System.out.println("Pulo");
        }
        cc=0;
        while (cc<4){
            if (cc==3){
                break;
            }
            System.out.println("Salto");
            cc++;
        }
        int sair = 0;
        while (sair==0){
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
            else {
                sair = 1;
            }
        }
    }
}
