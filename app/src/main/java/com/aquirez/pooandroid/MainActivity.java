package com.aquirez.pooandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import controller.controller;
import androidx.appcompat.app.AppCompatActivity;
import pessoas.pessoa;

public class MainActivity extends AppCompatActivity {
    EditText nomeL, sobrenomeL, cursoL, telefoneL;
    SharedPreferences prefs;
    pessoa p = new pessoa();
    controller controller = new controller();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeL = findViewById(R.id.nome);
        sobrenomeL = findViewById(R.id.sobrenome);
        cursoL = findViewById(R.id.curso);
        telefoneL = findViewById(R.id.telefone);

        prefs = getSharedPreferences("Lista_Curso", MODE_PRIVATE);
        String nomeS = prefs.getString("nome", "Nome");
        String sobrenomeS = prefs.getString("sobrenome", "Sobrenome");
        String cursoS = prefs.getString("CursoS", "Curso");
        String telefoneS = prefs.getString("TelefoneS", "Telefone");
        nomeL.setText(nomeS);
        sobrenomeL.setText(sobrenomeS);
        cursoL.setText(cursoS);
        telefoneL.setText(telefoneS);
    }
    public void btn_salvar(View view) {
        controller.Salvar(this,nomeL.getText().toString(),sobrenomeL.getText().toString(),cursoL.getText().toString(),telefoneL.getText().toString(), p);
    }
    public void limpar(View view) {
       controller.Apagar(nomeL, sobrenomeL, cursoL, telefoneL);
    }
    public void finalizar(View view) {
        finish();
    }
}