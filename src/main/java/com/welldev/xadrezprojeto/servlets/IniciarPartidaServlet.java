package com.welldev.xadrezprojeto.servlets;

import com.welldev.xadrezprojeto.model.partida.Partida;
import com.welldev.xadrezprojeto.model.partida.Peca;
import com.welldev.xadrezprojeto.model.pecas.Rei;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/iniciarPartida")
public class IniciarPartidaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Partida partida = new Partida();

        Peca reiBranco = new Rei("branco", 4, 0);
        partida.getTabuleiro().colocarPeca(reiBranco);
        req.getSession().setAttribute("partida", partida);

        resp.sendRedirect("tabuleiro");
    }
}
