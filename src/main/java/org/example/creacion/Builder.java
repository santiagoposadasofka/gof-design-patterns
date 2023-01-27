package org.example.creacion;

public class Builder {
    /**
     * Nos permite construir un objeto con diferentes niveles de especificidad,
     * o con diferente cantidad de atributos de forma facil y legible.
     * */
    public static void ejecutar(){
        Comida sanducheSencillo = new ComidaBuilder().carne("jamon").lechuga("crespa").queso("Mozarella").build();
        sanducheSencillo.comer();
        Computador computador= new ComputadorBuilder().Tamano("Grande").Procesador("i9").MemoriaRam("16GB")
                .setCapacidadDeAlmacenamiento("1TB").TipoDeAlmacenamiento("SSD").build();
        computador.jugar();
    }
}
class Computador {
    private String tamano, procesador, tarjetaGrafica, memoriaRam, tipoDeAlmacenamiento, capacidadDeAlmacenamiento;
    public void jugar(){
        System.out.println("Iniciando el juego seleccionado");
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public void setTipoDeAlmacenamiento(String tipoDeAlmacenamiento) {
        this.tipoDeAlmacenamiento = tipoDeAlmacenamiento;
    }
    public void setCapacidadDeAlmacenamiento(String capacidadDeAlmacenamiento) {
        this.capacidadDeAlmacenamiento = capacidadDeAlmacenamiento;
    }
}
class ComputadorBuilder{
    private Computador computador;
    public ComputadorBuilder(){
        computador=new Computador();
    }
    public ComputadorBuilder Tamano(String tamano) {
        computador.setTamano(tamano);
        return this;
    }
    public ComputadorBuilder Procesador(String procesador) {
        computador.setProcesador(procesador);
        return this;
    }
    public ComputadorBuilder TarjetaGrafica(String tarjetaGrafica) {
        computador.setTarjetaGrafica(tarjetaGrafica);
        return this;
    }
    public ComputadorBuilder MemoriaRam(String memoriaRam) {
        computador.setMemoriaRam(memoriaRam);
        return this;
    }
    public ComputadorBuilder TipoDeAlmacenamiento(String tipoDeAlmacenamiento) {
        computador.setTipoDeAlmacenamiento(tipoDeAlmacenamiento);
        return this;
    }
    public ComputadorBuilder setCapacidadDeAlmacenamiento(String capacidadDeAlmacenamiento) {
        computador.setCapacidadDeAlmacenamiento(capacidadDeAlmacenamiento);
        return this;
    }
    public Computador build(){
        return this.computador;
    }
}
class Comida {
    private String pan,carne,lechuga,tomate,queso,mayonesa,mostaza,ketchup;
    public void comer(){
        System.out.println("Comiendo el sandwich que tiene "+carne+", lechuga "+lechuga+", queso "+queso);
    }
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