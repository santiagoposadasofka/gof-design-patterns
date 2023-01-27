package org.example.comprtamiento.mediator;


import org.example.comprtamiento.mediator.ChatMediator;
import org.example.comprtamiento.mediator.ChatRoom;
import org.example.comprtamiento.mediator.UsuarioNormal;

import java.util.ArrayList;
import java.util.List;

public class Mediator {


    /**
     * Permite interactuar con diferentes objetos por medio de un intermediario.
     * */

    public static void ejecutar(){
        ChatRoom sala = new ChatRoom();
        UsuarioNormal pedro = new UsuarioNormal(sala, "Pedro");
        UsuarioNormal camila = new UsuarioNormal(sala, "Camila");
        UsuarioNormal manuel = new UsuarioNormal(sala, "Manuel");
        sala.agregarUsuario(pedro);
        sala.agregarUsuario(camila);
        sala.agregarUsuario(manuel);
        pedro.enviarMensaje("Hola");

    }


}


