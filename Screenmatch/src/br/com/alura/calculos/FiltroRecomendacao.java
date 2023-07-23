package br.com.alura.calculos;

public class FiltroRecomendacao {
    public  void filtra(Classifica classifica){
        if(classifica.getClassificacao() >= 4){
            System.out.println("Esse aqui é simplesmente incrível, você vai ficar colado na tela!");
        } else if (classifica.getClassificacao() >= 2) {
            System.out.println("Uma escolha segura para quem busca uma opção agradável para assistir.");
        } else {
            System.out.println("Se você curte uma experiência diferente, pode dar uma chance a esse filme.");
        }
    }
}
