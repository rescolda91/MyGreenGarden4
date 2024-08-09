package com.example.mygreengarden4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class InicioSesion extends AppCompatActivity {


    private EditText Nombre;
    private EditText Password;
    private TextView RegistrarAqui;
    private Button IniciarSesion;
    private ImageView imageAtras;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        Nombre = findViewById(R.id.EditTextNombre);
        Password = findViewById(R.id.editTextPassword);
        RegistrarAqui=findViewById(R.id.textViewRegistrarAqui);
        IniciarSesion=findViewById(R.id.buttonIniciarSesion);
        imageAtras=findViewById(R.id.imageViewAtras);

        RegistrarAqui.setOnClickListener(new  View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this,Registrarse.class);
                startActivity(intent);
            }
        });

        IniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this,PrincipalCategorias.class);
                startActivity(intent);
            }
        });

        imageAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this,Bienvenida.class);
                startActivity(intent);
            }
        });
    }
}