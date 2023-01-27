package org.example.comprtamiento.mediator;

public interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);

    void agregarUsuario(Usuario usuario);
}
