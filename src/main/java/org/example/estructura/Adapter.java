package org.example.estructura;

/*
 * Permite cerrar brechas o transformar un elemento que está desarrollado o escrito en un lenguaje ajeno para que pueda
 * ser interpretado por el recurso esperado.
 */

public class Adapter {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        String cancionMP3 = "Adonay.mp3";                      // Se crea una canción en formato MP3 y otra en formato WAV
        String cancionWAV = "Limoncito con Ron.wav";
        ReproductorDeAudio mp3 = new ReproductorMp3();         // Se crea un reproductor MP3 y uno WAV
        ReproductorDeAudio wav = new ReproductorWav();
        mp3.reproducir(cancionMP3);                            // Se reproduce la canción MP3 en el reproductor MP3
        mp3.reproducir(cancionWAV);                            // Se trata de reproducir la canción WAV en el reproductor MP3
        wav.reproducir(cancionWAV);                            // Se reproduce la canción WAV en el reproductor WAV
        wav.reproducir(cancionMP3);                            // Se trata de reproducir la canción MP3 en el reproductor WAV
        ReproductorDeAudio adaptador = new AdaptadorDeAudio(); // Se crea un adaptador de audio
        adaptador.reproducir(cancionMP3);                      // se reproducen las canciones (MP3 y WAV) desde el adaptador
        adaptador.reproducir(cancionWAV);
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
        /* throw new IllegalArgumentException("Formato invalido");
           ^^^ ^^^ ^^^ ^^^ ^^^
           Se comenta para que todos los patrones se puedan ejecutar sin ningún error
         */
        System.out.println("Formato invalido");
    }
}

class ReproductorWav implements ReproductorDeAudio {
    @Override
    public void reproducir(String archivo) {
        if (archivo.endsWith(".wav")) {
            System.out.println("Reproduciendo archivo WAV: " + archivo);
            return;
        }
        /* throw new IllegalArgumentException("Formato invalido");
           ^^^ ^^^ ^^^ ^^^ ^^^
           Se comenta para que todos los patrones se puedan ejecutar sin ningún error
         */
        System.out.println("Formato invalido");
    }
}

class AdaptadorDeAudio implements ReproductorDeAudio {
    private final ReproductorMp3 reproductorMp3 = new ReproductorMp3();

    @Override
    public void reproducir(String archivo) {
        String nuevoFormato = "";
        if (archivo.endsWith(".wav")) {
            nuevoFormato = archivo.substring(0, archivo.lastIndexOf(".")) + ".mp3";
            reproductorMp3.reproducir(nuevoFormato);
        } else if (archivo.endsWith(".mp3")) {   // Se agrega una condición para permitir la reproducción de ambos formatos
            reproductorMp3.reproducir(archivo);
        }
    }
}
