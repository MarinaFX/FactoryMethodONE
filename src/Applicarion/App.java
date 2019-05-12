package Applicarion;

import AbstractFactory.AbstractNomeFactory;
import ConcreteFactory.ConcreteNomeFactory;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App.coletaInformacoes();
        App.close();
    }

    private static void coletaInformacoes(){
        Scanner in = new Scanner(System.in);
        String nome;
        String sobreNome;
        System.out.println("Bem vindo!");

        System.out.println("Por favor, insira seu nome");
        nome = in.nextLine();
        System.out.println("Por favor, insira seu spbrenome");
        sobreNome = in.nextLine();

        App.nomeFactory(nome, sobreNome);
    }

    private static void nomeFactory(String nome, String sobreNome){
        AbstractNomeFactory factory = new ConcreteNomeFactory();
        Random random = new Random();
        int numero = random.nextInt(101);

        if (numero > 50)
            factory.buildNomeSobrenome(nome, sobreNome);
        else
            factory.buildSobrenomeNome(nome, sobreNome);
    }

    private static void close(){
        System.out.println("FIM!");
    }
}
