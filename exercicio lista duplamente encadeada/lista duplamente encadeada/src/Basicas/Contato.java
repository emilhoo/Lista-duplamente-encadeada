package Basicas;

public class Contato {
    private String nome;
    private String endereco;
    private String telefone;

    public Contato(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato [Nome=" + nome + ", Endereço=" + endereco + ", Telefone=" + telefone + "]";
    }
}

