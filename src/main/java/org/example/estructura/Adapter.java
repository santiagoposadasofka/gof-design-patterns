package org.example.estructura;

public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * esta desarrollado o escrito en un leguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     * */

    /**
     * Metódo para ejecutar el patron
     */
    public void ejecutarAdapter() {
        ReproductorMp3 reproductorMp3 = new ReproductorMp3();
        reproductorMp3.reproducir("DJ Snake-Lean On.mp3");

        ReproductorWav reproductorWav = new ReproductorWav();
        reproductorWav.reproducir("Avicii-Levels.wav");

        AdaptadorDeAudio adaptadorDeAudio = new AdaptadorDeAudio();
        adaptadorDeAudio.reproducir("Coldplay-Yellow.wav");
    }
}

/**
 * Interface ReproductorDeAudio
 */
interface ReproductorDeAudio {
    void reproducir(String archivo);
}

/**
 * Clase para reproducir archivos de formato .mp3
 */
class ReproductorMp3 implements ReproductorDeAudio {
    /**
     * Metódo para validar que el formato del archivo sea de tipo .mp3
     *
     * @param archivo
     */
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
 * Clase para reproducir archivos de formato .wav
 */
class ReproductorWav implements ReproductorDeAudio {
    /**
     * Metódo para validar que el formato del archivo sea de tipo .wav
     *
     * @param archivo
     */
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

    /**
     * Metódo que nos permite convertir el formato del archivo de .mp3 a .wav o viceversa.
     *
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
