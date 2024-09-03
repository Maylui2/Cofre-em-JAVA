package cofrinho;

public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 5.48; // No dia 08/07/2024.

    public Dolar(double valor) {
        super(valor);
    }


    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }


    public String getNome() {
        return "Dolar";
    }
}
