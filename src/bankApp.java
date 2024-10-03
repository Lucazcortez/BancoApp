import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class bankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta contaCorrente = null;
        Conta contaPoupanca = null;
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("========= Menu Banco Digital ========");
            System.out.println("========= 1. Criar conta Corrente ========");
            System.out.println("========= 2. Criar Conta Poupanca ========");
            System.out.println("=========       3. Ver Saldo      ========");
            System.out.println("=========       4. Depositar      ========");
            System.out.println("=========       5. Sacar          ========");
            System.out.println("=========       6. Transferir     ========");
            System.out.println("=========       7. Sair           ========");
            System.out.print("            Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
case 1:
    if (contaCorrente == null) {
        Cliente clienteCorrente = new Cliente();

        System.out.print("Digite o nome do cliente para a Conta Corrente: ");
        clienteCorrente.setNome(scanner.next());

        contaCorrente = new ContaCorrente(clienteCorrente);

        System.out.println("Conta Corrente criada com sucesso!");
    } else {
        System.out.println("Você já possui uma Conta Corrente.");
    }
        break;

     case 2:
            if (contaPoupanca == null) {
                Cliente clientePoupanca = new Cliente();
                System.out.print("Digite o nome do cliente para a Conta Poupança: ");
                clientePoupanca.setNome(scanner.next());
                contaPoupanca = new ContaPoupanca(clientePoupanca);
                System.out.println("Conta Poupança criada com sucesso!");
            } else {
                System.out.println("Você já possui uma Conta Poupança.");
            }
                break;
 case 3:
        if (contaCorrente == null && contaPoupanca == null) {
        System.out.println("Nenhuma conta foi criada.");
    } else {
        System.out.println("1. Ver saldo Conta Corrente");
        System.out.println("2. Ver saldo Conta Poupança");
        int tipoConta = scanner.nextInt();
        if (tipoConta == 1 && contaCorrente != null) {
            System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        } else if (tipoConta == 2 && contaPoupanca != null) {
            System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Conta não existente.");
        }
    }
                    break;
 case 4:
        System.out.println("1. Depositar na Conta Corrente");
        System.out.println("2. Depositar na Conta Poupança");
        int tipoContaDeposito = scanner.nextInt();
        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        if (tipoContaDeposito == 1 && contaCorrente != null) {
            contaCorrente.depositar(valorDeposito);
            System.out.println("Depósito realizado com sucesso na Conta Corrente!");
        } else if (tipoContaDeposito == 2 && contaPoupanca != null) {
            contaPoupanca.depositar(valorDeposito);
            System.out.println("Depósito realizado com sucesso na Conta Poupança!");
        } else {
            System.out.println("Conta não existente.");
        }
        break;

case 5:
            System.out.println("1. Sacar da Conta Corrente");
            System.out.println("2. Sacar da Conta Poupança");
            int tipoContaSaque = scanner.nextInt();
            System.out.print("Digite o valor para saque: ");
            double valorSaque = scanner.nextDouble();
            if (tipoContaSaque == 1 && contaCorrente != null) {
                if (valorSaque <= contaCorrente.getSaldo()) {
                    contaCorrente.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso da Conta Corrente!");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (tipoContaSaque == 2 && contaPoupanca != null) {
                if (valorSaque <= contaPoupanca.getSaldo()) {
                    contaPoupanca.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso da Conta Poupança!");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Conta não existente.");
            }
            break;
        case 6:
            if (contaCorrente == null && contaPoupanca == null) {
                System.out.println("Nenhuma conta foi criada para realizar a transferência.");
            } else {
                System.out.println("1. Transferir da Conta Corrente para Conta Poupança");
                System.out.println("2. Transferir da Conta Poupança para Conta Corrente");
                int tipoContaTransferencia = scanner.nextInt();
                System.out.print("Digite o valor para transferência: ");
                double valorTransferencia = scanner.nextDouble();

                if (tipoContaTransferencia == 1 && contaCorrente != null && contaPoupanca != null) {
                    if (valorTransferencia <= contaCorrente.getSaldo()) {
                        contaCorrente.transferir(valorTransferencia, contaPoupanca);
                        System.out.println("Transferência realizada com sucesso da Conta Corrente para a Conta Poupança!");
                    } else {
                        System.out.println("Saldo insuficiente na Conta Corrente.");
                    }
                } else if (tipoContaTransferencia == 2 && contaCorrente != null && contaPoupanca != null) {
                    if (valorTransferencia <= contaPoupanca.getSaldo()) {
                        contaPoupanca.transferir(valorTransferencia, contaCorrente);
                        System.out.println("Transferência realizada com sucesso da Conta Poupança para a Conta Corrente!");
                    } else {
                        System.out.println("Saldo insuficiente na Conta Poupança.");
                    }
                } else {
                    System.out.println("Uma das contas não foi criada ou não existente.");
                }
            }
            break;
case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
    }

    scanner.close();
        }
    }
