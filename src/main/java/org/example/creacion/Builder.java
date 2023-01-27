package org.example.creacion;

import java.sql.SQLOutput;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     * */

    Comida sanducheSencillo = new ComidaBuilder()
            .carne("jamon")
            .lechuga("crespa")
            .queso("Mozarella").build();

    Comida sanducheFull = new ComidaBuilder()
            .carne("Res")
            .tomate("en rodajas")
            .lechuga("crespa")
            .tomate("Mozarella")
            .mostaza("Mucha")
            .ketchup("poca")
            .build();

    public void ejecutar() {
        ComidaBuilder comidaB = new ComidaBuilder();
        comidaB.pan("Tostado").carne("Res").tomate("en rodajas").queso("Costeño").mayonesa("No").lechuga("crespa").tomate("Mozarella").mostaza("Mucha")
                .ketchup("poca").build();
        Comida comida = comidaB.build();
        System.out.println(comida.toString());

    }
    public Comida sanducheFull() {
        return sanducheFull;
    }
}


