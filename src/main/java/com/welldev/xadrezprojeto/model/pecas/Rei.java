package com.welldev.xadrezprojeto.model.pecas;

import com.welldev.xadrezprojeto.model.partida.Peca;

public class Rei extends Peca {

    public Rei(String cor, int posX, int posY) {
        super(cor, posX, posY);
    }

    @Override
    public boolean movimentoValido(int xDestino, int yDestino) {
        return false;
    }

    @Override
    public String geraImagem() {
        String cor = getCor();
        String caminhoImagem = "/xadrez_projeto_war_exploded/imagens/rei_" + cor + ".svg";
        return "<image x=\"" + (getPosX() * 50) + "\" y=\"" + (getPosY() * 50)
                + "\" width=\"50\" height=\"50\" xlink:href=\"" + caminhoImagem + "\"/>";
    }
}
