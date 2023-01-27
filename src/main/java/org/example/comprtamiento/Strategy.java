package org.example.comprtamiento;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Strategy {


    public void ejecutar (){

        List<File> files = Arrays.asList(new File("file1.txt"), new File("file2.txt"));
        // Crea un contexto de compresión
        CompressionContext context = new CompressionContext();
        // Establece la estrategia de compresión ZIP
        context.setCompressionStrategy(new ZipCompressionStrategy());
        // Crea un archivo comprimido con los archivos de la lista
        context.createArchive(files);
    }

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
}

interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión ZIP
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión RAR
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

