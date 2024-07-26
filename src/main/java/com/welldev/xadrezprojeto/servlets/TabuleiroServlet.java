package com.welldev.xadrezprojeto.servlets;

import com.welldev.xadrezprojeto.model.partida.Partida;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/tabuleiro")
public class TabuleiroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Partida partida = (Partida) req.getSession().getAttribute("partida");

        if (partida == null) {
            req.setAttribute("erro", "Partida não encontrada");
            req.getRequestDispatcher("/erro.jsp").forward(req, resp);
            return;
        }

        String tabuleiro = partida.getTabuleiro().gerarTabuleiro();

        req.setAttribute("tabuleiro", tabuleiro);
        req.getRequestDispatcher("/tabuleiro.jsp").forward(req, resp);
    }
}
