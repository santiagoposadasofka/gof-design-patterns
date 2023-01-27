package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * */

    /**
     * Método que permite ejecutar la clase Strategy
     */
    public void ejecutarStrategy (){
        /**
         * Se crea un ArrayList de archivos
         */
        List<File> files  = new ArrayList<>();
        files.add(new File ("imagen1.jpg"));
        files.add(new File ("imagen2.jpg"));
        files.add(new File ("imagen3.jpg"));
        files.add(new File ("imagen4.jpg"));
        files.add(new File ("imagen5.jpg"));

        /**
         * Instancia
         */
        CompressionContext compressionContext = new CompressionContext();
        /**
         * Estrategia de comprensión a .ZIP
         */
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        /**
         * Crea un archivo comprimido .ZIP
         */
        compressionContext.createArchive(files);
        /**
         * Estrategia de comprensión a .RAR
         */
        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        /**
         * Crea un archivo comprimido .RAR
         */
        compressionContext.createArchive(files);
    }
}

/**
 * Interface de estrategia de compresión que define el comportamiento para comprimir un ArrayList de archivos.
 */
interface CompressionStrategy {
    void compressFiles(List<File> files);
}

/**
 * Clase compresión de archivos a .ZIP, la cual permite comprimir una lista de archivos.
 */
class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Archivos comprimidos en .ZIP");
    }
}

/**
 * Clase compresión de archivos a .RAR, la cual permite comprimir una lista de archivos.
 */
class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Archivos comprimidos en .RAR");
    }
}

/**
 * Clase que permite comprimir archivos
 */
class CompressionContext {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
