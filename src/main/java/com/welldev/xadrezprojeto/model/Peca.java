package com.welldev.xadrezprojeto.model;

public abstract class Peca {

    private String cor;
    private int posX;
    private int posY;

    public Peca(String cor, int posX, int posY) {
        this.cor = cor;
        this.posX = posX;
        this.posY = posY;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public abstract boolean movimentoValido(int xDestino, int yDestino);

    protected boolean posicaoValida(int posX, int posY) {
        return posX >= 0 && posY >= 0 && posX < 8 && posY < 8;
    }
}
