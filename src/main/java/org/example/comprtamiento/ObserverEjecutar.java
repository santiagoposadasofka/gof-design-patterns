package org.example.comprtamiento;

/**
 * Permite notificar a todos los interesados sobre un cambio.
 */
public class ObserverEjecutar {
    public void ejecutar() {

        Clima lectorTem = new Clima();
        CondicionesActuales piso1 = new CondicionesActuales();
        CondicionesActuales piso2 = new CondicionesActuales();
        lectorTem.registerObserver(piso1);
        lectorTem.registerObserver(piso2);
        lectorTem.setMedidas(29, 28, 19);
        System.out.println("Cambiamos a temperatura que excede limite del aire acondicionado" +  lectorTem.toString());
        lectorTem.setMedidas(12, 29, 19);


    }
}
