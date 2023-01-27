package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */

        public void ejecutor(){

            System.out.println("_____________________Mediator_______________________________");

            ChatMediator chatRoom = new ChatRoom();

            Usuario usuario1 = new UsuarioNormal(chatRoom,"Pedro");
            chatRoom.agregarUsuario(usuario1);
            chatRoom.enviarMensaje("Empleado del mes, felicidades",usuario1);

            Usuario usuario2 = new UsuarioNormal(chatRoom,"Pablo");
            chatRoom.agregarUsuario(usuario2);
            chatRoom.enviarMensaje("Has realizado el pago con exito",usuario2);

            Usuario usuario3 = new UsuarioNormal(chatRoom,"Iker");
            chatRoom.agregarUsuario(usuario3);
            chatRoom.enviarMensaje("Semestre aprobado",usuario3);

            Usuario usuario4 = new UsuarioNormal(chatRoom,"Maria");
            chatRoom.agregarUsuario(usuario4);
            chatRoom.enviarMensaje("Viaje aplazado por motivos personales",usuario4);

            Usuario usuario5 = new UsuarioNormal(chatRoom,"Flor");
            chatRoom.agregarUsuario(usuario5);
            chatRoom.enviarMensaje("Cita medica cancelada",usuario5);

        }


}


interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);
}

class ChatRoom implements ChatMediator {
    private List<Usuario> usuarios;

    public ChatRoom() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}

abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(ChatMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviarMensaje(String mensaje);

    public abstract void recibirMensaje(String mensaje);
}

class UsuarioNormal extends Usuario {
    public UsuarioNormal(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + ": Enviando mensaje = " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
