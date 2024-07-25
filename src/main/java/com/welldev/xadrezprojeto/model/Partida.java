package com.welldev.xadrezprojeto.model;

import java.io.Serializable;

public class Partida implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final int LINHA_TABULEIRO = 8;
    public static final int COLUNA_TABULEIRO = 8;

    private final Tabuleiro tabuleiro;
    public Jogador jogador1;
    public Jogador jogador2;
    public Jogador jogadorAtual;

    public Partida(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogadorAtual = jogador1;
        this.tabuleiro = new Tabuleiro(LINHA_TABULEIRO, COLUNA_TABULEIRO);
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        //Coloca as peças na posições iniciais
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void mudarJogador() {
        jogadorAtual = (jogadorAtual.equals(jogador1) ? jogador2 : jogador1);
    }
}
