package br.edu.unisep.biblioteca.modelo;


import java.util.Calendar;
public class Emprestimo {
    private Calendar data;
    private Calendar devolucao;
    private Livro livro;
    private Usuario usuario;
    public Emprestimo() {
    }
    public Emprestimo(Calendar data, Calendar devolucao, Livro livro, Usuario usuario) {
        this.data = data;
        this.devolucao = devolucao;
        this.livro = livro;
        this.usuario = usuario;
    }
    public Calendar getData() {
        return data;
    }
    public void setData(Calendar date) {
        this.data = date;
    }
    public Calendar getDevolucao() {
        return devolucao;
    }
    public void setDevolucao(Calendar devolucao) {
        this.devolucao = devolucao;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "Emprestimo{" +
                "data=" + data +
                ", devolucao=" + devolucao +
                ", livro=" + livro +
                ", usuario=" + usuario +
                '}';
    }
}