package br.com.alura.screenmatch;

import br.com.alura.calculos.Classifica;

public class Serie extends Titulo implements Classifica {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibaTitulo() {
        System.out.println("Nome da Serie: " + getNome());
        System.out.println("temporadas: " + getTemporadas());
        System.out.println("Episodios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Minutos por episodio: " + getMinutosPorEpisodio());
    }

    public int getClassificacao() {
        return (int) mediaAvalia()/2;
    }
}
