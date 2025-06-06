package com.aquirez.pooandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import util.salvar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import pessoas.pessoa;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView nomeL = findViewById(R.id.nome);
    TextView sobrenomeL = findViewById(R.id.sobrenome);
    TextView cursoL = findViewById(R.id.curso);
    TextView telefoneL = findViewById(R.id.telefone);

    pessoa pessoa = new pessoa(nomeL, sobrenomeL, cursoL, telefoneL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void limpar(View view) {
        TextView nomeL = findViewById(R.id.nome);
        TextView sobrenomeL = findViewById(R.id.sobrenome);
        TextView cursoL = findViewById(R.id.curso);
        TextView telefoneL = findViewById(R.id.telefone);
        nomeL.setText("");
        sobrenomeL.setText("");
        cursoL.setText("");
        telefoneL.setText("");
    }

    public void btn_salvar(View view, TextView nome, TextView sobrenome, TextView curso, TextView telefone) {
        salvar.Salvar(getApplicationContext(), String.valueOf(nome), String.valueOf(sobrenome), String.valueOf(curso), String.valueOf(telefone));

    }

    public void finalizar() {


    }
}



