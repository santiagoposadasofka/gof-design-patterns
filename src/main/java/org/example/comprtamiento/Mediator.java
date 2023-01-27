package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     */


    public void ejecutar() {
        ChatRoom sala = new ChatRoom();

        UsuarioNormal juan = new UsuarioNormal(sala, "juan");
        UsuarioNormal yeison = new UsuarioNormal(sala, "yeison");
        UsuarioNormal zulay = new UsuarioNormal(sala, "zulay");

        sala.agregarUsuario(juan);
        sala.agregarUsuario(yeison);
        sala.agregarUsuario(zulay);

        juan.enviarMensaje("hola soy pedro");
        yeison.recibirMensaje("hola pedro soy yeison");


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

    @Override
    public String toString() {
        return "Usuario{" +
                "mediator=" + mediator +
                ", nombre='" + nombre + '\'' +
                '}';
    }
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
