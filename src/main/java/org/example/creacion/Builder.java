package org.example.creacion;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     * */


public void ejecutar(){

    List<Comida> comidaBuild = new ArrayList<Comida>();

    Comida sanducheSencillo = new ComidaBuilder()
            .carne("jamon")
            .lechuga("crespa")
            .queso("Mozarella").build();

    Comida sanducheFull = new ComidaBuilder()
            .carne("Res")
            .tomate("en rodajas")
            .lechuga("crespa")
            .queso("Mozarella")
            .mostaza("Mucha")
            .ketchup("poca")
            .build();

    comidaBuild.add(sanducheSencillo);
    comidaBuild.add(sanducheFull);

        int i = 1;

        for (Comida comid:comidaBuild) {

            System.out.println("---------------pedido # " + i + "----------------");
            System.out.println("Pan: " + comid.getPan());
            System.out.println("Carne: " + comid.getCarne());
            System.out.println("Lechuga: " + comid.getLechuga());
            System.out.println("Tomate: " + comid.getTomate());
            System.out.println("Queso: " + comid.getQueso());
            System.out.println("Mayonesa: " + comid.getMayonesa());
            System.out.println("Mostaza: " + comid.getMostaza());
            System.out.println("Ketchup: " + comid.getKetchup());
            i++;

        }


    }

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

    public String getPan() {
        return pan;
    }

    public String getCarne() {
        return carne;
    }

    public String getLechuga() {
        return lechuga;
    }

    public String getTomate() {
        return tomate;
    }

    public String getQueso() {
        return queso;
    }

    public String getMayonesa() {
        return mayonesa;
    }

    public String getMostaza() {
        return mostaza;
    }

    public String getKetchup() {
        return ketchup;
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

    public Comida getComida() {
        return comida;
    }


}