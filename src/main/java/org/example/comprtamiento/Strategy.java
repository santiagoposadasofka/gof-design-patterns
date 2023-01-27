package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */

    public void ejecut(){
        System.out.println("__________________________Strategy________________________");
        ZipCompressionStrategy zipCompressionStrategy=new ZipCompressionStrategy();
        List<File> listado = new ArrayList<>();
        zipCompressionStrategy.compressFiles(listado);
        RarCompressionStrategy rarCompressionStrategy= new RarCompressionStrategy();
        rarCompressionStrategy.compressFiles(listado);
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(zipCompressionStrategy);
        compressionContext.createArchive(listado);

    }
}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("archivo comprimido como ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("archivo comprimido como rar");
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
