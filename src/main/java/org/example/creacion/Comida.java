package org.example.creacion;

public class Comida {
    private String pan;
    private String carne;
    private String lechuga;
    private String tomate;
    private String queso;
    private String mayonesa;
    private String mostaza;
    private String ketchup;

    public String setPan(String pan) {
        this.pan = pan;
        return pan;
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
        return "Comida{" +
                "pan:'" + pan + '\'' +
                ", carne:'" + carne + '\'' +
                ", lechuga: '" + lechuga + '\'' +
                ", tomate: '" + tomate + '\'' +
                ", queso: '" + queso + '\'' +
                ", mayonesa: '" + mayonesa + '\'' +
                ", mostaza: '" + mostaza + '\'' +
                ", ketchup: '" + ketchup + '\'' +
                '}';
    }
}
