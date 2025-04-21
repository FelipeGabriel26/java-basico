import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
            // Criação do objeto Scanner para leitura do terminal
            Scanner scanner = new Scanner(System.in);
    
            // Declarando as variáveis conforme os atributos mencionados
            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;
    
            // Solicitando os dados do usuário
            System.out.println("Por favor, digite o número da Conta!");
            numeroConta = scanner.nextInt(); // Leitura do número da conta
    
            // Limpar o buffer do teclado após a leitura de um número
            scanner.nextLine();
    
            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine(); // Leitura do número da agência
    
            System.out.println("Por favor, digite o nome do Cliente!");
            nomeCliente = scanner.nextLine(); // Leitura do nome do cliente
    
            System.out.println("Por favor, digite o saldo da conta!");
            saldo = scanner.nextDouble(); // Leitura do saldo da conta
    
            // Exibindo a mensagem final com os dados inseridos
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "
                    + saldo + " já está disponível para saque.");
    
            // Fechando o scanner após o uso
            scanner.close();
        }
}
    