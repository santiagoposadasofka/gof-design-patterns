package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

// Permite interactuar con diferentes objetos por medio de un intermediario.

public class Mediator {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        ChatMediator discord = new ChatRoom();
        Usuario u1 = new UsuarioNormal(discord, "Juan");
        Usuario u2 = new UsuarioNormal(discord, "Luis");
        discord.agregarUsuario(u1);
        discord.agregarUsuario(u2);
        u1.enviarMensaje("Hola a todos!");
    }
}

interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);

    void agregarUsuario(Usuario usuario);
}

class ChatRoom implements ChatMediator {
    private final List<Usuario> usuarios;

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
    public void recibirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
