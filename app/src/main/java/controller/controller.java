package controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import android.widget.Toast;
import pessoas.pessoa;
public class controller {

    public void Apagar(TextView nome, TextView sobrenome, TextView curso, TextView telefone){
        nome.setText("Nome");
        sobrenome.setText("Sobrenome");
        curso.setText("Curso");
        telefone.setText("Telefone");
    }
    public void Salvar(Context context, String nome, String sobrenome, String curso, String telefone, pessoa pessoa) {
        SharedPreferences pref = context.getSharedPreferences("Lista_Curso", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("nome", nome);
        editor.putString("sobrenome", sobrenome);
        editor.putString("curso", curso);
        editor.putString("telefone", telefone);
        editor.apply();
        pessoa.setN(nome);
        pessoa.setS(sobrenome);
        pessoa.setC(curso);
        pessoa.setT(telefone);
        Toast.makeText(context.getApplicationContext(), "Salvo.", Toast.LENGTH_SHORT).show();
    }

    public pessoa buscar() {

            return Pessoa;
        }
    }
}
