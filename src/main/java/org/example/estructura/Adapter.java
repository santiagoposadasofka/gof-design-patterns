package org.example.estructura;

import java.util.ArrayList;
import java.util.List;

public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * esta desarrollado o escrito en un leguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     */


    public void ejecutar() {

        /**

         List<ReproductorDeAudio> reproductores = new ArrayList<>();
         reproductores.add(new ReproductorMp3());
         reproductores.add(new ReproductorWav());
         reproductores.add(new AdaptadorDeAudio());

         for (ReproductorDeAudio reproductor : reproductores) {
         reproductor.reproducir("la vaca loca.mp3");
         reproductor.reproducir("el dia");
         reproductor.reproducir("amor");

         }
         */

        ReproductorDeAudio reproductorMp3 = new ReproductorMp3();
        ReproductorDeAudio reproductorWav = new ReproductorWav();
        ReproductorDeAudio adaptadorDeAudio = new AdaptadorDeAudio();

        reproductorMp3.reproducir("song.mp3"); // Reproduciendo archivo MP3: song.mp3
        reproductorWav.reproducir("song.wav"); // Reproduciendo archivo WAV:song.wav
        adaptadorDeAudio.reproducir("song.wav"); // Reproduciendo archivo MP3:song.mp3


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
