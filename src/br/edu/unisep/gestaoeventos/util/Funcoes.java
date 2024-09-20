package br.edu.unisep.gestaoeventos.util;

import br.edu.unisep.gestaoeventos.models.Inscricao;
import br.edu.unisep.gestaoeventos.models.Palestrante;
import br.edu.unisep.gestaoeventos.models.Participante;
import br.edu.unisep.gestaoeventos.models.Sessao;
import jdk.jfr.Event;

import java.util.ArrayList;
import java.util.List;

public class Funcoes {
    private List<Event> eventos = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();
    private List<Palestrante> palestrantes = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();
    private List<Inscricao> inscricoes = new ArrayList<>();
}
