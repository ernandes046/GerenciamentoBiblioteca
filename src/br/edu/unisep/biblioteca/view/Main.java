package br.edu.unisep.biblioteca.view;


import br.edu.unisep.biblioteca.util.Funcoes;
public class Main {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        while (true){
            if (!funcoes.escolherOpcao()){
                break;
            }
        }
    }
}