import java.util.Scanner;

public class Main {
    /*
    * 1. Inicializar dados do cliente
    * 2. Menu de opções
    * 3. Visualização do saldo
    * 4. Envia valor
    * 5. Recebe valor
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String tipoConta;
        double saldoInicial;
        double saldoAdicional;
        double transferencia;
        int opcao = 0;

        System.out.println("Nome: ");
        nome = scanner.nextLine();
        System.out.println("Tipo da Conta:");
        tipoConta = scanner.nextLine();
        System.out.println("Saldo Inicial: ");
        saldoInicial = scanner.nextDouble();

        System.out.println("**************************************\n");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("\n**************************************");

        while (opcao != 4){
            System.out.println("\n\nDigite a opção desejada: \n");
            System.out.printf("Operações: \n");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            opcao = scanner.nextInt();
            System.out.println("Opção escolhida: " + opcao);

            if (opcao == 1){
                System.out.printf("Saldo atual: " + saldoInicial);

            } else if (opcao == 2) {
                System.out.printf("Valor a ser adicionado: ");
                saldoAdicional = scanner.nextDouble();
                saldoInicial += saldoAdicional;
                System.out.printf("Adicionado o saldo de " + saldoAdicional + ". Saldo atualizado: " + saldoInicial);

            } else if (opcao == 3) {
                System.out.println("Valor a ser transferido: ");
                transferencia = scanner.nextDouble();

                if (saldoInicial <= transferencia){
                    System.out.println("Saldo insuficiente =( " + saldoInicial);
                }else if (saldoInicial > transferencia){
                   saldoInicial  -= transferencia;
                    System.out.println("Enviando transferência....");
                    System.out.println("Saldo inicial atualizado: " + saldoInicial);
                }
            }

            if (opcao == 4){
                System.out.println("Saindo da conta...");
                break;
            }
        }

    }
}