package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */

    /**
     * Método que permite ejecutar la clase Mediator
     */
    public void ejecutarMediator (){
        ChatRoom chatRoom = new ChatRoom();

        Usuario usuario = new UsuarioNormal(chatRoom, "Gretty22");
        Usuario usuario1 = new UsuarioNormal(chatRoom, "Maria02");

        chatRoom.agregarUsuario(usuario);
        chatRoom.agregarUsuario(usuario1);

        usuario.enviarMensaje("Saludo a Maria");
        usuario1.enviarMensaje("Saludo a Gretty");
    }
}

/**
 * Interface chat mediator
 */
interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);
}

/**
 * Clase chat room que implementa la interface chat mediator
 */
class ChatRoom implements ChatMediator {
    private List<Usuario> usuarios;

    public ChatRoom() {
        usuarios = new ArrayList<>();
    }

    /**
     * Este método permite enviar un mensaje a otro usuario ya existente
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
     * Este método permite agregar un nuevo usuario
     * @param usuario
     */
    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}

/**
 * Clase y métodos abstractos de un usuario en el chat
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
 * Clase de usuario normal el cual hereda de la clase abstracta usuario
 */
class UsuarioNormal extends Usuario {
    public UsuarioNormal(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    /**
     * Método que permite enviar un mensaje a un usuario
     * @param mensaje
     */
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + ": Enviando mensaje = " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    /**
     * Método que permite recibir un mensaje de otro usuario
     * @param mensaje
     */
    @Override
    public void recibirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}