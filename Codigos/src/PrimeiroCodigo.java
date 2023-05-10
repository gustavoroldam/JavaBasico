import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class PrimeiroCodigo {
    public static void main(String[] args){
        System.out.print("Hello Word");
        System.out.println("\nOla mundo");
        Date data = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(data.toString());
        Locale ling = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(ling.getDisplayLanguage());
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension dimensao = tela.getScreenSize();
        System.out.println("A resolução do sistema é: " + dimensao.width + "x" + dimensao.height);
        System.out.println("Soma de 1+1: " + (1+1));
    }
}
