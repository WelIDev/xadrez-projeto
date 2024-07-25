package com.welldev.xadrezprojeto.model;

public class Tabuleiro {

    private Peca[][] pecas;
    private int linhas;
    private int colunas;

    public Tabuleiro(int linhas, int colunas) {
        this.colunas = colunas;
        this.linhas = linhas;
        this.pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca getPecas(int x, int y) {
        return pecas[y][x];
    }
}
