package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    public void ejecutar (){
        List <File> files;
        files = new ArrayList<>();
        CompressionContext compress1 = new CompressionContext();
        compress1.setCompressionStrategy(new ZipCompressionStrategy());
        compress1.createArchive(files);

        CompressionContext compress2 = new CompressionContext();
        compress2.setCompressionStrategy(new RarCompressionStrategy());
        compress2.createArchive(files);



    }

}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión ZIP
        System.out.println("Se extrae la fila con compresión ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión RAR
        System.out.println("Se extrae la fila con compresión RAR");
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
