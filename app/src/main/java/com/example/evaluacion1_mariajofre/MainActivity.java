package com.example.evaluacion1_mariajofre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.etUsuario);
        contrasena = (EditText)findViewById(R.id.etPassword);
    }
    public void IniciarSesion(View view)
    {
        if(usuario.getText().toString().isEmpty() && contrasena.getText().toString().isEmpty()) {
            usuario.setHint("No ingresó usuario");
            contrasena.setHint("No ingresó contraseña");
        }
        else{
            if(usuario.getText().toString().isEmpty()){
                usuario.setHint("No ingresó usuario");
            }
            if(contrasena.getText().toString().isEmpty()){
                contrasena.setHint("No ingresó contraseña");
            }
            if(usuario.getText().toString().equalsIgnoreCase("maria")){

                if(contrasena.getText().toString().equalsIgnoreCase("123")) {
                    Intent i = new Intent(this, Jarrones_act.class);
                    startActivity(i);
                }
                else{
                    contrasena.setText("");
                    contrasena.setHint("Contraseña incorrecta");
                }

            }
            else{
                usuario.setText("");
                usuario.setHint("Usuario incorrecto");
            }

        }
    }
    public void CalculosGenerales(View view)
    {
        Intent i = new Intent(this, CalcularJarrones_act.class);
        startActivity(i);
    }
}