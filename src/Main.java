import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Ayres Roux";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int operacao = 0;

        System.out.println("""
                *******************************************
                Dandos iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ********************************************
                """.formatted(nome, tipoConta, saldo));

        while (operacao != 4) {
            String menu = """
             
                Operações:
                
                1 - Consultar Saldo
                2 - Depositar
                3 - Sacar
                4 - Sair
           
                """;

            System.out.println(menu);
            operacao = input.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é de: R$ %.2f".formatted(saldo));
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar:");
                    double valorDeposito = input.nextDouble();

                    if (valorDeposito <= 0) {
                        System.out.println("Valor inválido");
                        break;
                    }

                    saldo += valorDeposito;

                    System.out.println("Seu saldo atualizado é de: R$ %.2f".formatted(saldo));
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja retirar");
                    double valorRetirar = input.nextDouble();

                    if (valorRetirar > saldo) {
                        System.out.println("Saldo insuficiente para sua retirada");
                        break;
                    }

                    saldo -= valorRetirar;

                    System.out.println("Seu saldo atualizado é de: R$ %.2f".formatted(saldo));
                    break;
                case 4:
                    input.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("********************************************");
        }
    }
}