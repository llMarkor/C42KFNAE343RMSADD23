package com.example.administrador.horoscopo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button botonRegistro;
    Button botonEntrar;
    Usuario e = new Usuario("fabian","123456",1995);
    ArrayList<Usuario> usuarios = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String nombreu = (String) getIntent().getSerializableExtra("nombre");
            String passw = (String) getIntent().getSerializableExtra("pass");
            Integer anio = (Integer) getIntent().getSerializableExtra("anio");
            Usuario us = new Usuario(nombreu,passw,anio);
            usuarios.add(e);
            usuarios.add(us);
        }catch (Exception p){
            System.out.println(p);
        }

        botonRegistro = (Button) findViewById(R.id.btnRegistro001);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonRegistro = new Intent(MainActivity.this, RegistrarV01.class);
                startActivity(botonRegistro);


            }
        });
        botonEntrar = (Button) findViewById(R.id.botonEntrar);
        botonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = ((EditText) findViewById(R.id.nombre)).getText().toString();
                String pass = ((EditText) findViewById(R.id.passw)).getText().toString();



               for (int i = 0 ; i < usuarios.size() ; i++){
                    if (usuarios.get(i).getNombre_usuario().equals(nombre)&&usuarios.get(i).getClave().equals(pass)){

                        Intent login = new Intent(MainActivity.this, Signo.class);
                        login.putExtra("nombreUsuario", usuarios.get(i).getNombre_usuario());
                        login.putExtra("anioUsuario", usuarios.get(i).getAnio());
                        startActivity(login);
                    }else{
                        if (usuarios.size()==i){
                            Toast mensaje =Toast.makeText(MainActivity.this,"Intente Nuevamente", Toast.LENGTH_SHORT);
                            mensaje.setGravity(Gravity.CENTER| Gravity.CENTER,0,0);
                            mensaje.show();
                        }
                    }
                                    }

            }
        });
    }
}
