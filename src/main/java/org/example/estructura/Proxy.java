package org.example.estructura;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */

    /**
     * Método que permite ejecutar la clase Proxy
     */
    public void ejecutarProxy (){
        ImagenReal imagenReal = new ImagenReal("escritorio/imagen.jpg");
        imagenReal.mostrar();

        ImagenProxy imagenProxy = new ImagenProxy("imágenes/imagen.png");
        imagenProxy.mostrar();
    }
}

/**
 * Interface imagen
 */
interface Imagen {
    void mostrar();
}

/**
 * Clase imagen real que implementa la interface imagen
 */
class ImagenReal implements Imagen {
    private String rutaArchivo;

    /**
     * Método que carga la imagen
     * @param rutaArchivo
     */
    public ImagenReal(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        cargarImagen();
    }

    /**
     * Método que permite mostrar la imagen
     */
    public void mostrar() {
        System.out.println("Mostrando imagen: " + rutaArchivo);
    }

    /**
     * Método que permite cargar la imagen
     */
    private void cargarImagen() {
        System.out.println("Cargando imagen: " + rutaArchivo);
    }
}

/**
 * Clase imagen proxy la cual implementa la interface imagen
 */
class ImagenProxy implements Imagen {
    private ImagenReal imagenReal;
    private String rutaArchivo;

    /**
     * Constructor
     * @param rutaArchivo
     */
    public ImagenProxy(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    /**
     * Método que permite mostrar una imagen si existe, en caso de
     * que no se instancia.
     */
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(rutaArchivo);
        }
        imagenReal.mostrar();
    }
}

