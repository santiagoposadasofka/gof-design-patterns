package org.example.creacion;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     */

    public void crearSandwich() {

        Comida sanducheSencillo = new ComidaBuilder()
                .carne("jamon")
                .lechuga("crespa")
                .queso("Mozarella").build();
        System.out.println(sanducheSencillo.toString());


        Comida sanducheFull = new ComidaBuilder()
                .carne("Res")
                .tomate("en rodajas")
                .lechuga("crespa")
                .tomate("Mozarella")
                .mostaza("Mucha")
                .ketchup("poca")
                .build();
        System.out.println(sanducheFull.toString());

        Comida sanducheConTodo = new ComidaBuilder()
                .pan("Frances")
                .carne("Pavo")
                .lechuga("Crespa")
                .tomate("Verde")
                .queso("Doble crema")
                .mostaza("Muy poca")
                .ketchup("Mucha")
                .mayonesa("Mucha")
                .build();
        System.out.println(sanducheConTodo.toString());


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

    @Override
    public String toString() {
        String sandwich = "El sandwich seleccionado contiene:";
        if (pan != null) {
            sandwich += "pan " + pan + ", ";
        }
        if (carne != null) {
            sandwich += "carne de " + carne + ", ";
        }
        if (lechuga != null) {
            sandwich += "lechuga " + lechuga + ", ";
        }
        if (tomate != null) {
            sandwich += "tomate " + tomate + ", ";
        }
        if (queso != null) {
            sandwich += "queso " + queso + ", ";
        }
        if (mayonesa != null) {
            sandwich += mayonesa + " mayonesa" + ", ";
        }
        if (mostaza != null) {
            sandwich += mostaza + " mostaza" + ", ";
        }
        if (ketchup != null) {
            sandwich += ketchup + " ketchup" + ".";
        }
        return sandwich;
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