package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */
    public static void ejecutar(){

    System.out.println("compressing files with zip strategy\n");
    List<File> filesToCompress = new ArrayList<File>();
    filesToCompress.add(new File("archivo1.txt"));
    filesToCompress.add(new File("archivo2.txt"));

    CompressionContext context = new CompressionContext();
    context.setCompressionStrategy(new RarCompressionStrategy());
    context.createArchive(filesToCompress);

    System.out.println("compressing files with RAR strategy\n");
    filesToCompress.add(new File("archivo3.txt"));
    filesToCompress.add(new File("archivo4.txt"));


    context.setCompressionStrategy(new ZipCompressionStrategy());
    context.createArchive(filesToCompress);





    }
}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {

    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión ZIP
        System.out.println(files + " Archivo(s) comprimido en formato ZIP");




    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public RarCompressionStrategy() {
    }

    public void compressFiles(List<File> files) {
        // implementación del algoritmo de compresión RAR
        System.out.println(files + " Archivo(s) comprimido en formato RAR");
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
