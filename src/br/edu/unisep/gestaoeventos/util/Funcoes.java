package br.edu.unisep.gestaoeventos.util;

import br.edu.unisep.gestaoeventos.models.*;
import jdk.jfr.Event;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcoes {
    private List<Evento> eventos = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();
    private List<Palestrante> palestrantes = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();
    private List<Inscricao> inscricoes = new ArrayList<>();

    public void novoEvento(){
        String local = JOptionPane.showInputDialog("Digite o local");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
        int num_ingressos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de ingressos"));

        Evento evento = new Evento();
        evento.setLocal(local);
        evento.setDia(dia);
        evento.setNum_ingressos(num_ingressos);

        eventos.add(evento);

        JOptionPane.showMessageDialog(null, evento);
    }

    public void novoParticipante(){
        String nome = JOptionPane.showInputDialog("Digite o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        String cpf = JOptionPane.showInputDialog("Digite o cpf");
        String email = JOptionPane.showInputDialog("Digite o email");
        String cidade = JOptionPane.showInputDialog("Digite a cidade");

        Participante participante = new Participante();
        participante.setNome(nome);
        participante.setIdade(idade);
        participante.setCpf(cpf);
        participante.setEmail(email);
        participante.setCidade(cidade);

        participantes.add(participante);

        JOptionPane.showMessageDialog(null, participante);
    }

    public void novoPalestrante(){
        String nome = JOptionPane.showInputDialog("Digite o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        String email = JOptionPane.showInputDialog("Digite o email");

        Palestrante palestrante = new Palestrante();
        palestrante.setNome(nome);
        palestrante.setIdade(idade);
        palestrante.setEmail(email);

        palestrantes.add(palestrante);

        JOptionPane.showMessageDialog(null, palestrante);
    }

    public void novaSessao(){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
        int num_ingressos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de ingressos"));

        Sessao sessao = new Sessao();
        sessao.setDia(dia);
        sessao.setHorario(Calendar.getInstance());
        sessao.setNum_participantes(num_ingressos);

        sessoes.add(sessao);

        JOptionPane.showMessageDialog(null, sessao);
    }

    public void novaInscricao(){
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o nome"));

        Inscricao inscricao = new Inscricao();
        inscricao.setPreco(preco);

        inscricoes.add(inscricao);

        JOptionPane.showMessageDialog(null, inscricao);
    }

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

    private void listarEventos() {
        String texto = "Eventos\n";
        for(Evento evento : eventos){
            texto += evento + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    private void listarParticipantes() {
        String texto = "Participantes\n";
        for(Participante participante : participantes){
            texto += participante + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    private void listarPalestrantes() {
        String texto = "Palestrantes\n";
        for(Palestrante palestrante : palestrantes){
            texto += palestrante + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    private void listarSessoes() {
        String texto = "Sessoes\n";
        for(Sessao sessao : sessoes){
            texto += sessao + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    private void listarInscricoes() {
        String texto = "Inscricoes\n";
        for(Inscricao inscricao : inscricoes){
            texto += inscricao + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void excluirEvento(){
        eventos.removeLast();
    }

    public void excluirParticipante(){
        participantes.removeLast();
    }

    public void excluirPalestrante(){
        palestrantes.removeLast();
    }

    public void excluirSessao(){
        sessoes.removeLast();
    }

    public void excluirInscricao(){
        inscricoes.removeLast();
    }
}
