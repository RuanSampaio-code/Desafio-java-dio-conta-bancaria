import java.util.Scanner;
  import java.util.Locale; // Importe a classe Locale

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    //System.out.println("Hello, World!");
    //todo: conhecern e importa a classe scanner
    //exibir as msgs para usuariuo
    //obter pela classe scanner os vvalores digitados no terminal
    //em seguida mostrar as mensagens
    
    Scanner sc = new Scanner(System.in);

    // Defina a localização para usar o ponto como separador decimal
    sc.useLocale(Locale.US);
    
    System.out.println("Informe seu nome");
    String nome = sc.nextLine();

    System.out.println("Por favor, digite o número da Agência !");
    String agencia = sc.nextLine();

    System.out.println("Por favor, digite o número da conta !");
    int conta = sc.nextInt();

    System.out.println("Por favor, digite o saldo da conta !");
    float saldo = sc.nextFloat();


    //mensagem final
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
    ", conta" + conta + " e seu saldo R$ " + saldo +" já está disponível para saque");


    sc.close();
    
    }
}
