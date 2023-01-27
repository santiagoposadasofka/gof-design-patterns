package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    public void ejecutar(){

        String directorioZip = "C:/ZIP/";

        CompressionContext compressionContext = new CompressionContext();
        CompressionStrategy compressionStrategy = new ZipCompressionStrategy();
        List<File> file = new ArrayList<>();
        file.add(new File(directorioZip));

        compressionContext.setCompressionStrategy(compressionStrategy);
        compressionContext.createArchive(file);

        CompressionContext compressionContext1 = new CompressionContext();
        CompressionStrategy compressionStrategy1 = new RarCompressionStrategy();
        List<File> fileRar = new ArrayList<>();
        fileRar.add(new File(directorioZip));

        compressionContext1.setCompressionStrategy(compressionStrategy1);
        compressionContext1.createArchive(fileRar);

    }
}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión ZIP
        System.out.println("implementación del algoritmo de compresión ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión RAR
        System.out.println("implementación del algoritmo de compresión RAR");
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
