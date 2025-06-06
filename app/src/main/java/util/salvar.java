package util;

import android.content.Context;
import android.content.SharedPreferences;

public class salvar {

    public static void Salvar(Context context, String nome, String sobrenome, String curso, String telefone) {
        SharedPreferences pref = context.getSharedPreferences("dados_app", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("nome", nome);
        editor.putString("sobrenome", sobrenome);
        editor.putString("curso", curso);
        editor.putString("telefone", telefone);

        editor.apply();
    }
}
