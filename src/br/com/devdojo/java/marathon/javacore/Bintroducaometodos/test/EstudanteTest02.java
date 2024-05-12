package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.test;

import br.com.devdojo.java.marathon.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Sakura";
        estudante01.idade = 25;
        estudante01.sexo = 'F';

        estudante02.nome = "Naruto";
        estudante02.idade = 23;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
