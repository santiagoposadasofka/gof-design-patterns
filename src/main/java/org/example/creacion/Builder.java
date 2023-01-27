package org.example.creacion;

public class Builder {

    public void cocinar(){
        Comida sanducheSencillo = new ComidaBuilder()
                .carne("jamon")
                .lechuga("crespa")
                .queso("Mozarella").build();
        System.out.println("Sanduche cocinado");

        Comida sanducheFull = new ComidaBuilder()
                .carne("Res")
                .tomate("en rodajas")
                .lechuga("crespa")
                .tomate("Mozarella")
                .mostaza("Mucha")
                .ketchup("poca")
                .build();
        System.out.println("Sanduche full cocinado");

        Comida perroCaliente = new ComidaBuilder()
                .panperro("Integral")
                .salchicha("cocinada")
                .tocineta("Bien frita")
                .ripio("de papa")
                .mayonesa("moderada")
                .tomate("mucha")
                .build();
        System.out.println("Perro caliente cocinado");

    }

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     * */

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
    private String panperro;
    private String salchicha;
    private String ripio;
    private String tocineta;

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

    public void setPanperro(String panperro) {
        this.panperro = panperro;
    }

    public void setSalchicha(String salchicha) {
        this.salchicha = salchicha;
    }

    public void setRipio(String ripio) {
        this.ripio = ripio;
    }

    public void setTocineta(String tocineta) {
        this.tocineta = tocineta;
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

    public ComidaBuilder panperro(String panperro) {
        comida.setPanperro(panperro);
        return this;
    }
    public ComidaBuilder salchicha(String salchicha) {
        comida.setSalchicha(salchicha);
        return this;
    }
    public ComidaBuilder tocineta(String tocineta) {
        comida.setTocineta(tocineta);
        return this;
    }
    public ComidaBuilder ripio(String ripio) {
        comida.setRipio(ripio);
        return this;
    }


    public Comida build(){
        return this.comida;
    }

}