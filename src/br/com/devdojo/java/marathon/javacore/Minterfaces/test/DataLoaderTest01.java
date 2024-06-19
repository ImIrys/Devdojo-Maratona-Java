package br.com.devdojo.java.marathon.javacore.Minterfaces.test;

import br.com.devdojo.java.marathon.javacore.Minterfaces.domain.DatabaseLoader;
import br.com.devdojo.java.marathon.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
