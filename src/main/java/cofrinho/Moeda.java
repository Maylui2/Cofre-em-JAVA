package cofrinho;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converterParaReal();
    public abstract String getNome();


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda outra = (Moeda) obj;
        return Double.compare(outra.valor, valor) == 0;
    }


    public String toString() {
        return getNome() + ": " + valor;
    }
}
