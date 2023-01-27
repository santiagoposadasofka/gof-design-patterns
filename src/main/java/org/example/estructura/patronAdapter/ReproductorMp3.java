package org.example.estructura.patronAdapter;

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
