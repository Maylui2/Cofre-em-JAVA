package cofrinho;

public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 5.93; // No dia 08/07/2024.

    public Euro(double valor) {
        super(valor);
    }


    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }

    public String getNome() {
        return "Euro";
    }
}
