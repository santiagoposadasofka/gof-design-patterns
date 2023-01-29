package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Permite definir un propósito pero dependiendo del contexto, implementarlo.

public class Strategy {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        File texto1 = new File("texto1.txt");            // Se crean 3 archivos de texto para ser comprimidos
        File texto2 = new File("texto2.txt");
        File texto3 = new File("texto3.txt");
        List<File> files;                                         // Se inicializa una lista de archivos
        files = new ArrayList<>();                                // Se asigna el tipo de lista a la lista de archivos
        files.add(texto1);                                        // Se añaden los 3 archivos de texto a la lista
        files.add(texto2);
        files.add(texto3);
        CompressionStrategy zip = new ZipCompressionStrategy();   // Se crea el formato ZIP para comprimir archivos
        CompressionStrategy rar = new RarCompressionStrategy();   // Se crea el formato RAR para comprimir archivos
        CompressionContext compresor = new CompressionContext();  // Se crea un programa compresor de archivos
        compresor.setCompressionStrategy(zip);                    // Se establece el formato ZIP al programa compresor
        compresor.createArchive(files);                           // Se comprime la lista de archivos de texto en un ZIP
        compresor.setCompressionStrategy(rar);                    // Se establece el formato RAR al programa compresor
        compresor.createArchive(files);                           // Se comprime la lista de archivos de texto en un RAR
    }
}

interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Comprimiendo en .ZIP");    // Se le añade un comportamiento al método a modo de ejemplo
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Comprimiendo en .RAR");    // Se le añade un comportamiento al método a modo de ejemplo
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
