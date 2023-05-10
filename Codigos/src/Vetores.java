import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n[] = new int[4];
        //int n[] = {3,2,4,1};
        System.out.println("Total de casa de n é: "+n.length);
        for (int i=0; i<n.length; i++){
            System.out.print("Digite um valor: ");
            n[i] = teclado.nextInt();
        }
        for (int i=0; i<4; i++){
            System.out.println((i+1)+"- "+n[i]);
        }
        for (int valor: n){
            System.out.println("Valor: "+valor);
        }
        Arrays.sort(n);
        for (int valor: n){
            System.out.println("Valor 2: "+valor);
        }
        int pos = Arrays.binarySearch(n, 4);
        System.out.println("Encontrei na posição: "+pos);
        Arrays.fill(n,200); //Muda todos os valores do vetor para um numero (0)
        for (int v:n){
            System.out.println(v);
        }
        float v[] = new float[10];
        int sair=0;
        int i;
        Arrays.fill(v,0);
        while (sair==0){
            for (i=0; i<v.length; i++){
                System.out.println((i+1)+"- "+v[i]);
            }
            System.out.print("Digite a posição que deseja adicionar um numero(0 para ordernar): ");
            i = teclado.nextInt();
            i--;
            if (i==-1){
                Arrays.sort(v);
            }
            else {
                System.out.print("Digite o valor a adicionar: ");
                v[i] = teclado.nextFloat();
            }
        }
    }
}
