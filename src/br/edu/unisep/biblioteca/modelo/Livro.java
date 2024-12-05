package br.edu.unisep.biblioteca.modelo;


public class Livro {
    private String titulo;
    private String genero;
    private int ano;
    private String autor;
    private String editora;
    public Livro() {
    }
    public Livro(String titulo,String genero, int ano, String autor, String editora) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", ano=" + ano +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}