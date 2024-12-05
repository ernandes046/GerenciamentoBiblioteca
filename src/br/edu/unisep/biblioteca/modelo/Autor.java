package br.edu.unisep.biblioteca.modelo;
package br.edu.unisep.biblioteca.model;

public class Autor {
    private String nome;
    private int idade;
    public Autor() {
    }
    public Autor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
