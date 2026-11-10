package org.example;

public class Cavalo implements Colaborador {

    private static final Cavalo instancia = new Cavalo();

    private Cavalo() {}

    public static Cavalo getInstancia() {
        return instancia;
    }

    @Override
    public String receberSolicitacao(String mensagem) {
        return "O Cavalo vai transportar o feno das vacas: " + mensagem;
    }
}
