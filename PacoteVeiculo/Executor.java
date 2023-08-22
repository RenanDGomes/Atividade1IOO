package PacoteVeiculo;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o tipo de veículo a ser criado:");
            System.out.println("1. Carro");
            System.out.println("2. Barco");
            System.out.println("3. Avião");
            System.out.println("4. Moto");
            System.out.println("5. Sair");
            int escolha = sc.nextInt();

            if (escolha == 5) {
                System.out.println("Encerrando o programa...");
                break;
            }

            switch (escolha) {
                case 1 -> criarCarro(sc);
                case 2 -> criarBarco(sc);
                case 3 -> criarAviao(sc);
                case 4 -> criarMoto(sc);
                default -> System.out.println("Opção inválida");
            }
        }

        sc.close();
    }

    private static void criarCarro(Scanner sc) {
        System.out.print("Informe o ano do carro: ");
        int ano = sc.nextInt();
        System.out.print("Informe o preço do carro: ");
        int preco = sc.nextInt();
        System.out.print("Informe o número de passageiros do carro: ");
        int numPassageiros = sc.nextInt();
        System.out.print("Informe a velocidade máxima do carro: ");
        float velociMax = sc.nextFloat();
        System.out.print("Informe o tipo de tração do carro: ");
        String tracao = sc.next();
        System.out.print("Informe o número de portas do carro: ");
        int numPortas = sc.nextInt();

        Carro carro = new Carro(ano, preco, numPassageiros, velociMax, tracao, numPortas);

        System.out.println("Carro criado:");
        System.out.println("O carro é de: " + carro.getAno());
        System.out.println("O carro custa: " + carro.getPreco() + " reais");
        System.out.println("Tração: " + carro.getTracao());
        System.out.println("Número de Portas: " + carro.getNumPortas());

        realizarInteracoesCarro(carro, sc);
    }

    private static void criarBarco(Scanner sc) {
        System.out.print("Informe o ano do barco: ");
        int ano = sc.nextInt();
        System.out.print("Informe o preço do barco: ");
        int preco = sc.nextInt();
        System.out.print("Informe o número de passageiros do barco: ");
        int numPassageiros = sc.nextInt();
        System.out.print("Informe a velocidade máxima do barco: ");
        float velociMax = sc.nextFloat();
        System.out.print("O barco é motorizado? (true/false): ");
        boolean motorizado = sc.nextBoolean();
        System.out.print("O barco possui âncora? (true/false): ");
        boolean ancora = sc.nextBoolean();

        Barco barco = new Barco(ano, preco, numPassageiros, velociMax, motorizado, ancora);

        System.out.println("Barco criado:");
        System.out.println("Ano: " + barco.getAno());
        System.out.println("Preço: " + barco.getPreco());
        System.out.println("O barco é motorizado: " + barco.isMotorizado());
        System.out.println("Âncora: " + barco.isAncora());

        realizarInteracoesBarco(barco, sc);
    }

    private static void criarAviao(Scanner sc) {
        System.out.print("Informe o ano do avião: ");
        int ano = sc.nextInt();
        System.out.print("Informe o preço do avião: ");
        int preco = sc.nextInt();
        System.out.print("Informe o número de passageiros do avião: ");
        int numPassageiros = sc.nextInt();
        System.out.print("Informe a velocidade máxima do avião: ");
        float velociMax = sc.nextFloat();
        System.out.print("Informe o número de motores do avião: ");
        int numMotores = sc.nextInt();
        System.out.print("Informe a altitude máxima do avião: ");
        float altitudeMax = sc.nextFloat();

        Aviao aviao = new Aviao(ano, preco, numPassageiros, velociMax, numMotores, altitudeMax);

        System.out.println("Avião criado:");
        System.out.println("Ano: " + aviao.getAno());
        System.out.println("Preço: " + aviao.getPreco() + " reais");
        System.out.println("Número de Motores: " + aviao.getNumMotores());
        System.out.println("Altitude Máxima: " + aviao.getAltitudeMax() + " pés");

        realizarInteracoesAviao(aviao, sc);
    }

    private static void criarMoto(Scanner sc) {
        System.out.print("Informe o ano da moto: ");
        int ano = sc.nextInt();
        System.out.print("Informe o preço da moto: ");
        int preco = sc.nextInt();
        System.out.print("Informe o número de passageiros da moto: ");
        int numPassageiros = sc.nextInt();
        System.out.print("Informe a velocidade máxima da moto: ");
        float velociMax = sc.nextFloat();
        System.out.print("A moto possui carenagem? (true/false): ");
        boolean carenagem = sc.nextBoolean();
        System.out.print("Informe a quantidade de cilindradas da moto: ");
        int cilindradas = sc.nextInt();

        Moto moto = new Moto(ano, preco, numPassageiros, velociMax, carenagem, cilindradas);

        System.out.println("Moto criada:");
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Preço: " + moto.getPreco());
        System.out.println("Carenagem: " + moto.isCarenagem());
        System.out.println("Cilindradas: " + moto.getCilindradas());

        realizarInteracoesMoto(moto, sc);
    }

    private static void realizarInteracoesCarro(Carro carro, Scanner sc) {
        int opcao = 0;
        do {
            System.out.println("Escolha uma ação para o carro:");
            System.out.println("1. Acelerar");
            System.out.println("2. Abrir Porta-malas");
            System.out.println("3. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Acelerando o carro");
                case 2 -> System.out.println("Abrindo porta-malas");
                case 3 -> System.out.println("Voltando ao menu principal");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    private static void realizarInteracoesBarco(Barco barco, Scanner sc) {
        int opcao = 0;
        do {
            System.out.println("Escolha uma ação para o barco:");
            System.out.println("1. Largar âncora");
            System.out.println("2. Recolher âncora");
            System.out.println("3. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    if (!barco.isAncora()) {
                        barco.setAncora(true);
                        System.out.println("Âncora largada");
                    } else {
                        System.out.println("Âncora já estava largada");
                    }
                }
                case 2 -> {
                    if (barco.isAncora()) {
                        barco.setAncora(false);
                        System.out.println("Âncora recolhida");
                    } else {
                        System.out.println("Âncora já estava recolhida");
                    }
                }
                case 3 -> System.out.println("Voltando ao menu principal");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    private static void realizarInteracoesAviao(Aviao aviao, Scanner sc) {
        int opcao = 0;
        do {
            System.out.println("Escolha uma ação para o avião:");
            System.out.println("1. Ganhar altitude");
            System.out.println("2. Perder altitude");
            System.out.println("3. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Ganhando altitude");
                case 2 -> System.out.println("Perdendo altitude");
                case 3 -> System.out.println("Voltando ao menu principal");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    private static void realizarInteracoesMoto(Moto moto, Scanner sc) {
        int opcao = 0;
        do {
            System.out.println("Escolha uma ação para a moto:");
            System.out.println("1. Acelerar");
            System.out.println("2. Empinar");
            System.out.println("3. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Acelerando a moto");
                case 2 -> System.out.println("Empinando a moto");
                case 3 -> System.out.println("Voltando ao menu principal");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }
}
