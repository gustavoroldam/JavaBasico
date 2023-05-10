import java.util.Scanner;

public class EstruturasCondicionaisP1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1+nota2)/2;
        if (media>=9){
            System.out.print("Parabéns sua ");
        }
        System.out.println("Média é: "+media);
        System.out.print("Digite o ano que você nasceu: ");
        int nasc = teclado.nextInt();
        int I = 2023 - nasc;
        if(I>=18){
            System.out.println("Maior");
        }
        else{
            System.out.println("Menor");
        }
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        if (num%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
        System.out.print("Digite sua idade: ");
        int id = teclado.nextInt();
        if (id>=18){
            if (id<=70){
                System.out.println("Obrigatório");
            }
            else{
                System.out.println("Opcional");
            }
        }
        else{
            if (id>=16){
                System.out.println("Opcional");
            }
            else{
                System.out.println("Não Vota");
            }
        }
    }
}
