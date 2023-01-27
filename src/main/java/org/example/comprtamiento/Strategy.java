package org.example.comprtamiento;

import java.io.File;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    private CompressionContext contexto;

    public Strategy() {
        contexto = new CompressionContext();
    }

    public void ejecutar(List<File> files) {
        CompressionStrategy strategy = new ZipCompressionStrategy();
        contexto.setCompressionStrategy(strategy);
        contexto.createArchive(files);
    }
}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión ZIP
        System.out.println("Comprimiendo los archivos a .zip");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión RAR
        System.out.println("Comprimiendo los archivos a .rar");
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
