import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
   Scanner inUser = new Scanner (System.in);
double refri = 7;
double burguer = 18;

System.out.println("Seja bem vindo a nossa lanchonete");
System.out.println("Quantos hamburgueres você deseja?");
int qtd_burguer = inUser.nextInt();
System.out.println("Quantos refrigerantes você deseja?");
int qtd_refri = inUser.nextInt();
System.out.printf("Você escolher %d burguer, %d refrigerantes.\n", qtd_burguer, qtd_refri);
System.out.printf("O valor total da sua compra é %.2f", (qtd_burguer*burguer) + (qtd_refri*refri));


inUser.close();
    }
}
