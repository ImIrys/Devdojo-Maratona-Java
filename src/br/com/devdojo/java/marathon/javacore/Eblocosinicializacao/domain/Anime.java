package br.com.devdojo.java.marathon.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pra objetos
    // 2 - CAda atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime() {
        for (int episodios: this.episodios) {
            System.out.print(episodios + " ");
        }
    }
}
