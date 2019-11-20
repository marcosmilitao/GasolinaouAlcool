package com.militao.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button verificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        textoResultado = findViewById(R.id.textoResultadoId);
        verificar = findViewById(R.id.botaoVerificarId);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();


                Double valorAcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                Double resultado = valorAcool / valorGasolina;

                if (resultado >= 0.7) {

                    textoResultado.setText("É Melhor utilizar gasolina");
                }else{
                    textoResultado.setText("É Melhor utilizar alcool");
                }
            }
        });
    }
}
