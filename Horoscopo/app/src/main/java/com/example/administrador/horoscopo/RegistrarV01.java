package com.example.administrador.horoscopo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.content.Intent;

import java.util.ArrayList;

public class RegistrarV01 extends AppCompatActivity {
    String anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_registrar_v01);


        Button botonR = (Button) findViewById(R.id.botonReg);
        Spinner arrayspinner = (Spinner) findViewById(R.id.anios);
        final ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Integer> arrayanios = new ArrayList<>();
        int a = 2017;
        for (int i = 1; i < 80; i++) {
            arrayanios.add(a);
            a = (a - 1);
        }
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayanios);
        arrayspinner.setAdapter(adapter);

        arrayspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int e, long l) {

                anio = parent.getItemAtPosition(e).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        botonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreU = ((EditText) findViewById(R.id.Rnombre)).getText().toString();
                String claveU = ((EditText) findViewById(R.id.Rpassw)).getText().toString();
                int realanio = Integer.parseInt(anio);

                Usuario usuario = new Usuario(nombreU, claveU, realanio);
                usuarios.add(usuario);

                Intent reg = new Intent(RegistrarV01.this, MainActivity.class);
                reg.putExtra("nombre", nombreU);
                reg.putExtra("pass", claveU);
                reg.putExtra("anio", realanio);
                startActivity(reg);


            }
        });


    }

}
