package com.inatel.pedro.RedesSociais;

public class Instagram extends RedeSocial {
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no Instagram");
    }

}
