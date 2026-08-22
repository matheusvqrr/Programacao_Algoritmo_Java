import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   Scanner InUser = new Scanner (System.in);

double largura, comprimento, area;

   System.out.println("Seja bem vindo a nossa loja");
   System.out.println("Qual a largura do terreno?");
   System.out.println("Qual o comprimento do terreno?");
   largura = InUser.nextDouble();
   comprimento = InUser.nextDouble();

   area = largura*comprimento;
   System.out.println("A area do seu terreno é:" + area);
   System.out.println();

   InUser.close();   
   
    }
}
