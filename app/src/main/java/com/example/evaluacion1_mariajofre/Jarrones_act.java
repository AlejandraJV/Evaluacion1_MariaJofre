package com.example.evaluacion1_mariajofre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Clientes;
import Objetos.Jarrones;

public class Jarrones_act extends AppCompatActivity {

    private Spinner clientes, jarron;
    private RatingBar calificacion;
    private TextView textoAd, txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarrones);

        calificacion = (RatingBar)findViewById(R.id.rbar);
        calificacion.setNumStars(5);
        clientes = (Spinner)findViewById(R.id.spnClientes);
        jarron = (Spinner)findViewById(R.id.spnJarron);
        textoAd = (TextView)findViewById(R.id.tvAdicional);
        txtResultado = (TextView)findViewById(R.id.tvResultado);

        //Se construyen objetos
        Clientes cli = new Clientes();
        Jarrones jar2 = new Jarrones();

        //Obtener listas
        String[] listaClientes = cli.getClientes();
        String[] listaJarrones = jar2.getJarrones();

        //Creo mis ArrayAdapter
        ArrayAdapter adaptClientes = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaClientes);
        ArrayAdapter adaptJarrones = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaJarrones);

        //Se pasan adaptadores a spinners
        clientes.setAdapter(adaptClientes);
        jarron.setAdapter(adaptJarrones);
    }

    public void Calcular(View view){
        Clientes cli = new Clientes();
        Jarrones jar2 = new Jarrones();

        if(jarron.getSelectedItem().equals("Cerámica"))
        {
            textoAd.setText("El adicional es: "+ jar2.getAdicional()[0]);
            calificacion.setRating(2);

            if(clientes.getSelectedItem().equals("Sermieh"))
            {
                txtResultado.setText("El costo final es: "+ cli.descontarSermieh(jar2.totalJarCeramica()));
            }
            if(clientes.getSelectedItem().equals("Jacinta"))
            {
                txtResultado.setText("El costo final es: "+ cli.descontarJacinta(jar2.totalJarCeramica()));
            }
        }
        if(jarron.getSelectedItem().equals("Porcelana"))
        {
            textoAd.setText("El adicional es: "+ jar2.getAdicional()[1]);
            calificacion.setRating(3);

            if(clientes.getSelectedItem().equals("Sermieh"))
            {
                txtResultado.setText("El costo final es: "+ cli.descontarSermieh(jar2.totalJarPorcelana()));
            }
            if(clientes.getSelectedItem().equals("Jacinta"))
            {
                txtResultado.setText("El costo final es: "+ cli.descontarJacinta(jar2.totalJarPorcelana()));
            }
        }
        if(jarron.getSelectedItem().equals("Vidrio"))
        {
            textoAd.setText("El adicional es: "+ jar2.getAdicional()[2]);
            calificacion.setRating(5);

            if(clientes.getSelectedItem().equals("Sermieh"))
            {
                txtResultado.setText("El costo final es: "+ cli.descontarSermieh(jar2.totalJarVidrio()));
            }
            if(clientes.getSelectedItem().equals("Jacinta"))
            {
                txtResultado.setText("El costo final es: "+ cli.descontarJacinta(jar2.totalJarVidrio()));
            }
        }

    }
}