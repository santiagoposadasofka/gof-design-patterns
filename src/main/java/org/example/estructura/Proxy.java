package org.example.estructura;

import java.util.ArrayList;
import java.util.List;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */
    public void ejecut(){
        System.out.println("___________Proxy Imagen _______________________");
        List<Imagen> LImagenes = new ArrayList<>();
        LImagenes.add(new ImagenProxy("c:oi/fotos"));
        LImagenes.add(new ImagenReal("c:oi/image"));

        for (Imagen image:LImagenes ) {
            image.mostrar();
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

