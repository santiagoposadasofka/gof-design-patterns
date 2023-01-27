package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */

    public void ejecutar(){
        List <File> zip = new ArrayList<File>();
        ZipCompressionStrategy zipCompressionStrategy = new ZipCompressionStrategy();
        zipCompressionStrategy.compressFiles(zip);

        RarCompressionStrategy rarCompressionStrategy = new RarCompressionStrategy();
        rarCompressionStrategy.compressFiles(zip);

        CompressionContext ctx = new CompressionContext();
        ctx.setCompressionStrategy(rarCompressionStrategy);
        ctx.setCompressionStrategy(zipCompressionStrategy);

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

