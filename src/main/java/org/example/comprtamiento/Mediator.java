package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    public void ejecutar(){
        ChatRoom mediador = new ChatRoom();

        UsuarioNormal usuario1 = new UsuarioNormal(new ChatRoom(), "Carlos");
        UsuarioNormal usuario2 = new UsuarioNormal(new ChatRoom(), "Roberto");

        mediador.agregarUsuario(usuario1);
        System.out.println("Se agregó usuario 1");

        mediador.agregarUsuario(usuario2);
        System.out.println("Se agregó usuario 2");

        mediador.enviarMensaje("Hola", usuario1);
        mediador.enviarMensaje("Hola, como estàs", usuario2);



    }
    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */
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
