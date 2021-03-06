package br.com.mariojp.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String ENTRADA_USUARIO = "ENTRADA_USUARIO";
    private TextView entradaUser, saidaForUser;
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entradaUser = findViewById(R.id.editNome);
        saidaForUser = findViewById(R.id.labelMensagem);
        if (savedInstanceState != null){
            mensagem = savedInstanceState.getString(ENTRADA_USUARIO);
            saidaForUser.setText("Alô, "+mensagem+"!");
        }
    }

    public void acaoBotaoCumprimentar(View v){
        mensagem = entradaUser.getText().toString();
        saidaForUser.setText("Alô, "+mensagem+"!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(ENTRADA_USUARIO, mensagem);
        super.onSaveInstanceState(outState);
    }
}
