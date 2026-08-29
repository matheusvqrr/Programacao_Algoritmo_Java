import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner InUser = 
    System.out.println("""
            Seja bem vindo a nossa casa de shows

            Responda as perguntas abaixo antes de continuar
            """);
            System.out.println("informe a sua idade");
            int idade = InUser.nextInt();

            if(idade <18);
            System.out.println("Você é menor de Idade e não poderá entrar na festa");
            System.out.println("""
                    Você tem o ingresso?
                    1 - sim
                    2 - não
                    """;);
int ingresso = InUser.nextint();

InUser.close();

 }
}
