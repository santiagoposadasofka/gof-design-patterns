package org.example.creacion;

public class Builder {

    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     * */
    public void ejecutar(){
        Comida sandiwch = new ComidaBuilder()
                .pan("Blanco")
                .lechuga("crespa")
                .queso("Doble crema")
                .mayonesa("poca")
                .build();
        System.out.println(sandiwch.toString2());
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


    public String toString2() {
        String resultado = "Comida{";
        if (pan != null){
            resultado += "pan = " + pan+ "\\" ;
        }  if (carne != null) {
            resultado += "carne = " + carne+ "\\" ;
        }  if (lechuga != null) {
            resultado += "lechuga = " + lechuga+ "\\" ;
        }  if (tomate != null) {
            resultado += "tomate = " + tomate+ "\\" ;
        }  if (queso != null) {
            resultado +="queso = " + queso+ "\\" ;
        }  if (mayonesa != null) {
            resultado += "mayonesa = " + mayonesa+ "\\";
        }  if (mostaza != null) {
            resultado += "mostaza = " + mostaza+ "\\" ;
        }  if (ketchup != null) {
            resultado += "kechtup = " + ketchup+ "\\" + "}" ;
        }
        return resultado;
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