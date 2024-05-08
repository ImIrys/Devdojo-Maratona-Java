package br.com.devdojo.java.marathon.javacore.Fmodificadorestaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    //CONSTRUTOR


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //MÉTODOS
    public void imprime (){
        System.out.println("================================");
        System.out.println("Nome " +this.nome);
        System.out.println("Velocidade Máxima " +this.velocidadeMaxima);
        System.out.println("Velocidade Limite " +this.velocidadeLimite);
    }


    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

}
