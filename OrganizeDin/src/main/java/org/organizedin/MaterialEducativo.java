package main.java.org.organizedin;

public class MaterialEducativo {
    private String titulo;
    private String tipo; // Pode ser "Livro", "Notícia", "Vídeo", etc.
    private String descricao;

    public MaterialEducativo(String titulo, String tipo, String descricao) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}