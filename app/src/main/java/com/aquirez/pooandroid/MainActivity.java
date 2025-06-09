package com.aquirez.pooandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

import pessoas.pessoa;

public class MainActivity extends AppCompatActivity {

    EditText nomeL, sobrenomeL, cursoL, telefoneL;
    ArrayList<String> listaVIP;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeL = findViewById(R.id.nome);
        sobrenomeL = findViewById(R.id.sobrenome);
        cursoL = findViewById(R.id.curso);
        telefoneL = findViewById(R.id.telefone);

        prefs = getSharedPreferences("vipLista", MODE_PRIVATE);
        listaVIP = carregarLista();

        preencherUltimaPessoa();
    }

    public void btn_salvar(View view) {
        pessoa p = new pessoa(
                nomeL.getText().toString(),
                sobrenomeL.getText().toString(),
                cursoL.getText().toString(),
                telefoneL.getText().toString()
        );


        Toast.makeText(this, "Adicionado à Lista VIP!", Toast.LENGTH_SHORT).show();
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

    private void salvarLista() {
        String listaComoTexto = String.join("#", listaVIP);
        prefs.edit().putString("lista", listaComoTexto).apply();
    }

    private ArrayList<String> carregarLista() {
        String listaComoTexto = prefs.getString("lista", "");
        if (!listaComoTexto.isEmpty()) {
            return new ArrayList<>(Arrays.asList(listaComoTexto.split("#")));
        } else {
            return new ArrayList<>();
        }
    }

    private void preencherUltimaPessoa() {
        if (!listaVIP.isEmpty()) {
            String ultima = listaVIP.get(listaVIP.size() - 1);
            pessoa p = pessoa.fromFormatString(ultima);
            if (p != null) {
                nomeL.setText(p.getNome());
                sobrenomeL.setText(p.getSobrenome());
                cursoL.setText(p.getCurso());
                telefoneL.setText(p.getTelefone());
            }
        }
    }
}