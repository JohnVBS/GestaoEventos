package br.edu.unisep.gestaoeventos.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sessao {
    private int dia;
    private Calendar horario;
    private int num_participantes;

    public Sessao() {
    }

    public Sessao(int dia, Calendar horario, int num_participantes) {
        this.dia = dia;
        this.horario = horario;
        this.num_participantes = num_participantes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Calendar getHorario() {
        return horario;
    }

    public void setHorario(Calendar horario) {
        this.horario = horario;
    }

    public int getNum_participantes() {
        return num_participantes;
    }

    public void setNum_participantes(int num_participantes) {
        this.num_participantes = num_participantes;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return "Sessao\n" +
                "Dia: " + this.dia + "\n" +
                "Horario: " + sdf.format(this.horario.getTime()) + "\n" +
                "Numero de participantes: " + this.num_participantes ;
    }
}
