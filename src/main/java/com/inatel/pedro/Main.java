package com.inatel.pedro;

import com.inatel.pedro.RedesSociais.*;
import com.inatel.pedro.Usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        RedeSocial[] redesSociais = new RedeSocial[2];

        redesSociais[0] = new Facebook("1234", 400);
        redesSociais[1] = new Instagram("12344567789", 1000);

        Usuario usuario = new Usuario("Usuario u", "example@example.com", redesSociais);

        ((Facebook)usuario.redesSociais[0]).fazStreaming();
        ((Facebook)usuario.redesSociais[0]).compartilhar();
        usuario.redesSociais[0].postarVideo();

        usuario.redesSociais[1].postarFoto();
        usuario.redesSociais[1].postarComentario();
        usuario.redesSociais[1].curtirPublicacao();

    }
}