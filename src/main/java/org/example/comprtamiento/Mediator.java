package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */


    public void ejecutarMediator () {
        ChatMediator chatRoom = new ChatRoom();

        Usuario usuario1 = new UsuarioNormal(chatRoom, "Miguel");
        Usuario usuario2 = new UsuarioNormal(chatRoom, "Gretty" );

        chatRoom.agregarUsuario(usuario1);
        chatRoom.agregarUsuario(usuario2);

        usuario1.enviarMensaje("Hola Gretty");
        usuario2.enviarMensaje("Hola Miguel");
    }
}

/**
 * Interfaz que define el comportamiento de un medio de comunicación en un chat.
 */
interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);
}

/**
 * Clase que implementa la interfaz ChatMediator
 */
class ChatRoom implements ChatMediator {
    /**
     * Lista de usuarios en el chat
     */
    private List<Usuario> usuarios;

    /**
     * Constructor
     */
    public ChatRoom() {
        usuarios = new ArrayList<>();
    }

    /**
     * Envia un mensaje a todos los usuarios en el chat excepto al usuario que lo envió
     * @param mensaje
     * @param usuario
     */
    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }
    /**
     * Agrega un usuario al chat
     * @param usuario
     */
    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}

/**
 * Clase abstracta que define un usuario en el chat
 */
abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    /**
     * Constructor
     * @param mediator
     * @param nombre
     */
    public Usuario(ChatMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviarMensaje(String mensaje);

    public abstract void recibirMensaje(String mensaje);
}

/**
 * La Clase UsuarioNormal extiende de la clase usuario y representa un usuario normal en el chat.
 */
class UsuarioNormal extends Usuario {
    /**
     * Constuctor
     * @param mediator
     * @param nombre
     */
    public UsuarioNormal(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    /**
     * Metodo para enviar un mensaje en el chat
     * @param mensaje
     */
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + ": Enviando mensaje = " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    /**
     * Recibe un mensaje a través del mediador del chat
     * @param mensaje
     */
    @Override
    public void recibirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
