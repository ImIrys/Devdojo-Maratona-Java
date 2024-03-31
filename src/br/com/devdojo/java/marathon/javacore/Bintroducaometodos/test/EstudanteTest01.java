package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.test;

import br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio.Estudante;
import br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Sakura";
        estudante01.idade = 25;
        estudante01.sexo = 'F';

        estudante02.nome = "Naruto";
        estudante02.idade = 23;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

    }

}
