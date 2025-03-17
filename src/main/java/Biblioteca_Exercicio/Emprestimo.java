package Biblioteca_Exercicio;

import java.util.*;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;
    private boolean devolvido;

    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.devolvido = false;
    }

    public void devolver(){
        this.devolvido = true;
    }

    public boolean isDevolvido(){
        return devolvido;
    }

    public Livro getLivro() {
        return livro;
    }
    public Membro getMembro() {
        return membro;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", membro=" + membro +
                ", dataEmprestimo=" + dataEmprestimo +
                '}';
    }
}