package org.example.comprtamiento.observer;


public class Observer {
    public static void ejecutar(){
        Clima lectorTemperatura = new Clima();
        CondicionesActuales salon1 = new CondicionesActuales();
        CondicionesActuales salon2 = new CondicionesActuales();

        lectorTemperatura.registerObserver(salon1);
        lectorTemperatura.registerObserver(salon2);

        lectorTemperatura.setMedidas(37,16,19);
        System.out.println("La temperatura excede limite del aire acondicionado");
        lectorTemperatura.setMedidas(20,10,25);

        System.out.println("Nueva notificacion: "+ salon1.toString());

    }

    //public void ejecutarCondicionActual() {
      //  CondicionesActuales condicioActual = new CondicionesActuales();
      //  condicioActual.setTemp(5).setHumedad(67).setPresion(10);
        //System.out.println(condicioActual.toString());
   // }

}
