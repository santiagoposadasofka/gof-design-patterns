package org.example.estructura;

public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * esta desarrollado o escrito en un leguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     * */

    /**
     * Método
     */
    public void ejecutarAdapter() {
        ReproductorMp3 reproductorMp3 = new ReproductorMp3();
        reproductorMp3.reproducir("Paradise.mp3");

        ReproductorWav reproductorWav = new ReproductorWav();
        reproductorWav.reproducir("Yellow.wav");

        AdaptadorDeAudio adaptadorDeAudio = new AdaptadorDeAudio();
        adaptadorDeAudio.reproducir("A sky full of stars.mp3");
    }
}

/**
 * Interface reproductor de audio
 */
interface ReproductorDeAudio {
    void reproducir(String archivo);
}

/**
 * Clase reproductor MP3 la cual implementa la interface reproductor de audio
 */
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

/**
 * Clase reproductor Wav la cual implementa la interface reproductor de audio
 */
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

/**
 * Clase adaptador de audio la cual implementa la interface de reproductor de audio.
 */
class AdaptadorDeAudio implements ReproductorDeAudio {
    private ReproductorMp3 reproductorMp3 = new ReproductorMp3();

    /**
     * Método que convierte o reemplaza las extensiones de un archivo tipo audio
     * @param archivo
     */
    @Override
    public void reproducir(String archivo) {
        String nuevoFormato = "";
        if (archivo.endsWith(".wav")) {
            nuevoFormato = archivo.substring(0, archivo.lastIndexOf(".")) + ".mp3";
            reproductorMp3.reproducir(nuevoFormato);
        }
    }
}
