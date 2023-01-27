package org.example.creacion;

import java.rmi.MarshalledObject;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     */

    public void prepararSanduche() {

    Comida sanducheSencillo = new ComidaBuilder()
            .pan("integral")
            .carne("jamon")
            .lechuga("crespa")
            .queso("Mozarella").build();
        System.out.println("Preparando " + sanducheSencillo);

    Comida sanducheFull = new ComidaBuilder()
            .carne("Res")
            .tomate("en rodajas")
            .lechuga("crespa")
            .queso("Mozarella")
            .mostaza("Mucha")
            .ketchup("poca")
            .build();
        System.out.println("Preparando " + sanducheFull);

    Comida sanducheItaliano = new ComidaBuilder()
            .pan("Ajonjolí")
            .carne("Salami")
            .queso("Parmesano")
            .tomate("Verde")
            .build();
        System.out.println("Preparando " + sanducheItaliano);
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

        public String getPan(){
            return this.pan;
        }
        public void setPan(String pan) {
            this.pan = pan;
        }

        public String getCarne(){
            return this.carne;
        }

        public void setCarne(String carne) {
            this.carne = carne;
        }

        public String getLechuga(){
            return this.lechuga;
        }
        public void setLechuga(String lechuga) {
            this.lechuga = lechuga;
        }

        public String getTomate(){
            return this.tomate;
        }
        public void setTomate(String tomate) {
            this.tomate = tomate;
        }

        public String getQueso(){
            return this.queso;
        }
        public void setQueso(String queso) {
            this.queso = queso;
        }

        public String getMayonesa(){
            return this.mayonesa;
        }
        public void setMayonesa(String mayonesa) {
            this.mayonesa = mayonesa;
        }

        public String getMostaza(){
            return this.mostaza;
        }
        public void setMostaza(String mostaza) {
            this.mostaza = mostaza;
        }

        public String getKetchup(){
            return this.ketchup;
        }
        public void setKetchup(String ketchup) {
            this.ketchup = ketchup;
        }

        @Override
        public String toString(){
            return "Sanduche{pan: " + this.getPan() + ", " + "Carne: " + this.getCarne() + ", "
                    + "Tomate: " + this.getTomate() + ", " + "Lechuga: " + this.getLechuga() + ", "
                    + "Queso: " + this.getQueso() + ", " + "Mayonesa: " + this.getMayonesa() + ", "
                    + "Mostaza: " + this.getMostaza() + ", " + "Ketchup: " + this.getKetchup() + "}";
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

        public Comida build() {
            return this.comida;
        }
    }