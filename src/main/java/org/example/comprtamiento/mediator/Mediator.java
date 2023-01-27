package org.example.comprtamiento.mediator;


import org.example.comprtamiento.mediator.ChatMediator;
import org.example.comprtamiento.mediator.ChatRoom;
import org.example.comprtamiento.mediator.UsuarioNormal;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private ChatMediator mediador;
    private UsuarioNormal usuario ;

    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */

    public void ejecutarUsuarioNormal() {
        UsuarioNormal usuarioNormal = new UsuarioNormal(mediador , "Antonio");
        usuarioNormal.recibirMensaje("Se ha guardado  la informacion correctamente");

        //mp3.reproducir(".mp3");
    }
    public void ejecutarChatRoom() {
        ChatRoom usuarioChatRoom = new ChatRoom();
        usuarioChatRoom.enviarMensaje("Se ha enviado la informacion correctamente",usuario);

        //mp3.reproducir(".mp3");

    }

}


