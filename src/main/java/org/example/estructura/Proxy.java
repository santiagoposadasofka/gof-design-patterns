package org.example.estructura;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */
    public static void ejecutar(){
        System.out.println("Imágen Real");
        ImagenReal imagenReal = new ImagenReal("\"C:\\Users\\Yolima Alejandra\\Pictures\\Firma\\Foto.JPG\"");
        imagenReal.mostrar();
        System.out.println("");
        System.out.println("Imágen proxy");
        ImagenProxy imagenProxy = new ImagenProxy("C:\\Users\\Yolima Alejandra\\Pictures\\Firma");
        imagenProxy.mostrar();

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

