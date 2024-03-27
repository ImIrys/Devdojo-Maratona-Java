package br.com.devdojo.java.marathon.introducao;

public class Aula0EstruturasRepeticao01 {
    public static void main(String[] args) {
        // WHILE
        int count = 0;
        while (count < 10){
            System.out.println(count);
           count += 1; // count = count + 1;
        }

        //DO-WHILE
        count = 0;
        do {
            System.out.println("dentro de DO-WHILE " + ++count);
        } while (count < 10);

        //FOR
        for (int i=0; i < 10; i++) {
            System.out.println("For " +i);
        }
    }
}
