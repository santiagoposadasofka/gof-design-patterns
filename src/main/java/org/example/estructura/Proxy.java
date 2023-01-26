package org.example.estructura;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */

    /**
     * Metodo para ejecutar el patron.
     */
    public void ejecutarProxy() {
        ImagenReal imagenReal = new ImagenReal("C:/Desktop/imagen.jpg");
        imagenReal.mostrar();

        ImagenProxy imagenProxy = new ImagenProxy("C:/Imagenes/imagen2.jpg");
        imagenProxy.mostrar();
    }
}

/**
 * Interface Imagen
 */
interface Imagen {
    /**
     * Metodo para mostrar la imagen
     */
    void mostrar();
}


class ImagenReal implements Imagen {
    private String rutaArchivo;

    /**
     * Metodo constructor
     * @param rutaArchivo
     */
    public ImagenReal(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        cargarImagen();
    }

    /**
     * Metodo para mostrar la imagen real
     */
    public void mostrar() {
        System.out.println("Mostrando imagen: " + rutaArchivo);
    }

    /**
     * Metodo para cargar la imagen
     */
    private void cargarImagen() {
        System.out.println("Cargando imagen: " + rutaArchivo);
    }
}

class ImagenProxy implements Imagen {
    /**
     * Atributos
     */
    private ImagenReal imagenReal;
    private String rutaArchivo;

    /**
     * Metodo constructor
     * @param rutaArchivo
     */
    public ImagenProxy(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    /**
     * Metodo para instanciar una imagen y mostrar la imagen
     */
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(rutaArchivo);
        }
        imagenReal.mostrar();
    }
}

