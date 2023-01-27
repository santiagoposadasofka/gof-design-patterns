package org.example.estructura;

public class Proxy {

    public void ejecutar(){
        ImagenProxy imagen = new ImagenProxy("/home/hola.jpg");
        imagen.mostrar();
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

