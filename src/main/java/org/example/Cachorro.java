package org.example;

public class Cachorro implements Colaborador {

    private static final Cachorro instancia = new Cachorro();

    private Cachorro() {}

    public static Cachorro getInstancia() {
        return instancia;
    }

    @Override
    public String receberSolicitacao(String mensagem) {
        return "O Cachorro vai proteger as vacas: " + mensagem;
    }
}
