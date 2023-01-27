package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    public void ejecutar(){
        ZipCompressionStrategy zipCompressionStrategy=new ZipCompressionStrategy();
        List<File> lista = new ArrayList<>();
        zipCompressionStrategy.compressFiles(lista);
        RarCompressionStrategy rarCompressionStrategy= new RarCompressionStrategy();
        rarCompressionStrategy.compressFiles(lista);
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(zipCompressionStrategy);
        compressionContext.createArchive(lista);

    }

}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("implementación del algoritmo de compresión ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println(" implementación del algoritmo de compresión RAR");
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
