package main;

import model.Aprendiz;
import model.Mentor;
import model.Organizador;

public class Testes {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("-----------APRENDIZ--------------");
        System.out.println();

        Aprendiz aprendiz = new Aprendiz("Mateus Cássio", "Aprendiz");

        System.out.println("Nome: "  + aprendiz.getNome() + " | " + "Categoria: " + aprendiz.getCategoria());
        System.out.println(aprendiz.compartilhaResultado("Java orientado a Objetos"));
        aprendiz.setHabilidade("Banco de dados");
        System.out.println(aprendiz.getHabilidade());
        System.out.println(aprendiz.participarEvento("Iniciando com Mysql"));
        aprendiz.setDuvidas("Qual comando utilizamos para criar uma tabela?  ");
        System.out.println(aprendiz.getDuvidas());



        System.out.println();
        System.out.println("-----------ORGANIZADOR--------------");
        System.out.println();


        Organizador organizador = new Organizador("Igor Soares", "Organizador");

        System.out.println("Nome: "  + organizador.getNome() + " | " + "Categoria: " + organizador.getCategoria());
        System.out.println(organizador.criarEvento("Iniciando com Mysql"));
        System.out.println(organizador.ajudaMentor(" Levar notebook" + "  | " +" Instalar Intellij e MySql Workbench"));
        System.out.println(organizador.ajudaAprendiz("Utilizamos o comando CREATE TABLE"));


        System.out.println();
        System.out.println("-----------MENTOR--------------");
        System.out.println();

        Mentor mentor = new Mentor("Raquel Santos", "Mentora");

        System.out.println("Nome: "  + mentor.getNome() + " | " + "Categoria: " + mentor.getCategoria());
        System.out.println(mentor.ministrarEvento("Iniciando com Mysql"));
        System.out.println(mentor.compartilhaExperiencias("Meu primeiro emprego como desenvolvedora Java."));
        System.out.println(mentor.criarEvento("Carreira profissional em tecnologia."));

    }
}
