package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCuritidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCuritidas() {
        return totalCuritidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCuritidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }
}
