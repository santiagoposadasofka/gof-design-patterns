package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */
    public void ejecutar(){
        ChatMediator chatRoom = new ChatRoom();
        Usuario usuario1 = new UsuarioNormal(chatRoom,"laura");
        Usuario usuario2 = new UsuarioNormal(chatRoom,"pedro");
        Usuario usuario3 = new UsuarioNormal(chatRoom,"rodrigo");
        Usuario usuario4 = new UsuarioNormal(chatRoom,"patricia");
        chatRoom.agregarUsuario(usuario1);
        chatRoom.agregarUsuario(usuario2);
        chatRoom.agregarUsuario(usuario3);
        chatRoom.enviarMensaje("buenos dias laura",usuario2);
        chatRoom.enviarMensaje("hola pedro",usuario3);
        chatRoom.enviarMensaje("como va tu dia rodrigo", usuario1);
        chatRoom.enviarMensaje("hoal muchachos",usuario4);

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
