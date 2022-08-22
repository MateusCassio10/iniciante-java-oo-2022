package model;

public class Aprendiz {


    private String nome;
    private String categoria;
    private String habilidade;
    private String duvidas;

    public Aprendiz(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String compartilhaResultado(String resultado){
        return "Com muita alegria, que compartilho que adquiri meu certificado em : " + resultado;
    }

    public String participarEvento(String evento) {
        return "Parabéns! você se cadastrou para o evento: " + evento;
    }

    public String getNome () {
        return nome;
    }

    public String getCategoria () {
        return categoria;
    }

    public String getHabilidade () {
        return "Você iniciou uma nova habilidade no curso de:  " + habilidade;
    }

    public void setHabilidade (String habilidade){
        this.habilidade = habilidade;
    }

    public String getDuvidas () {
        return "Dúvida: " + duvidas;
    }

    public void setDuvidas (String duvidas){
        this.duvidas = duvidas;

    }
}
