package ConcreteFactory;

import AbstractFactory.AbstractNomeFactory;
import Classes.Nome;

public class ConcreteNomeFactory implements AbstractNomeFactory {
    private Nome nome;

    @Override
    public void buildNomeSobrenome(String nome, String sobreNome) {
        if ((nome.equals(null)) || nome.equals(""))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");

        if ((sobreNome.equals(null)) || (sobreNome.equals("")))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");


        this.nome = new Nome(nome, sobreNome);
        this.nome.buildNome();
    }

    @Override
    public void buildSobrenomeNome(String nome, String sobreNome) {
        if ((sobreNome.equals(null)) || (sobreNome.equals("")))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");

        if ((nome.equals(null)) || nome.equals(""))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");


        this.nome = new Nome(nome, sobreNome);
        this.nome.buildSobrenome();
    }

}
