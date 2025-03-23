package main.java.org.organizedin;
import java.util.ArrayList;
import java.util.List;

public class GestaoFinanceiraApp {
    private Usuario usuario;
    private List<Transacao> transacoes;
    private List<Investimento> investimentos;
    private List<MaterialEducativo> materiaisEducativos;
    private List<Meta> metas;
    private BlocoDeNotas blocoDeNotas;

    public GestaoFinanceiraApp(Usuario usuario) {
        this.usuario = usuario;
        this.transacoes = new ArrayList<>();
        this.investimentos = new ArrayList<>();
        this.materiaisEducativos = new ArrayList<>();
        this.metas = new ArrayList<>();
        this.blocoDeNotas = new BlocoDeNotas();
    }

    // Métodos para gerenciar transações
    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    // Métodos para gerenciar investimentos
    public void adicionarInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    // Métodos para gerenciar materiais educativos
    public void adicionarMaterialEducativo(MaterialEducativo material) {
        materiaisEducativos.add(material);
    }

    public List<MaterialEducativo> getMateriaisEducativos() {
        return materiaisEducativos;
    }

    // Métodos para gerenciar metas
    public void adicionarMeta(Meta meta) {
        metas.add(meta);
    }

    public List<Meta> getMetas() {
        return metas;
    }

    // Métodos para gerenciar bloco de notas
    public void adicionarNota(String nota) {
        blocoDeNotas.adicionarNota(nota);
    }

    public List<String> getNotas() {
        return blocoDeNotas.getNotas();
    }
}
