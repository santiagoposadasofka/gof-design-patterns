package org.example.estructura;

/*
 * Permite cerrar brechas o transformar un elemento que está desarrollado o escrito en un lenguaje ajeno para que pueda
 * ser interpretado por el recurso esperado.
 */

public class Adapter {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        String cancionMP3 = "Adonay.mp3";
        String cancionWAV = "Limoncito con Ron.wav";
        ReproductorDeAudio mp3 = new ReproductorMp3();
        ReproductorDeAudio wav = new ReproductorWav();
        mp3.reproducir(cancionMP3);
        mp3.reproducir(cancionWAV);
        wav.reproducir(cancionWAV);
        wav.reproducir(cancionMP3);
        ReproductorDeAudio adaptador = new AdaptadorDeAudio();
        adaptador.reproducir(cancionMP3);
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
        // throw new IllegalArgumentException("Formato invalido");
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
        // throw new IllegalArgumentException("Formato invalido");
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
        } else if (archivo.endsWith(".mp3")) {
            reproductorMp3.reproducir(archivo);
        }
    }
}
