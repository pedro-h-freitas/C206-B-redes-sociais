package com.inatel.pedro.RedesSociais;

import com.inatel.pedro.Interfaces.Compartilhamento;
import com.inatel.pedro.Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez streaming no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook");
    }

}
