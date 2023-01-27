package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Permite definir un propósito pero dependiendo del contexto, implementarlo.

public class Strategy {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        File texto1 = new File("texto1.txt");
        File texto2 = new File("texto2.txt");
        File texto3 = new File("texto3.txt");
        List<File> files;
        files = new ArrayList<>();
        files.add(texto1);
        files.add(texto2);
        files.add(texto3);
        CompressionStrategy zip = new ZipCompressionStrategy();
        CompressionStrategy rar = new RarCompressionStrategy();
        CompressionContext compresor = new CompressionContext();
        compresor.setCompressionStrategy(zip);
        compresor.createArchive(files);
        compresor.setCompressionStrategy(rar);
        compresor.createArchive(files);
    }
}

interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Comprimiendo en .ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Comprimiendo en .RAR");
    }
}

class CompressionContext {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
