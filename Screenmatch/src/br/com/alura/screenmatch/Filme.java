package br.com.alura.screenmatch;

import br.com.alura.calculos.Classifica;

public class Filme extends Titulo implements Classifica{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return (int) mediaAvalia()/2;
    }

}
