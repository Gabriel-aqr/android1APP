package pessoas;

public class pessoa {
    private String nome, sobrenome, curso, telefone;

    public pessoa(String nome, String sobrenome, String curso, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public String toFormatString() {
        return nome + ";" + sobrenome + ";" + curso + ";" + telefone;
    }

    public static pessoa fromFormatString(String str) {
        String[] dados = str.split(";");
        if (dados.length == 4) {
            return new pessoa(dados[0], dados[1], dados[2], dados[3]);
        } else {
            return null;
        }
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








