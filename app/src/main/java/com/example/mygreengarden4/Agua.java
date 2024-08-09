package com.example.mygreengarden4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Agua extends AppCompatActivity {
    private EditText editTextConsumoMes;
    private EditText editTextPrecioM3;
    private Spinner spinnerMes;
    private Button buttonCalcularValor;
    private TextView textViewResultado; // Declaración de la variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agua);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextConsumoMes = findViewById(R.id.editTextConsumoMesM3);
        editTextPrecioM3 = findViewById(R.id.editTextPrecioM3);
        spinnerMes = findViewById(R.id.SpinnerMes);
        buttonCalcularValor = findViewById(R.id.buttonCalcularValor);
        textViewResultado = findViewById(R.id.TextViewResultado); // Inicialización de la variable
        // Configurar el Spinner de meses
        String[] meses = getResources().getStringArray(R.array.meses_del_año);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, meses);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMes.setAdapter(adapter);

        // Manejar el evento de selección del Spinner
        spinnerMes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String mesSeleccionado = meses[position];
                // Usa el mesSeleccionado para tus cálculos
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No hacer nada si no se selecciona nada
            }
        });

        // Manejar el clic del botón "CALCULAR VALOR"
        buttonCalcularValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores del consumo, precio y mes seleccionado
                String consumo = editTextConsumoMes.getText().toString();
                String precio = editTextPrecioM3.getText().toString();
                String mes = spinnerMes.getSelectedItem().toString();

                // Realizar los cálculos
                double valor = Double.parseDouble(consumo) * Double.parseDouble(precio);

                // Mostrar el resultado en textViewResultado
                textViewResultado.setText("El valor a pagar por el mes de " + mes + " es: " + valor);
            }
        });
    }
}