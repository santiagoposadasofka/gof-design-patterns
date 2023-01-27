package org.example.estructura.proxy;

public class Proxy {

    /**
     * Es un intermediario que se pone al frente del recurso real
     * para asi validar informacion, permisos o lo que sea de interes antes
     * de permitit el acceso a la información
     * */

    public void ejecutarImagenProxy() {
        ImagenProxy imagenProxy = new ImagenProxy("C:\\Users\\ospin\\Desktop\\SofkaU\\Imagen");
        imagenProxy.mostrar();

        //mp3.reproducir(".mp3");
    }
    public void ejecutarImagenReal() {
        ImagenReal imagenReal = new ImagenReal("C:\\Users\\ospin\\Desktop\\SofkaU\\Imagen");
        imagenReal.mostrar();
    }

}

