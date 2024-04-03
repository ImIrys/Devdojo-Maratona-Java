package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){ // como está dentro do objeto, não necessita de parâmetro, pois tem acesso a todos os atributos dentro do objeto.
        System.out.println("==================================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
