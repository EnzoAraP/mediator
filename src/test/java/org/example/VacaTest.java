package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacaTest {

    @Test
    void deveSolicitarProtecao() {
        Vaca vaca = new Vaca();
        assertEquals("A Fazenda recebeu a solicitação.\n" +
                "O Cachorro respondeu conforme mensagem a seguir.\n" +
                ">>O Cachorro vai proteger as vacas: Há um lobo perto das vacas no pasto",
                vaca.solicitarProtecao("Há um lobo perto das vacas no pasto"));
    }

    @Test
    void deveSolicitarTransporte() {
        Vaca vaca = new Vaca();
        assertEquals("A Fazenda recebeu a solicitação.\n" +
                "O Cavalo respondeu conforme mensagem a seguir.\n" +
                ">>O Cavalo vai transportar o feno das vacas: Trazer feno para alimentar as vacas",
                vaca.solicitarTransporte("Trazer feno para alimentar as vacas"));
    }
}
