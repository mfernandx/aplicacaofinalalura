import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nome = "Maria Fernanda Santos Mendes";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500;
        int opcaoUsuario = 0;

        System.out.println("*************************************");
        System.out.println();

        System.out.println("Dados iniciais do cliente:");

        System.out.println("Nome:                " + nome);
        System.out.println("Tipo de conta:       " + tipoDeConta);
        System.out.println("Saldo inicial:       " + saldoInicial);

        System.out.println();
        System.out.println("******************************");
        System.out.println();


        System.out.println("Operações");

        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - SAIR");

        System.out.println();

        Scanner leitura = new Scanner (System.in);
        Scanner leitura2 = new Scanner (System.in);


        while (opcaoUsuario != 4) {

            System.out.println();
            System.out.println("Digite a opção desejada:");
            opcaoUsuario = leitura.nextInt();


            if (opcaoUsuario == 1) {
                System.out.println("Seu saldo atual é de " + saldoInicial);

            } else if (opcaoUsuario == 2) {
                System.out.println("Informe o valor a receber:");
                double valorReceber = leitura.nextDouble();
                saldoInicial += valorReceber;
                System.out.println("Saldo atualizado para R$ " + saldoInicial);

            } else if (opcaoUsuario == 3) {
                System.out.println("Para quem você deseja transferir:");
                String nomeDestinatario = leitura2.nextLine();
                System.out.println("Informe o valor a transferir:");
                double valorTransferir = leitura.nextDouble();

                if (valorTransferir > saldoInicial){
                    System.out.println("Você não tem saldo suficiente para realizar essa transferência");
                }else {
                    saldoInicial -= valorTransferir;
                    System.out.println(nomeDestinatario + " recebeu sua transferência de R$" + valorTransferir);
                    System.out.println("Saldo atualizado para R$ " + saldoInicial);
                }

            } else if (opcaoUsuario == 4) {
                System.out.println("Programa finalizado");
                break;
            } else {
                System.out.println("Lamento :( Opção indisponível");
            }
        }



    }
}