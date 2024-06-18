package primeiroprojetopraticocontabancariasimples;

/**
 * @author Richard Rodrigues Abreu - DIO
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String args[]) throws Exception{
        //TODO: Conhecer e importar a classe scanner (Pronto) (V)
        //Exibir as mensagens para o usuário                  (V)
        //Obter pela Scanner os valores digitados no terminal (V)
        //Exibir a mensagem criada                            ()
        
        //Constroi um novo Scanner no sistema e usa a localidade US e pegando as informações via terminal Scan
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero da Conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Digite sua Agencia: ");
        String nomeAgencia = scan.next();
        
        System.out.println("Digite seu Nome: ");
        String nomeCliente = scan.next();
        
        System.out.println("Digite o saldo da Conta: ");
        float saldoConta = scan.nextFloat();
        
        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco!, Sua agencia é "
                + nomeAgencia + ", Conta " + numeroConta + " e seu saldo" + saldoConta + " já está disponível para saque");
    }
}
