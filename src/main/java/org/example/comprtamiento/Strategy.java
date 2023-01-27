package org.example.comprtamiento;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     */
    public void ejecutarStrategy() {
        // Crear una lista de archivos
        List<File> files = new ArrayList<File>();
        files.add(new File("Archivo.java"));
        files.add(new File("Archivo1.json"));
        files.add(new File("Archivo3.xml"));
        files.add(new File("Archivo4.txt"));
        // Crear un objeto CompressionContext
        CompressionContext compressionContext = new CompressionContext();
        // Establecer la estrategia de compresión a ZipCompressionStrategy
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        // Crear un archivo comprimido
        compressionContext.createArchive(files);
        // Establecer la estrategia de compresión a RarCompressionStrategy
        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        // Crear un archivo comprimido
        compressionContext.createArchive(files);
    }
}

/**
 * Interface que define el comportamiento para comprimir una lista de archivos.
 * Las clases que implementen esta interface deben proporcionar una implementación para el método compressFiles.
 */

interface CompressionStrategy {
    void compressFiles(List<File> files);
}

/**
 * Clase que implementa la estrategia de compresión ZIP.
 * Utiliza el algoritmo de compresión ZIP para comprimir una lista de archivos.
 */
class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Comprimiendo archivos en ZIP");
        // implementación del algoritmo de compresión ZIP
    }
}

/**
 * Clase que implementa la estrategia de compresión RAR.
 * Utiliza el algoritmo de compresión RAR para comprimir una lista de archivos.
 */
class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Comprimiendo archivos en RAR");
        // implementación del algoritmo de compresión RAR
    }
}

/**
 * Clase que proporciona un contexto para comprimir archivos utilizando una estrategia de compresión específica.
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
