import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      
        
       System.out.print("Por favor, digite o seu nome : ");   
        String nomeCliente = sc.nextLine();
       System.out.print("Por favor, digite o número da agência : ");
         String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da conta : ");
         int numeroConta = sc.nextInt();
         System.out.print("Por favor digite o saldo : ");
         double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
 
        sc.close();
    }
}
