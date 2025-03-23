package main.java.org.organizedin;

public class Metas {
    private String descricao;
    private double valorMeta;
    private double valorAtual;

    public Metas(String descricao, double valorMeta, double valorAtual) {
        this.descricao = descricao;
        this.valorMeta = valorMeta;
        this.valorAtual = valorAtual;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    // Método para verificar se a meta foi atingida
    public boolean metaAtingida() {
        return valorAtual >= valorMeta;
    }
}