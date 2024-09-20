package br.edu.unisep.gestaoeventos.view;

import br.edu.unisep.gestaoeventos.util.Funcoes;

public class Main {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        while(true){
            if (!funcoes.escolherOpcao()){
                break;
            }
        }
    }
}
