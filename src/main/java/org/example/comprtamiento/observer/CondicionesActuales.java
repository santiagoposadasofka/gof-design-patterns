package org.example.comprtamiento.observer;

class CondicionesActuales implements IObserver, DisplayElement {
    private float temp;
    private float humedad;
    private float presion;

    public CondicionesActuales(float temp, float humedad, float presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
    }

    public float temp() {
        return temp;
    }

    public CondicionesActuales() {
    }

    public CondicionesActuales setTemp(float temp) {
        this.temp = temp;
        return this;
    }

    public float humedad() {
        return humedad;
    }

    public CondicionesActuales setHumedad(float humedad) {
        this.humedad = humedad;
        return this;
    }

    public float presion() {
        return presion;
    }

    public CondicionesActuales setPresion(float presion) {
        this.presion = presion;
        return this;
    }

    @Override
    public void update(float temp, float humedad, float presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
    }

    @Override
    public void display() {
        this.toString();
    }

    @Override
    public String toString() {
        return "CondicionesActuales{" +
                "temp=" + temp +
                ", humedad=" + humedad +
                ", presion=" + presion +
                '}';
    }
}
