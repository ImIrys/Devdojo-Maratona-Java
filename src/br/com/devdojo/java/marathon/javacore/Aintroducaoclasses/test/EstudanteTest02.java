package br.com.devdojo.java.marathon.javacore.Aintroducaoclasses.test;

import br.com.devdojo.java.marathon.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
       Estudante estudante =  new Estudante();
       Estudante estudante2 =  new Estudante();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("================================");

        estudante.nome = "Hinata";
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
