package com.inatel.pedro.RedesSociais;

import com.inatel.pedro.Interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter");
    }
}
