package cofrinho;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
    private final ArrayList<Moeda> moedas;
    private double totalEmReais;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
        this.totalEmReais = 0;
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        totalEmReais += moeda.converterParaReal();
    }

    public boolean removerMoeda(Moeda moeda) {
        Iterator<Moeda> iterator = moedas.iterator();
        while (iterator.hasNext()) {
            Moeda m = iterator.next();
            if (m.equals(moeda)) {
                iterator.remove();
                totalEmReais -= moeda.converterParaReal();
                return true;
            }
        }
        return false;
    }

    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda);
        }
    }

    public double calcularTotalEmReais() {
        return totalEmReais;
    }
}


