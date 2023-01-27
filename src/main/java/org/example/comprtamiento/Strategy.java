package org.example.comprtamiento;

import java.io.File;
import java.util.List;

public class Strategy {
    public void ejecutar (){
        Strategy estrategia = new Strategy();
        CompressionContext compress = new CompressionContext();

    }

    /**
     * Permite definir un proposito pero dependiendo del contexto a implementarlo.
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
