package br.edu.unisep.biblioteca.util;

import br.edu.unisep.biblioteca.model.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Funcoes {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Genero> generos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    public void novoLivro(){
        String titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
        String autor = JOptionPane.showInputDialog("Digite o autor do livro");
        String genero = JOptionPane.showInputDialog("Digite o genero do livro");
        String editora = JOptionPane.showInputDialog("Digite a editora do livro");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do livro"));
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setGenero(genero);
        livro.setAno(ano);
        livro.setEditora(editora);
        livros.add(livro);
        JOptionPane.showMessageDialog(null, livro);
    }
    public void novoAutor(){
        String nome = JOptionPane.showInputDialog("Digite o nome do autor");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do autor"));
        Autor autor = new Autor();
        autor.setNome(nome);
        autor.setIdade(idade);
        autores.add(autor);
        JOptionPane.showMessageDialog(null, autor);
    }
    public void novoGenero(){
        String tipo = JOptionPane.showInputDialog("Digite o tipo do genero do livro");
        Genero genero = new Genero();
        genero.setTipo(tipo);
        generos.add(genero);
        JOptionPane.showMessageDialog(null, genero);
    }
    public void novoUsuario(){
        String nome = JOptionPane.showInputDialog("Digite o nome do usuario");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuario"));
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setIdade(idade);
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, usuario);
    }
    public void novoEmprestimo(){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setData(Calendar.getInstance());
        emprestimo.setDevolucao(Calendar.getInstance());
        emprestimo.setLivro(livros.getFirst());
        emprestimo.setUsuario(usuarios.getFirst());
        emprestimos.add(emprestimo);
        JOptionPane.showMessageDialog(null, emprestimo);
    }
    public boolean escolherOpcao() {
        String[] opcoes = {
                "Adicionar Livro",
                "Adicionar Autor",
                "Adicionar Usuario",
                "Adicionar Emprestimo",
                "Listar Livros",
                "Listar Autores",
                "Listar Usuarios",
                "Listar Emprestimos",
                "Excluir Livro",
                "Excluir Autor",
                "Excluir Usuario",
                "Excluir Emprestimo",
        };
        int opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                "Escolha uma Opcao",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        switch (opcaoEscolhida){
            case 0:
                novoLivro();
                break;
            case 1:
                novoAutor();
                break;
            case 2:
                novoUsuario();
                break;
            case 3:
                novoEmprestimo();
                break;
            case 4:
                listarLivros();
                break;
            case 5:
                listarAutores();
                break;
            case 6:
                listarUsuarios();
                break;
            case 7:
                listarEmprestimo();
                break;
            case 8:
                excluirLivro();
                break;
            case 9:
                excluirAutor();
                break;
            case 10:
                excluirUsuario();
                break;
            case 11:
                excluirEmprestimo();
                break;
            default:
                return false;
        }
        return true;
    }
    private void listarLivros() {
        String texto = "Livros\n";
        for(Livro livro : livros){
            texto += livro + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    private void listarAutores() {
        String texto = "Autores\n";
        for(Autor autor : autores){
            texto += autor + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    private void listarUsuarios() {
        String texto = "Usuarios\n";
        for(Usuario usuario : usuarios){
            texto += usuario + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    private void listarEmprestimo() {
        String texto = "Emprestimo\n";
        for(Emprestimo emprestimo : emprestimos){
            texto += emprestimo + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    public void excluirLivro(){
        livros.removeLast();
    }
    public void excluirAutor(){
        autores.removeLast();
    }
    public void excluirUsuario(){
        usuarios.removeLast();
    }
    public void excluirEmprestimo(){
        emprestimos.removeLast();
    }
}
