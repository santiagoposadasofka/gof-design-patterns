package org.example.creacion;

import java.awt.event.ItemEvent;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     * */

    public void ejecutarBuilder(){
        AccesoriosPc pcCompleto=new AccesoriosPcBuilder()
                .control("Xbox")
                .diadema("Gamer")
                .mouse("Gamer")
                .teclado("Logitech")
                .pantalla("Asus")
                .build();
        System.out.println(pcCompleto.toString());
    }
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
}


class Comida {
    private String pan;
    private String carne;
    private String lechuga;
    private String tomate;
    private String queso;
    private String mayonesa;
    private String mostaza;
    private String ketchup;

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public void setMayonesa(String mayonesa) {
        this.mayonesa = mayonesa;
    }

    public void setMostaza(String mostaza) {
        this.mostaza = mostaza;
    }

    public void setKetchup(String ketchup) {
        this.ketchup = ketchup;
    }
}

class ComidaBuilder {
    private Comida comida;

    public ComidaBuilder() {
        comida = new Comida();
    }

    public ComidaBuilder pan(String pan) {
        comida.setPan(pan);
        return this;
    }

    public ComidaBuilder carne(String carne) {
        comida.setCarne(carne);
        return this;
    }

    public ComidaBuilder lechuga(String lechuga) {
        comida.setLechuga(lechuga);
        return this;
    }

    public ComidaBuilder tomate(String tomate) {
        comida.setTomate(tomate);
        return this;
    }

    public ComidaBuilder queso(String queso) {
        comida.setQueso(queso);
        return this;
    }

    public ComidaBuilder mayonesa(String mayonesa) {
        comida.setMayonesa(mayonesa);
        return this;
    }

    public ComidaBuilder mostaza(String mostaza) {
        comida.setMostaza(mostaza);
        return this;
    }

    public ComidaBuilder ketchup(String ketchup) {
        comida.setKetchup(ketchup);
        return this;
    }

    public Comida build(){
        return this.comida;
    }
}

class AccesoriosPc{
    private String teclado;
    private String mouse;
    private String pantalla;
    private String mousepad;
    private String diademas;
    private String control;

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public void setMousepad(String mousepad) {
        this.mousepad = mousepad;
    }

    public void setDiademas(String diademas) {
        this.diademas = diademas;
    }

    public void setControl(String control) {
        this.control = control;
    }

    @Override
    public String toString() {
        return "AccesoriosPc{" +
                "teclado='" + teclado + '\'' +
                ", mouse='" + mouse + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", mousepad='" + mousepad + '\'' +
                ", diademas='" + diademas + '\'' +
                ", control='" + control + '\'' +
                '}';
    }
}

class AccesoriosPcBuilder{
    private AccesoriosPc accesoriosPc;

    public AccesoriosPcBuilder() {
        accesoriosPc=new AccesoriosPc();
    }

    public AccesoriosPcBuilder mouse(String mouse) {
        accesoriosPc.setTeclado(mouse);
        return this;
    }

    public AccesoriosPcBuilder pantalla(String pantalla) {
        accesoriosPc.setTeclado(pantalla);
        return this;
    }

    public AccesoriosPcBuilder diadema(String diadema) {
        accesoriosPc.setTeclado(diadema);
        return this;
    }

    public AccesoriosPcBuilder mousepad(String mousepad) {
        accesoriosPc.setTeclado(mousepad);
        return this;
    }

    public AccesoriosPcBuilder control(String control) {
        accesoriosPc.setTeclado(control);
        return this;
    }

    public AccesoriosPcBuilder teclado(String teclado) {
        accesoriosPc.setTeclado(teclado);
        return this;
    }

    public AccesoriosPc build(){
        return this.accesoriosPc;
    }
}