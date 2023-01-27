package org.example.comprtamiento;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Strategy {

    /**
     * Permite definir un proposito pero dependiendo del contexto implementarlo.
     * El patrón consiste en una interfaz común para todos los algoritmos y una
     * abstracta o una interfaz que los implementa. En tiempo de ejecución, se selecciona
     * la implementación deseada y se utiliza para resolver el problema.
     * */

    public void ejecutar (){
        //Ejemplo de ordenamiento
        ZipCompressionStrategy zip = new ZipCompressionStrategy();
        List<File> lista = new ArrayList<>();
        zip.compressFiles(lista);

        //Ejemplo de compresion
        RarCompressionStrategy rar = new RarCompressionStrategy();
        rar.compressFiles(lista);

        CompressionContext context = new CompressionContext();
        context.setCompressionStrategy(zip);
        context.createArchive(lista);



    }
}


interface CompressionStrategy {
    void compressFiles(List<File> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println(" Compita dejame decirte que se esta compirmiendo tu archivo en formato  ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println(" Compita dejame decirte que se esta compirmiendo tu archivo en formato  RAR");
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
