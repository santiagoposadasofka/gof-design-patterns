package org.example.estructura;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */

    public void Ejecutar(){
        ImagenReal imagenReal = new ImagenReal("//miEscritorio");
        ImagenProxy imagenProxy = new ImagenProxy("http://holis");
        imagenProxy.mostrar();
        imagenReal.mostrar();

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

