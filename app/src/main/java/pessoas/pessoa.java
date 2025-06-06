package pessoas;

import android.widget.TextView;

public class pessoa {

    private TextView nome;
    private TextView sobrenome;
    private TextView curso;
    private TextView telefone;


    public pessoa(TextView nome, TextView sobrenome, TextView curso, TextView telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public TextView getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(TextView sobrenome) {
        this.sobrenome = sobrenome;
    }

    public TextView getCurso() {
        return curso;
    }

    public void setCurso(TextView curso) {
        this.curso = curso;
    }

    public TextView getTelefone() {
        return telefone;
    }

    public void setTelefone(TextView telefone) {
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








