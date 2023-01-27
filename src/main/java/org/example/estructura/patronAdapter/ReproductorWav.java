package org.example.estructura.patronAdapter;

public class ReproductorWav implements ReproductorDeAudio {
    @Override
    public void reproducir(String archivo) {
        if (archivo.endsWith(".wav")) {
            System.out.println("Reproduciendo archivo WAV: " + archivo);
            return;
        }
        throw new IllegalArgumentException("Formato invalido");
    }

}

