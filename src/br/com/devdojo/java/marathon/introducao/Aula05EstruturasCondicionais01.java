package br.com.devdojo.java.marathon.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        // Saber se o usuário pode ou não comprar bebida alcoólica:
        int idade = 31;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica.");
        } else { // não precisa inserir uma condição, já é autoexplicativo.
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Usado a título de exemplo do que aparece em exercícios para a Certificação Java");
        }


    }
}