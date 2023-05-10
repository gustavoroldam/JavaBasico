import java.util.Scanner;

public class EstruturasDeRepeticaoP2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cc = 0;
        do{
            System.out.println("Cambalhota");
            cc++;
        }while (cc<4);
        int num,soma=0;
        String resp;
        do {
            System.out.print("Digite um numero: ");
            num = teclado.nextInt();
            soma += num;
            System.out.print("Quer continuar(S/N): ");
            resp = teclado.next();
        }while (resp.equals("S"));
        System.out.print("Soma: "+soma);
        int n,t=0,tp=0,ti=0,s=0,ac=0;
        do {
            System.out.print("Digite um numero(0 para sair): ");
            n = teclado.nextInt();
            s += n;
            if(n!=0) {
                t++;
                if (n % 2 == 0) {
                    tp++;
                } else {
                    ti++;
                }
                if (n > 100) {
                    ac++;
                }
            }
        }while (n!=0);
        System.out.print("Total de valores: "+t+"\nTotal de Pares: "+tp+"\nTotal de Impares: "+ti+"\nAcima de 100: "+ac+"\nMédia dos valores: "+s/t);

    }
}
