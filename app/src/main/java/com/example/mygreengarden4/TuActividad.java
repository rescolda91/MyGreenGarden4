package com.example.mygreengarden4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class TuActividad extends AppCompatActivity {

    private ImageView imageViewAtras;
    private ImageView imageViewCasita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_actividad);

        imageViewAtras=findViewById(R.id.imageViewAtras);
        imageViewCasita=findViewById(R.id.imageViewCasita);

        imageViewAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuActividad.this,PrincipalCategorias.class);
                startActivity(intent);
            }
        });

        imageViewCasita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuActividad.this,Bienvenida.class);
                startActivity(intent);
            }
        });
    }
}