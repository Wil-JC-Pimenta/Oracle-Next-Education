package br.com.alura.screenmatch.modelos;

public record TituloOmdb(String title, String year, String runtime) {
    public String getTitle() {
        return title;
    }
}
