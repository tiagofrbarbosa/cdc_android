package tech.infofun.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.*;

/**
 * Created by admin on 12/03/2017.
 */

public class MainActivity extends Activity {
    private EditText nomeEditText;
    private TextView saudacaoTextView;
    private String saudacao;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
        this.saudacao = getResources().getString(R.string.saudacao);
    }

    public void surpreenderUsuario(View v){
        Intent intent =
                new Intent(saudacaoActivity.ACAO_EXIBIR_SAUDACAO);

                intent.addCategory(saudacaoActivity.CATEGORIA_SAUDACAO);

                String texto = nomeEditText.getText().toString();
                intent.putExtra(saudacaoActivity.EXTRA_NOME_USUARIO, texto);
                startActivity(intent);
    }
}
