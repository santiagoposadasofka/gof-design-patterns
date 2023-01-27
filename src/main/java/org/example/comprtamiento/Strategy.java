package org.example.comprtamiento;

import java.io.File;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */

    public void comprimir(){
        CompressionStrategy compressionStrategy = new RarCompressionStrategy();
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(compressionStrategy);
        compressionStrategy.compressFiles("Las mil y una noches.pdf");
    }
}


interface CompressionStrategy {
    void compressFiles(String file);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(String file) {
        // implementación del algoritmo de compresión ZIP
        System.out.println("Comprimiendo archivo en formato ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(String file) {
        // implementación del algoritmo de compresión RAR
        System.out.println("Compribiendo archivo en formato RAR");
    }
}

class CompressionContext {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(String file) {
        strategy.compressFiles(file);
    }
}
