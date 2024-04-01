package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("====================================");

        /*
        estudante.nome = "Tanjiro"; // vai alterar o conteúdo do objeto nome.
        */
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Tanjiro"; // o objeto em memória que tem a referência para NOME vai recebr o valor de Tanjiro

    }

}
