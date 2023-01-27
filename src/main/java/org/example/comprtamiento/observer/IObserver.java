package org.example.comprtamiento.observer;


/**
 * Permite notificar a todos los interesados sobre un cambio.
 * */
interface IObserver {
    void update(float temp, float humedad, float presion);
}


