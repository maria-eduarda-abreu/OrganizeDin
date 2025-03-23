package test;

import main.java.org.organizedin.BlocoDeNotas;
import main.java.org.organizedin.Investimento;
import main.java.org.organizedin.MaterialEducativo;
import main.java.org.organizedin.Metas;
import main.java.org.organizedin.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("João Silva", "joao.silva@email.com", "senha123");

        // Criando uma transação de investimento
        Investimento investimento = new Investimento(5000.0, "2023-10-01", "Investimento em ações", "Ações");

        // Criando um bloco de notas
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas("Meta: Economizar R$ 10.000 até o final do ano.");

        // Criando um material educativo
        MaterialEducativo material = new MaterialEducativo("Como investir em ações", "Livro", "Um guia completo para iniciantes em investimentos.");

        // Criando uma meta financeira
        Metas meta = new Metas("Economizar para uma viagem", 10000.0, 7500.0);

        // Exibindo informações
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Investimento: " + investimento.getDescricao() + " - Valor: " + investimento.getValor());
        System.out.println("Bloco de Notas: " + blocoDeNotas.getAnotacoes());
        System.out.println("Material Educativo: " + material.getTitulo() + " - Tipo: " + material.getTipo());
        System.out.println("Meta: " + meta.getDescricao() + " - Valor Atual: " + meta.getValorAtual() + " / Valor Meta: " + meta.getValorMeta());

        // Verificando se a meta foi atingida
        if (meta.metaAtingida()) {
            System.out.println("Parabéns! Você atingiu a meta.");
        } else {
            System.out.println("Continue trabalhando para atingir a meta.");
        }
    }
}