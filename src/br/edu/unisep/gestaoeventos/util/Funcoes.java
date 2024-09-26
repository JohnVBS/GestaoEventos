package br.edu.unisep.gestaoeventos.util;

import br.edu.unisep.gestaoeventos.models.Inscricao;
import br.edu.unisep.gestaoeventos.models.Palestrante;
import br.edu.unisep.gestaoeventos.models.Participante;
import br.edu.unisep.gestaoeventos.models.Sessao;
import jdk.jfr.Event;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Funcoes {
    private List<Event> eventos = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();
    private List<Palestrante> palestrantes = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();
    private List<Inscricao> inscricoes = new ArrayList<>();

    public boolean escolherOpcao() {
        String[] opcoes = {
                "Adicionar Evento",
                "Adicionar Participante",
                "Adicionar Palestrante",
                "Adicionar Sessao",
                "Adicionar Inscricao",
                "Listar Eventos",
                "Listar Participantes",
                "Listar Palestrantes",
                "Listar Sessoes",
                "Listar Inscricoes",
                "Excluir Evento",
                "Excluir Participante",
                "Excluir Palestrante",
                "Excluir Sessao",
                "Excluir Inscricao",
        };

        int opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                "Escolha uma Opcao",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        switch (opcaoEscolhida){
            case 0:
                novoEvento();
                break;
            case 1:
                novoParticipante();
                break;
            case 2:
                novoPalestrante();
                break;
            case 3:
                novaSessao();
                break;
            case 4:
                novaInscricao();
                break;
            case 5:
                listarEventos();
                break;
            case 6:
                listarParticipantes();
                break;
            case 7:
                listarPalestrantes();
                break;
            case 8:
                listarSessoes();
                break;
            case 9:
                listarInscricoes();
                break;
            case 10:
                excluirEvento();
                break;
            case 11:
                excluirParticipante();
                break;
            case 12:
                excluirPalestrante();
                break;
            case 13:
                excluirSessao();
                break;
            case 14:
                excluirInscricao();
                break;
            default:
                return false;
        }
        return true;
    }
}
