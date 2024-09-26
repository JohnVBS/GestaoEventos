package br.edu.unisep.gestaoeventos.models;

public class Inscricao {
    private int preco;

    public Inscricao() {
    }

    public Inscricao(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
