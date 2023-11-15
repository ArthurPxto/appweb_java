package br.testeprojectij.testeIDEA;

public class pessoa {

    private final String nome;
    private final String idade;

    public pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

}
