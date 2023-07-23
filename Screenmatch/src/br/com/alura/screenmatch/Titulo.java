package br.com.alura.screenmatch;

import br.com.alura.calculos.Classifica;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluiNoPlano;
    private double somaDasAvaliacoes;
    private int numeroDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluiNoPlano() {
        return incluiNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibaTitulo(){
        System.out.println("Nome do Titulo: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public void avaliacoes(Double notas){
        somaDasAvaliacoes += notas;
        numeroDeAvaliacoes++;
    }

    public double mediaAvalia(){
        return somaDasAvaliacoes / numeroDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluiNoPlano(boolean incluiNoPlano) {
        this.incluiNoPlano = incluiNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}
