import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Screen Match!");

        System.out.println("Filmes");

        Filme filmeUm = new Filme();
        filmeUm.setNome("O Poderoso Chefão");
        filmeUm.setAnoDeLancamento(1972);
        filmeUm.setDuracaoEmMinutos(175);
        

        filmeUm.avaliacoes(10.0);
        filmeUm.avaliacoes(9.7);
        filmeUm.avaliacoes(9.0);

        filmeUm.exibaTitulo();
        System.out.println("Nota do filme: " + new DecimalFormat("#,##0.0").format(filmeUm.mediaAvalia()));
        FiltroRecomendacao filtraFilmeUm = new FiltroRecomendacao();
        filtraFilmeUm.filtra(filmeUm);

        System.out.println("");

        Filme filmeDois = new Filme();
        filmeDois.setNome("Oppenheimer");
        filmeDois.setAnoDeLancamento(2023);
        filmeDois.setDuracaoEmMinutos(180);

        filmeDois.avaliacoes(9.7);
        filmeDois.avaliacoes(9.2);
        filmeDois.avaliacoes(9.9);

        filmeDois.exibaTitulo();
        System.out.println("Nota do filme: " + new DecimalFormat("#,##0.0").format(filmeDois.mediaAvalia()));
        FiltroRecomendacao filtroFilmeDois = new FiltroRecomendacao();
        filtroFilmeDois.filtra(filmeDois);

        System.out.println("");

        Filme filmeTres = new Filme();
        filmeTres.setNome("Velozes e Furiosos: Desafio em Tóquio");
        filmeTres.setAnoDeLancamento(2006);
        filmeTres.setDuracaoEmMinutos(87);

        filmeTres.avaliacoes(8.7);
        filmeTres.avaliacoes(7.4);
        filmeTres.avaliacoes(6.5);

        filmeTres.exibaTitulo();
        System.out.println("Nota do filme: " + new DecimalFormat("#,##0.0").format(filmeTres.mediaAvalia()));
        FiltroRecomendacao filtroFilmeTres = new FiltroRecomendacao();
        filtroFilmeDois.filtra(filmeTres);

        System.out.println("");

        System.out.println("Series");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setMinutosPorEpisodio(45);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(18);

        lost.avaliacoes(7.8);
        lost.avaliacoes(8.2);
        lost.avaliacoes(9.6);

        lost.exibaTitulo();
        System.out.println("Nota da serie: " + new DecimalFormat("#,##0.0").format(lost.mediaAvalia()));
        FiltroRecomendacao filtroLost = new FiltroRecomendacao();
        filtroLost.filtra(lost);
        calculadora.inclui(lost);

        System.out.println("");

        Serie laCasaDePapel = new Serie();
        laCasaDePapel.setNome("La Casa De Papel");
        laCasaDePapel.setAnoDeLancamento(2017);
        laCasaDePapel.setTemporadas(5);
        laCasaDePapel.setEpisodiosPorTemporada(10);
        laCasaDePapel.setMinutosPorEpisodio(50);

        laCasaDePapel.avaliacoes(8.7);
        laCasaDePapel.avaliacoes(9.3);
        laCasaDePapel.avaliacoes(9.8);

        laCasaDePapel.exibaTitulo();
        System.out.println("Nota da serie: " + new DecimalFormat("#,##0.0").format(laCasaDePapel.mediaAvalia()));
        FiltroRecomendacao filtraLaCasa = new FiltroRecomendacao();
        filtraLaCasa.filtra(laCasaDePapel);
        calculadora.inclui(laCasaDePapel);

        System.out.println("");

        Serie doctorWho = new Serie();
        doctorWho.setNome("Doctor Who");
        doctorWho.setAnoDeLancamento(1963);
        doctorWho.setTemporadas(26);
        doctorWho.setEpisodiosPorTemporada(30);
        doctorWho.setMinutosPorEpisodio(45);

        doctorWho.avaliacoes(8.6);
        doctorWho.avaliacoes(9.9);
        doctorWho.avaliacoes(8.9);

        doctorWho.exibaTitulo();
        System.out.println("Nota da serie: " + new DecimalFormat("#,##0.0").format(doctorWho.mediaAvalia()));
        FiltroRecomendacao filtraDoctorWho = new FiltroRecomendacao();
        filtraLaCasa.filtra(doctorWho);
        calculadora.inclui(doctorWho);


    }
}