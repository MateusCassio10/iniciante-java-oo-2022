package model;

public class Organizador implements Evento {


    private String nome;
    private String categoria;

    public Organizador(String nome , String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
    @Override
    public String criarEvento(String evento) {
        return "Você criou o evento: " + evento;
    }

    public String ajudaAprendiz(String duvida){
        return "Resposta da dúvida do aprendiz: " + duvida;
    }

    public String ajudaMentor(String regras){
        return "Regras do movimento: " + regras;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
}
