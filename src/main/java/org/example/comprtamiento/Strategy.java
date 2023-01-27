package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    public void Ejecutar(){
        //MALO
        //CompressionStrategy compressionStrategy =new ZipCompressionStrategy();
        //RarCompressionStrategy rarCompressionStrategy = new RarCompressionStrategy();
        //CompressionContext compressionContext = new CompressionContext();

        //compressionContext.createArchive();

        //BUENO
        List<File> files = Arrays.asList(new File("file#1.txt"), new File("file#2.txt"));
        CompressionContext compressionContext =new CompressionContext();
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        compressionContext.createArchive(files);


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
