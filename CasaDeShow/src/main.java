
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author joaoc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int ingresso, bebida;
        float preco;
        String diaShow, nomeCantor, op = "n";
        
        System.out.println("=====================\n");
        System.out.println("\nCasa de show SP\n");
        System.out.println("=====================\n\n");
        
        System.out.println("Bebidas disponiveis\n");
        System.out.println("0 - Não vai beber\n");
        System.out.println("1 - Choop R$ 10,00\n");
        System.out.println("2 - Caipirinha R$ 18,00\n");
        System.out.println("3 - Vodka R$ 100,00 - Somente para ingresso VIP\n");
        System.out.println("================================================\n\n");
        
        do{
            System.out.println("Qual ingresso você deseja: 1 == comum | 2 == VIP\n");
            ingresso = ler.nextInt();
            System.out.println("Informe o dia do show -> \n");
            diaShow = ler.next();
            System.out.println("Informe o nome do cantor -> \n");
            nomeCantor = ler.next();
            System.out.println("Informe o preço do ingresso -> \n");
            preco = ler.nextFloat();
            System.out.println("Informe a bebida -> \n");
            bebida = ler.nextInt();
            
            IngressoComum ing = new IngressoComum(ingresso, bebida, diaShow, nomeCantor, preco);
            
            System.out.println("Deseja vender outro ingresso? [S] [N]\n");
            op = ler.next();
        }while(op.equals("s"));
    }
    
}
