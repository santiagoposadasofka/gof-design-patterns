package org.example.comprtamiento;

import java.io.File;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    private CompressionContext compressionContext;

    public Strategy() {
        compressionContext = new CompressionContext();
    }
    public void ejecutar(List<File> files) {
        CompressionStrategy strategy = new ZipCompressionStrategy();
        compressionContext.setCompressionStrategy(strategy);
        compressionContext.createArchive(files);
    }
}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Coomprimiendo archivo zip");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Coomprimiendo archivo rar");
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
