package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Strategy {
    /**
     * Permite definir un propósito pero dependiendo del contexto implementarlo.
     * */
    public static void ejecutar(){
        List<Archivo> files=new ArrayList<>();
        files.add(new Archivo());
        files.add(new Archivo());
        CompressionContext context=new CompressionContext();
        context.setCompressionStrategy(new RarCompressionStrategy());
        context.createArchive(files);
        ContextoDeGrabacion grabacion= new ContextoDeGrabacion();
        grabacion.setStrategy(new Mp3GrabacionStrategy());
        grabacion.grabar(files);
        grabacion.setStrategy(new WavGrabacionStrategy());
        grabacion.grabar(files);
    }
}
interface GrabacionStrategy{
    void grabarAudio(List<Archivo> archivos);
}
class Mp3GrabacionStrategy implements GrabacionStrategy{
    @Override
    public void grabarAudio(List<Archivo> archivos) {
        for(Archivo archivo:archivos)
            System.out.println("El archivo se ha grabado en Mp3");
    }
}
class WavGrabacionStrategy implements GrabacionStrategy{
    @Override
    public void grabarAudio(List<Archivo> archivos) {
        for(Archivo archivo:archivos)
            System.out.println("El archivo se ha grabado en Wav");
    }
}
class ContextoDeGrabacion{
    private GrabacionStrategy strategy;
    public void setStrategy(GrabacionStrategy strategy) {
        this.strategy = strategy;
    }
    public void grabar(List<Archivo> archivos){
        strategy.grabarAudio(archivos);
    }
}
class Archivo{
}
interface CompressionStrategy {
    void compressFiles(List<Archivo> files);
}

class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<Archivo> files) {
        System.out.println("Archivo comprimido a ZIP");
    }
}

class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<Archivo> files) {
        for (Archivo archivo: files)
            System.out.println("Archivo comprimido a RAR");
    }
}

class CompressionContext {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<Archivo> files) {
        strategy.compressFiles(files);
    }
}
