import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //float nota = 8.5f;
        //String nome = "Gustavo";
        //System.out.println("A nota é: "+nota);
        //System.out.printf("A nota é %.2f \n",nota);
        //System.out.printf("A nota do %s é %.2f\n",nome,nota);
        //System.out.format("A nota do %s é %f\n",nome,nota);
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota2 = teclado.nextFloat();
        System.out.format("A nota do %s é: %.2f \n",nome2,nota2);
        */
        int  idade = (int) 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
    }
}