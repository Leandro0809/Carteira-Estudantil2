package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCadastrar;
    EditText usuario;
    EditText senha;
    Button entrar;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teste_main);
        getSupportActionBar().hide();
        tvCadastrar = findViewById((R.id.tvCadastro));
        usuario = findViewById(R.id.editTextTextPersonName2);
        senha = findViewById(R.id.editTextTextPersonName3);
        entrar = findViewById(R.id.button5);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuario.getText().toString().isEmpty()){
                    usuario.setError("Campo obrigatório!");
                }
                if(senha.getText().toString().equals("")){
                    senha.setError("Campo obrigatório!");
                }
            }
        });

        tvCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(MainActivity.this, login1.class);
                startActivity(it);

            }
        });
    }
}