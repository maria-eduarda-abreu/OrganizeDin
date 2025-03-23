package main.java.org.organizedin;

public class Investimento extends Transacao {
    private String tipoInvestimento;

    public Investimento(double valor, String data, String descricao, String tipoInvestimento) {
        super(valor, data, descricao);
        this.tipoInvestimento = tipoInvestimento;
    }

    // Getter e Setter
    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }
}