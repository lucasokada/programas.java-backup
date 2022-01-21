public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa)obj;
        return this.nome == pessoa.nome && this.cpf == pessoa.cpf && this.rg == pessoa.rg;
    }
}
