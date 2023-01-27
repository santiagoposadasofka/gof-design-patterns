package org.example.comprtamiento;

import org.example.creacion.Comida;
import org.example.creacion.ComidaBuilder;

import java.io.File;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    public void ejecutarZip() {
        ZipCompressionStrategy zip = new ZipCompressionStrategy();
        System.out.println("implementación del algoritmo de compresión Zip");

    }
    public void ejecutarRar() {
        RarCompressionStrategy Rarp = new RarCompressionStrategy();
        System.out.println("implementación del algoritmo de compresión RAR");
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
        // implementación del algoritmo de compresión RAR
    }
}

class CompressionContext {
    private CompressionStrategy strategy;

    public CompressionContext(CompressionStrategy estrategia){
        this.strategy = estrategia;
    }

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
