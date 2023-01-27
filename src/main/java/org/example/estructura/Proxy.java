package org.example.estructura;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */
    public void mostrarImagen(){

        ImagenReal imagenNasa = new ImagenReal("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/web_first_images_release_0.png?itok=eP3obzhq");
        imagenNasa.mostrar();


        ImagenProxy imagenPerro = new ImagenProxy("https://img.freepik.com/foto-gratis/vista-frontal-hermoso-perro-espacio-copia_23-2148786499.jpg?w=996&t=st=1674828521~exp=1674829121~hmac=5e3728e0d13e692f4fbe906790d419fa468a292125784b0de0cdb6f7a723e399");
        imagenPerro.mostrar();
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

