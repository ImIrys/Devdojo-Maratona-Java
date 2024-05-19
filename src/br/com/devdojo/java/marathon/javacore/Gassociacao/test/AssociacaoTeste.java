package br.com.devdojo.java.marathon.javacore.Gassociacao.test;

import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Aluno;
import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Local;
import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Professor;
import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Irys", 32);
        Professor professor = new Professor("Jiraya", "Ninja");
        Aluno[] alunoParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como ser um ninja", alunoParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }

}