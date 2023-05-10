import java.util.Scanner;

public class Metodos {
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("Soma é: "+s);
    }
    static int multcomretorno(int a, int b){
        int s = a * b;
        return (s);
    }
    public static void main(String[] args){
        soma(2,2);
        int s = multcomretorno(2,5);
        System.out.println("Mult: "+s);
        PublicFuncao.fatorial();
    }
}
