package org.example.comprtamiento.mediator;

public class UsuarioNormal extends Usuario {


    public UsuarioNormal(ChatMediator mediator, String nombre) {

        super(mediator, nombre);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + ": Enviando mensaje = " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
