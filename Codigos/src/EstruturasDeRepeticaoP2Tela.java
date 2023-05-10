import javax.swing.*;
import java.util.Scanner;

public class EstruturasDeRepeticaoP2Tela {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //JOptionPane.showMessageDialog(null,"Ola.Mundo","Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Prolema","Boas Vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Erro","Boas Vindas", JOptionPane.ERROR_MESSAGE);
        int n, s=0,t=0,tp=0,ti=0,ac=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero(0 para parar): ","Programa de Soma",JOptionPane.INFORMATION_MESSAGE));
            s += n;
            if (n!=0){
                t++;
                if(n%2==0){
                    tp++;
                }
                else {
                    ti++;
                }
                if(n>100){
                    ac++;
                }
            }
        }while (n!=0);
        JOptionPane.showMessageDialog(null,"<html>Resultado Final<br>-----------------------------------<br>Total de valores: "+t+"\nTotal de Pares: "+tp+"\nTotal de Impares: "+ti+"\nAcima de 100: "+ac+"\nMédia dos valores: "+s/t+"\nSoma: "+s,"Resposta",JOptionPane.INFORMATION_MESSAGE);
    }
}