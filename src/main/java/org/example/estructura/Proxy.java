package org.example.estructura;

import java.util.ArrayList;
import java.util.List;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     *
     * El patrón proxy es un patrón de diseño estructural que se utiliza para
     * proporcionar una interfaz de control de acceso a un objeto. Un proxy es un
     * objeto que actúa como intermediario entre un cliente y un objeto real, con el
     * objetivo de controlar el acceso a este último. El proxy puede proporcionar servicios
     * adicionales, como el seguimiento de estadísticas, la implementación de seguridad o la optimización
     * de rendimiento.
     * */

    public void ejecutar (){
        List <Imagen> misImagenes = new ArrayList<>();
        misImagenes.add(new ImagenReal("/home/usuario/imagenes/ImagenGatito.jpg"));
        for (Imagen imagen : misImagenes) {
            imagen.mostrar();
        }



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

