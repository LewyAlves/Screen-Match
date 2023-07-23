package br.com.alura.calculos;

import br.com.alura.screenmatch.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
        System.out.println("Tempo estimado da serie: " + tempoTotal + " minutos");
    }
}
