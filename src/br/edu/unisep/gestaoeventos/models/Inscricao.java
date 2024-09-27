package br.edu.unisep.gestaoeventos.models;

public class Inscricao {
    private float preco;

    public Inscricao() {
    }

    public Inscricao(int preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Inscricao\n" +
                "Preco: " + this.preco;
    }

    public void setPreco(float preco) {
    }
}
