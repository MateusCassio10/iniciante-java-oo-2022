package model;

public class Mentor extends Organizador implements Evento{

    public Mentor(String nome, String categoria) {
        super(nome, categoria);
    }

    public String ministrarEvento(String evento ){
        return "Você ministrará o evento: " + evento;
    }

    public String compartilhaExperiencias(String experiencia){
        return "Uma experiência legal que tive foi: " + experiencia;
    }
}
