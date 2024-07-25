package com.welldev.xadrezprojeto.model;

public abstract class Peca {

    private String color;
    private int posX;
    private int posY;

    public Peca(String cor, int posX, int posY) {
        this.color = cor;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
