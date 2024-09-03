package cofrinho;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }


    public double converterParaReal() {
        return valor;
    }


    public String getNome() {
        return "Real";
    }
}
