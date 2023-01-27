package org.example.estructura;

import java.util.ArrayList;
import java.util.List;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */


    /**
     *
     */

    public void ejecutar() {


        Imagen imagen1 = new ImagenProxy("imagen1.jpg");
        Imagen imagen2 = new ImagenProxy("imagen2.jpg");
        Imagen imagen3 = new ImagenProxy("imagen3.jpg");

        imagen1.mostrar();
        imagen2.mostrar();
        imagen3.mostrar();


        ImagenReal imagen11 = new ImagenReal("imagen1vf.jpg");
        ImagenReal imagen22 = new ImagenReal("imagen2sdf.jpg");
        ImagenReal imagen33 = new ImagenReal("imagen3sdfsd.jpg");

        imagen11.mostrar();
        imagen22.mostrar();
        imagen3.mostrar();

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

