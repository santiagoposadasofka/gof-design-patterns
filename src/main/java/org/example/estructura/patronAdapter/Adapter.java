package org.example.estructura.patronAdapter;



public class Adapter {
    /**
     * Permite cerrar brechas o transformar un elemento que
     * esta desarrollado o escrito en un leguaje ajeno para que pueda
     * ser interpretado por el recurso esperado
     * */

    public void ejecutarMp3() {
        ReproductorMp3 mp3 = new ReproductorMp3();
         mp3.reproducir(".mp3");
    }
    public void ejecutarWav() {
       ReproductorWav wav = new ReproductorWav();
       wav.reproducir(".wav");

    }
}

