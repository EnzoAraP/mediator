package org.example;

public class Vaca {

    public String solicitarProtecao(String mensagem) {
        return Fazenda.getInstancia().receberSolicitacaoProtecao(mensagem);
    }

    public String solicitarTransporte(String mensagem) {
        return Fazenda.getInstancia().receberSolicitacaoTransporte(mensagem);
    }
}
