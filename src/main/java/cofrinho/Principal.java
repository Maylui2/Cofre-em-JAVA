package cofrinho;

import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Cofrinho cofrinho = new Cofrinho();

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 5) {
            imprimirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> adicionarMoeda();
                case 2 -> removerMoeda();
                case 3 -> listarMoedas();
                case 4 -> calcularTotalEmReais();
                case 5 -> System.out.println("Encerrar");
                default -> imprimirMensagem("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void imprimirMenu() {
        imprimirMensagem("COFRINHO DE MAYARA:");
        imprimirMensagem("1. Guardar Moeda");
        imprimirMensagem("2. Remover Moeda");
        imprimirMensagem("3. Listar Moedas");
        imprimirMensagem("4. Calcular Total em Reais");
        imprimirMensagem("5. Encerrar");
        imprimirMensagem("Escolha uma opção: ");
    }

    private static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    private static void adicionarMoeda() {
        String[] mensagens = {
                "Escolha a moeda:",
                "1. Real",
                "2. Dolar",
                "3. Euro",
                "Digite o valor: "
        };

        for (String mensagem : mensagens) imprimirMensagem(mensagem);

        int tipoMoeda = scanner.nextInt();
        imprimirMensagem("Digite o valor: ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;
        switch (tipoMoeda) {
            case 1 -> moeda = new Real(valor);
            case 2 -> moeda = new Dolar(valor);
            case 3 -> moeda = new Euro(valor);
            default -> imprimirMensagem("Tipo de moeda inválido.");
        }

        if (moeda != null) {
            cofrinho.adicionarMoeda(moeda);
        }
    }

    private static void removerMoeda() {
        String[] mensagens = {
                "Escolha a moeda a remover:",
                "1. Real",
                "2. Dolar",
                "3. Euro",
                "Digite o valor: "
        };

        for (String mensagem : mensagens) imprimirMensagem(mensagem);

        int tipoMoeda = scanner.nextInt();
        imprimirMensagem("Digite o valor: ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;
        switch (tipoMoeda) {
            case 1 -> moeda = new Real(valor);
            case 2 -> moeda = new Dolar(valor);
            case 3 -> moeda = new Euro(valor);
            default -> imprimirMensagem("Tipo de moeda inválido.");
        }

        if (moeda != null) {
            if (cofrinho.removerMoeda(moeda)) {
                imprimirMensagem("Moeda removida com sucesso!");
            } else {
                imprimirMensagem("Moeda não encontrada.");
            }
        }
    }

    private static void listarMoedas() {
        imprimirMensagem("Todas as Moedas do Cofrinho:");
        cofrinho.listarMoedas();
    }

    private static void calcularTotalEmReais() {
        imprimirMensagem("Total em Reais: " + cofrinho.calcularTotalEmReais());
    }
}

