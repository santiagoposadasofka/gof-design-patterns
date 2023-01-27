package org.example.estructura;

public class Proxy {
    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar información, permisos o lo que sea de interés antes
     * de permitir el acceso a la información
     * */
    public static void ejecutar(){
        ImagenProxy imagenProxy=new ImagenProxy("C:\\Users\\ivan0\\Downloads\\Captura de pantalla 2023-01-23 111037.png");
        imagenProxy.mostrar();
        System.out.println("\n");
        ComprasEnLineaProxy comprasEnLineaProxy=new ComprasEnLineaProxy(25000);
        comprasEnLineaProxy.comprar(30000);
        comprasEnLineaProxy.comprar(5000);
        comprasEnLineaProxy.consultarSaldo();
    }
}

interface Transaccion{
    void comprar(double monto);
    double consultarSaldo();
}

class ComprasEnLinea implements Transaccion{
    private double saldo;
    public ComprasEnLinea(double saldo) {
        this.saldo = saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void comprar(double monto) {
        this.setSaldo(consultarSaldo()-monto);
        System.out.println("Compra realizada por un monto de "+monto+"" +
                " Quedando con un saldo total de "+this.consultarSaldo());
    }
    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
class ComprasEnLineaProxy implements Transaccion{
    private ComprasEnLinea comprasEnLinea;
    private double saldo;
    public ComprasEnLineaProxy(double saldo) {
        this.saldo = saldo;
    }
    public ComprasEnLinea getComprasEnLinea() {
        return comprasEnLinea;
    }
    public void setComprasEnLinea(ComprasEnLinea comprasEnLinea) {
        this.comprasEnLinea = comprasEnLinea;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void comprar(double monto) {
        if(monto>this.consultarSaldo()){
            System.out.println("Saldo insuficiente para la compra");
            return;
        }
        if(this.getComprasEnLinea()==null){
            this.setComprasEnLinea(new ComprasEnLinea(this.consultarSaldo()));
        }
        this.getComprasEnLinea().comprar(monto);
        this.setSaldo(this.consultarSaldo()-monto);
    }
    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
interface Imagen {
    void mostrar();
}

class ImagenReal implements Imagen {
    private String rutaArchivo;

    public ImagenReal(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        cargarImagen();
    }

    public void mostrar() {
        System.out.println("Mostrando imagen: " + rutaArchivo);
    }

    private void cargarImagen() {
        System.out.println("Cargando imagen: " + rutaArchivo);
    }
}

class ImagenProxy implements Imagen {
    private ImagenReal imagenReal;
    private String rutaArchivo;

    public ImagenProxy(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(rutaArchivo);
        }
        imagenReal.mostrar();
    }
}

