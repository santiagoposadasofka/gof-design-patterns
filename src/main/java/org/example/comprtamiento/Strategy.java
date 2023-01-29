package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo. falta
     */


    public void ejecutar() {


        CompressionContext context = new CompressionContext();
        context.setCompressionStrategy(new ZipCompressionStrategy());

        List<File> files = new ArrayList<>();
        files.add(new File("ejemplo1.rar"));
        files.add(new File("ejemplo2.zip"));
        files.add(new File("ejemplo1.zip"));

        //agregar archivos a la lista

        context.createArchive(files);
        System.out.println(files.toString());
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

    @Override
    public String toString() {
        return "CompressionContext{" +
                "strategy=" + strategy +
                '}';
    }
}
