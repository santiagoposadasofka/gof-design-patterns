package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     */

    public void comprimirArchivo() {
        ZipCompressionStrategy zipCompressionStrategy=new ZipCompressionStrategy();
        RarCompressionStrategy rarCompressionStrategy= new RarCompressionStrategy();
        CompressionContext compressionContext = new CompressionContext();


        List<File> listaArchivos = new ArrayList<>();
        listaArchivos.add(new File("canciones"));
        listaArchivos.add(new File("videos"));
        listaArchivos.add(new File("presentacion SofkaU"));




        zipCompressionStrategy.compressFiles(listaArchivos);
        rarCompressionStrategy.compressFiles(listaArchivos);
        compressionContext.setCompressionStrategy(zipCompressionStrategy);
        compressionContext.createArchive(listaArchivos);

    }


}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Archiv comprimido en formato .ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Archivo comprimido en formato .RAR");
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
