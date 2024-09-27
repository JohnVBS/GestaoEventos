package br.edu.unisep.gestaoeventos.models;

public class Evento {
    private String local;
    private int dia;
    private int num_ingressos;

    public Evento() {
    }

    public Evento(String local, int dias, int num_ingressos) {
        this.local = local;
        this.dia = dias;
        this.num_ingressos = num_ingressos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dias) {
        this.dia = dias;
    }

    public int getNum_ingressos() {
        return num_ingressos;
    }

    public void setNum_ingressos(int num_ingressos) {
        this.num_ingressos = num_ingressos;
    }

    @Override
    public String toString() {
        return "Evento\n" +
                "Local: " + this.local + "\n" +
                "Dia: " + this.dia + "\n" +
                "Numero de ingressos: " + this.num_ingressos;
    }
}
