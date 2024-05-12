package br.com.devdojo.java.marathon.javacore.Aintroducaoclasses.test;

import br.com.devdojo.java.marathon.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kakashi";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + ", Idade: "+professor.idade + " anos, Sexo: "+professor.sexo);
    }
}
