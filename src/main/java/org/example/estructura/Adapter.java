package org.example.estructura;

public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * está desarrollado o escrito en un lenguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     * */
    public static void ejecutar(){
        ReproductorDeAudio reproductorDeAudio=new AdaptadorDeAudio();
        reproductorDeAudio.reproducir("Salsita.wav");
        SistemaOperativo sistema=new Windows();
        sistema.ejecutarPrograma();
        SistemaOperativoNuevo linux=new SistemaOperativoAdapter(sistema);
        linux.ejecutarAdaptacion();
    }
}
interface SistemaOperativo{
    void ejecutarPrograma();
}
class Windows implements SistemaOperativo{
    @Override
    public void ejecutarPrograma() {
        System.out.println("Ejecutando el programa");
    }
}
interface SistemaOperativoNuevo{
    void ejecutarAdaptacion();
}
class SistemaOperativoAdapter implements SistemaOperativoNuevo{
    SistemaOperativo sistemaOperativo;
    public SistemaOperativoAdapter(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    @Override
    public void ejecutarAdaptacion() {
        sistemaOperativo.ejecutarPrograma();
    }
}
interface ReproductorDeAudio {
    void reproducir(String archivo);
}

class ReproductorMp3 implements ReproductorDeAudio {
    @Override
    public void reproducir(String archivo) {
        if (archivo.endsWith(".mp3")) {
            System.out.println("Reproduciendo archivo MP3: " + archivo);
            return;
        }
        throw new IllegalArgumentException("Formato invalido");
    }
}

class ReproductorWav implements ReproductorDeAudio {
    @Override
    public void reproducir(String archivo) {
        if (archivo.endsWith(".wav")) {
            System.out.println("Reproduciendo archivo WAV: " + archivo);
            return;
        }
        throw new IllegalArgumentException("Formato invalido");
    }
}

class AdaptadorDeAudio implements ReproductorDeAudio {
    private ReproductorMp3 reproductorMp3 = new ReproductorMp3();

    @Override
    public void reproducir(String archivo) {
        String nuevoFormato = "";
        if (archivo.endsWith(".wav")) {
            nuevoFormato = archivo.substring(0, archivo.lastIndexOf(".")) + ".mp3";
            reproductorMp3.reproducir(nuevoFormato);
        }
    }
}
