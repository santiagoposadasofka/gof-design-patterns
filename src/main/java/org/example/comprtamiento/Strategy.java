package org.example.comprtamiento;

import java.io.File;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     */

    public void ejecutar() {
        RarCompressionStrategy rarCompressionStrategy = new RarCompressionStrategy();
        ZipCompressionStrategy zipCompressionStrategy = new ZipCompressionStrategy();
        CompressionContext compressionContext = new CompressionContext();
        System.out.println("Implementar libreria de File");
    }
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
