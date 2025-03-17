package Biblioteca_Exercicio;

import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido: " + livro);
    }

    public void registrarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro registrado: " + membro);
    }

    public Emprestimo registrarEmprestimo(Livro livro, Membro membro) {
        Emprestimo emprestimo = new Emprestimo(livro, membro, new Date());
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo registrado: " + emprestimo);
        return emprestimo;
    }

    public void devolverLivro(Emprestimo emprestimo) {
        if (emprestimos.contains(emprestimo)) {
            emprestimo.devolver();
            System.out.println("Livro devolvido: " + emprestimo);
        }
    }


}