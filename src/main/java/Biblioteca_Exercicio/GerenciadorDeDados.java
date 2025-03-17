package Biblioteca_Exercicio;

import java.io.*;
import java.util.*;

public class GerenciadorDeDados {
    public void salvarDadosEmArquivo(String nomeArquivo, List<Livro> livros, List<Membro> membros, List<Emprestimo> emprestimos) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Livro livro : livros) {
                writer.write("Livro:" + livro + "\n");
            }
            for (Membro membro : membros) {
                writer.write("Membro:" + membro + "\n");
            }
            for (Emprestimo emprestimo : emprestimos) {
                writer.write("Emprestimo:" + emprestimo + "\n");
            }
        }
    }

    public void carregarDadosDeArquivo(String nomeArquivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }
}