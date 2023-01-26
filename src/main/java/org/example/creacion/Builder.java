package org.example.creacion;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     */


    /**
     * Método para la ejecución del patron
     */
    public void ejecutarBuilder() {
        Comida sandwichVegetariano = new ComidaBuilder().carne("lentejas").tomate("fresco").lechuga("romana").mayonesa("poca").pan("integral").build();

        System.out.println(sandwichVegetariano.toString());
    }


    /**
     * Clase que representa comida
     */
    class Comida {
        /**
         * Atributos necesarios para describir una comida
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
         * Metódos setters
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
         * El metódo toString nos retorna una concatenacion de los ingredientes para despues mostrarlos al usuario
         * @return
         */
        @Override
        public String toString() {
            return "Tu sandwich tiene los siguites ingredientes: pan " + pan + ", carne " + carne + ", lechuga " + lechuga + ", tomate " + tomate
                    + ", queso " + queso + ", mayonesa " + mayonesa + ", mostaza " + mostaza + " y ketchup " + ketchup;
        }
    }

    /**
     * Crea una nueva instancia de la comida con los atributos establecidos
     */
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
}