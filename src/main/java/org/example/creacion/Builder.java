package org.example.creacion;

/*
 * Permite construir un objeto con diferentes niveles de especificidad, o con diferente cantidad de atributos de forma
 * fácil y legible.
 */

public class Builder {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        Comida sanducheSencillo = new ComidaBuilder()
                .pan("Tajado")
                .carne("jamon")
                .lechuga("crespa")
                .queso("Mozarella")
                .build();

        Comida sanducheFull = new ComidaBuilder().pan("Tajado")
                .carne("Res")
                .tomate("en rodajas")
                .lechuga("crespa")
                .tomate("Mozarella")
                .mostaza("Mucha")
                .ketchup("poca")
                .build();

        Comida hamburguesaConMayonesa = new ComidaBuilder()
                .pan("Redondo")
                .carne("Res")
                .tomate("Rodajas")
                .lechuga("Crespa")
                .queso("Americano")
                .mayonesa("Mucha")
                .build();
        sanducheSencillo.setMostaza("Poca");
        sanducheFull.setMayonesa("Normal");
        hamburguesaConMayonesa.setCarne("Res y tocineta");
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
}

class ComidaBuilder {
    private final Comida comida;

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

    public Comida build() {
        return this.comida;
    }
}