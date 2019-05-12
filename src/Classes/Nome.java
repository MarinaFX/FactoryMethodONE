package Classes;

public class Nome {
    private String nome;
    private String sobrenome;

    public Nome(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void buildNome(){
        System.out.println(nome + " " + sobrenome);
    }

    public void buildSobrenome(){
        System.out.println(sobrenome + ", " + nome);
    }
}
