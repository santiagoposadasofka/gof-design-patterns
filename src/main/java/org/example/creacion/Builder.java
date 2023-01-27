package org.example.creacion;

public class Builder {
    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     */

    /**
     * Método que permite ejecutar el patrón de Builder
     */
    public void ejecutarBuilder() {
        Comida sandwichMediano = new ComidaBuilder()
                .carne("pollo")
                .lechuga("crespa")
                .ketchup("poco")
                .pan("artesanal")
                .mayonesa("mucha")
                .build();
        System.out.println(sandwichMediano.toString());
    }
}

/**
 * Clase comida
 */
class Comida {

    /**
     * Atributos que permiten definir la clase comida
     */
    private String pan;
    private String carne;
    private String lechuga;
    private String tomate;
    private String queso;
    private String mayonesa;
    private String mostaza;
    private String ketchup;

    /**
     * Métodos setters
     */
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

    /**
     * Método toString el cual permite almacenar datos e imprimirlos en un texto (cadena de caracteres).
     */
    @Override
    public String toString() {
        return "Así quedó el sandwich que elegiste: \uD83E\uDD6A\n" +
                "Pan --> " + pan + "\n" +
                "Carne --> " + carne + "\n" +
                "Lechuga --> " + lechuga + "\n" +
                "Tomate --> " + tomate + "\n" +
                "Queso --> " + queso + "\n" +
                "Mayonesa --> " + mayonesa + "\n" +
                "Mostaza --> " + mostaza + "\n" +
                "Ketchup --> " + ketchup + "\n" +
                "¡Buen provecho!";
    }
}

/**
 * Clase comida Builder, permite crear instancias de la clase comida s
 */
class ComidaBuilder {
    private Comida comida;

    /**
     * Constructor
     */
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

    @Override
    public String toString() {
        return "ComidaBuilder{" +
                "comida=" + comida +
                '}';
    }
}