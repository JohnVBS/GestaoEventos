package br.edu.unisep.gestaoeventos.models;

public class Evento {
    private String local;
    private int dias;
    private int num_ingressos;

    public Evento() {
    }

    public Evento(String local, int dias, int num_ingressos) {
        this.local = local;
        this.dias = dias;
        this.num_ingressos = num_ingressos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getNum_ingressos() {
        return num_ingressos;
    }

    public void setNum_ingressos(int num_ingressos) {
        this.num_ingressos = num_ingressos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
