package pessoas;

public class pessoa {
    private String nome, sobrenome, curso, telefone;

    public pessoa(String nome, String sobrenome, String curso, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\'' +
                ", sobrenome: " + sobrenome + '\'' +
                ", curso: " + curso + '\'' +
                ", telefone: " + telefone + '\'' + ". informações salvas.";

    }
}








