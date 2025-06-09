package com.aquirez.pooandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import util.salvar;
import androidx.appcompat.app.AppCompatActivity;



import pessoas.pessoa;

public class MainActivity extends AppCompatActivity {

    EditText nomeL, sobrenomeL, cursoL, telefoneL;
    SharedPreferences prefs;
    String nomeS, sobrenomeS, cursoS, telefoneS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeL = findViewById(R.id.nome);
        sobrenomeL = findViewById(R.id.sobrenome);
        cursoL = findViewById(R.id.curso);
        telefoneL = findViewById(R.id.telefone);

        prefs = getSharedPreferences("Lista_Curso", MODE_PRIVATE);
        String nomeS = prefs.getString("nome", "Nome ");
        String sobrenomeS = prefs.getString("sobrenome", "Sobrenome ");
        String cursoS = prefs.getString("CursoS", "Curso ");
        String telefoneS = prefs.getString("TelefoneS", "Telefone ");
        nomeL.setText(nomeS);
        sobrenomeL.setText(sobrenomeS);
        cursoL.setText(cursoS);
        telefoneL.setText(telefoneS);

    }

    public void btn_salvar(View view) {
        salvar.Salvar(this,nomeL.getText().toString(),sobrenomeL.getText().toString(),cursoL.getText().toString(),telefoneL.getText().toString());
        pessoa p = new pessoa(
                nomeL.getText().toString(),
                sobrenomeL.getText().toString(),
                cursoL.getText().toString(),
                telefoneL.getText().toString()
        );


        Toast.makeText(this, "Salvo", Toast.LENGTH_SHORT).show();
    }

    public void limpar(View view) {
        nomeL.setText("");
        sobrenomeL.setText("");
        cursoL.setText("");
        telefoneL.setText("");
    }

    public void finalizar(View view) {
        finish();
    }

}