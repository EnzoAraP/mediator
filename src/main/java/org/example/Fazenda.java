package org.example;

public class Fazenda {

    private static final Fazenda instancia = new Fazenda();

    private Fazenda() {}

    public static Fazenda getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoProtecao(String mensagem) {
        return "A Fazenda recebeu a solicitação.\n" +
                "O Cachorro respondeu conforme mensagem a seguir.\n" +
                ">>" + Cachorro.getInstancia().receberSolicitacao(mensagem);
    }

    public String receberSolicitacaoTransporte(String mensagem) {
        return "A Fazenda recebeu a solicitação.\n" +
                "O Cavalo respondeu conforme mensagem a seguir.\n" +
                ">>" + Cavalo.getInstancia().receberSolicitacao(mensagem);
    }
}
