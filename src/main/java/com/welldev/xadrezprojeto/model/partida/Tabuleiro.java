package com.welldev.xadrezprojeto.model.partida;

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

    public Peca getPeca(int x, int y) {
        return pecas[y][x];
    }

    public Peca[][] getPecas() {
        return pecas;
    }

    public void colocarPeca(Peca peca) {
        pecas[peca.getPosY()][peca.getPosX()] = peca;
    }

    public String gerarTabuleiro() {
        int tamanhoCasa = 50;
        StringBuilder tabuleiro = new StringBuilder();
        tabuleiro.append("<svg width=\"").append(tamanhoCasa * colunas).append("\" height=\"")
                .append(tamanhoCasa * linhas).append("\" xmlns=\"http://www.w3.org/2000/svg\">");

        for (int y = 0; y < linhas; y++) {
            for (int x = 0; x < colunas; x++) {
                String cor = (x + y) % 2 == 0 ? "#fff" : "#000";
                tabuleiro.append("<rect x=\"").append(x * tamanhoCasa).append("\" y=\"").append(y * tamanhoCasa)
                        .append("\" width=\"").append(tamanhoCasa).append("\" height=\"").append(tamanhoCasa)
                        .append("\" fill=\"").append(cor).append("\"/>");
                Peca peca = pecas[y][x];
                if (peca != null) {
                    String imagemPeca = peca.geraImagem();
                    tabuleiro.append(imagemPeca);
                }
            }
        }
        tabuleiro.append("</svg>");
        return tabuleiro.toString();
    }
}
