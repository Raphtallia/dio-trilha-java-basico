import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência.");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o dígito da Agência.");
        int dígito = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta.");
        String conta = scanner.next();

        System.out.println("Por favor, digite o valor de saldo bancário.");
        double saldo = scanner.nextDouble();
            

        System.out.println("Olá, " + nome + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta, " + conta +"-" + dígito + " e seu saldo " + saldo + " já está disponível para saque." );
        
  
    }
}
