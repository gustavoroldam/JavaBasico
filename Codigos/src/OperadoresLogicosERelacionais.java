import java.util.Scanner;

public class OperadoresLogicosERelacionais {
    public static void main(String[] args){
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?n1:n2;
        System.out.println(r);
        r = (n1<n2)?n1:n2;
        System.out.println(r);
        r = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r);
        /*
        > -> Maior Que
        < -> Menor Que
        >= -> Maior ou Igual (>,=)
        <= -> Menor ou Igual (<,=)
        == -> Igual
        != -> Diferente (=,!)

        && -> E
        || -> Ou
        ^ -> XOU --> "Ou é uma ou exclusivamente a outra"
        ! -> Não
         */
        String nome1 = "gustavo";
        String nome2 = "gustavo";
        String nome3 = new String("gustavo");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        int x , y , z;
        x = 4;
        y = 7;
        z = 12;
        boolean resp;
        resp = (x<y && y<z)? true:false;
        System.out.println(resp);
        resp = (x<y || y<z)? true:false;
        System.out.println(resp);
        resp = (x<y ^ y<z)? true:false;
        System.out.println(resp);
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        while (cont == 0){
            double numal = 1 + Math.random() * (5-1);
            int numa = (int) numal;
            System.out.print("Estou pensando em um número de 1 a 5 vc consegue acertar: ");
            int n = teclado.nextInt();
            boolean resposta = (n == numa)? true:false;
            if (resposta == true){
                System.out.println("Parabens vc acertou...");
            }
            else {
                System.out.println("Vc errou era "+numa);
            }
        }
    }
}
