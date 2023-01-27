package org.example.estructura;

/*
 * Es un intermediario que se pone al frente del recurso real para asi validar información, permisos o lo que sea de
 * interés antes de permitir el acceso a la información.
 */

public class Proxy {
    public void ejecutar() {
        //...
    }
}

interface Imagen {
    void mostrar();
}

class ImagenReal implements Imagen {
    private final String rutaArchivo;

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
    private final String rutaArchivo;

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

