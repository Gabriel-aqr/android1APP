package pessoas;

public class pessoa {

    private String nome;
    private String sobrenome;
    private String curso;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\'' +
                ", sobrenome: " + sobrenome + '\'' +
                ", curso: " + curso + '\'' +
                ", telefone: " + telefone + '\'' + ". informações salvas.";

    }
}








