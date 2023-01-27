package org.example.estructura;

public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * esta desarrollado o escrito en un lenguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     * */

    public void ejecutar(){

        AdaptadorDeAudio adaptadorDeAudio = new AdaptadorDeAudio();
        adaptadorDeAudio.reproducir("audio.wav");
        adaptadorDeAudio.reproducir("Perfect.mp3");

    }
}


interface ReproductorDeAudio {
    void reproducir(String archivo);
}

class ReproductorMp3 implements ReproductorDeAudio {
    @Override
    public void reproducir(String archivo) {
        //Find out if the string ends with the specified characters:
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
    private ReproductorWav reproductorWav = new ReproductorWav();

    @Override
    public void reproducir(String archivo) {
        String nuevoFormato = "";
        if (archivo.endsWith(".wav")) {
            //substring Devuelve una subcadena
            nuevoFormato = archivo.substring(0, archivo.lastIndexOf(".")) + ".mp3";
            reproductorMp3.reproducir(nuevoFormato);
        } else if (archivo.endsWith(".mp3")) {
            nuevoFormato = archivo.substring(0, archivo.lastIndexOf(".")) + ".wav";
            reproductorWav.reproducir(nuevoFormato);
        }
    }
}
