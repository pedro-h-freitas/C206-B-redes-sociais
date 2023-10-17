package com.inatel.pedro.RedesSociais;

import com.inatel.pedro.Interfaces.Compartilhamento;
import com.inatel.pedro.Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez streaming no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus");
    }
}
