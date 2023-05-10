import java.util.Scanner;

public class ClasseMath {
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 5;
        float m = n1 + n2/2;
        System.out.println("Resposta: "+m);
        int numero = 5;
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
        int num1 = 4;
        int num2 = 6;
        num1 += num2;
        System.out.println("Resposta num: "+num1);
        num1 -= num2;
        System.out.println("Resposta num: "+num1);
        num1 *= num2;
        System.out.println("Resposta num: "+num1);
        num1 /= num2;
        System.out.println("Resposta num: "+num1);
        System.out.println("PI: "+Math.PI);
        int numero1 = (int) Math.pow(2,2);
        int numero2 = (int) Math.sqrt(36);
        System.out.println(numero1);
        System.out.println(numero2);
        /*
        abs -> Valor Absoluto ex: Math.abs(-10) = 10
        floor -> Arredonda para Baixo ex: Math.floor(3.9) = 3
        ceil -> Arredonda para Cima ex: Math.ceil(4.2) = 5
        round -> Arredonda Aritmeticamente ex Math.round(5.6) = 6
         */
        int numaleatorio = (int) Math.random();//Numeor aleatorio de 0 a 1
        System.out.println(numaleatorio);
        int numale = (int) (5 + numaleatorio * (10-5));
        System.out.println(numale);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int numtecl = teclado.nextInt();
        float aux;
        aux = numtecl % 2;
        System.out.println("Resto da Divisão por 2: "+aux);
        aux = (int) Math.pow(numtecl,3);
        System.out.println("Elevado ao Cubo: "+aux);
        aux = (float) Math.sqrt(numtecl);
        System.out.printf("Raiz Quadrada: %.2f\n",aux);
        aux = (float) Math.cbrt(numtecl);
        System.out.printf("Raiz Cubica: %.2f\n",aux);
        aux = (int) Math.abs(numtecl);
        System.out.println("Valor Absoluto: "+aux);
    }
}
