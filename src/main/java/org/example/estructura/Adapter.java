package org.example.estructura;

public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * esta desarrollado o escrito en un leguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     * */
    public static void ejecutar(){
        ReproductorWav  reproductorWav1 = new ReproductorWav();
        reproductorWav1.reproducir("Sweep Me Off My Feet.wav");

        ReproductorMp3 reproductorMp3 = new ReproductorMp3();
        reproductorMp3.reproducir("Sweep Me Off My Feet.mp3");

        System.out.println(" ");
        System.out.println("Adaptador de audio");
        AdaptadorDeAudio adaptadorDeAudio = new AdaptadorDeAudio();
        adaptadorDeAudio.reproducir("Sweep Me Off My Feet.wav");
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
