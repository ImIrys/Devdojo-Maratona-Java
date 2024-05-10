package br.com.devdojo.java.marathon.javacore.Fmodificadorestaticos.domain;

public class Anime {
    private String nome;

    // o valor dos episódios será um só, independente da qtd de objetos criados
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe.
    // 1 - Alocado espaço em memória pra objetos
    // 2 - CAda atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime() {
        // Quando trabalhamos com atributos estáticos
        // não usamos o this usamos o nome da própria classe.
        for (int episodios: Anime.episodios) {
            System.out.print(episodios + " ");
        }
    }
}
