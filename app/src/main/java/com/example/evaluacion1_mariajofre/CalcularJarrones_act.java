package com.example.evaluacion1_mariajofre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Jarrones;

public class CalcularJarrones_act extends AppCompatActivity {

    private Spinner jarrones;
    private TextView texto;
    private CheckBox doceJ, veinticuatroJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_jarrones);

        jarrones = (Spinner)findViewById(R.id.spnJarrones);
        texto = (TextView)findViewById(R.id.tv1);
        doceJ = (CheckBox)findViewById(R.id.chb1);
        veinticuatroJ = (CheckBox)findViewById(R.id.chb2);


        //Se construye objeto Jarrones
        Jarrones jar = new Jarrones();

        //Obtener lista
        String[] listaJarrones = jar.getJarrones();

        //Creo mi ArrayAdapter
        ArrayAdapter adaptJarrones = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaJarrones);

        //Se pasa adaptador a spinner
        jarrones.setAdapter(adaptJarrones);

    }
    public void Cantidad(View view){
        Jarrones jar = new Jarrones();

        if(doceJ.isChecked() && veinticuatroJ.isChecked())
        {
            texto.setText("Seleccione una sola opción, por favor.");
        }
        else
        {
            if(doceJ.isChecked()== false && veinticuatroJ.isChecked()==false){
                texto.setText("Seleccione una opción, por favor.");
            }
            if(doceJ.isChecked())
            {
                if(jarrones.getSelectedItem().equals("Cerámica"))
                {
                    texto.setText("Compraste 12 Jarrones de cerámica, su costo es: "+
                            System.getProperty ("line.separator") +
                            "El resultado es: "+ jar.calcularJarCeramica(12));
                }
                if(jarrones.getSelectedItem().equals("Porcelana"))
                {
                    texto.setText("Compraste 12 Jarrones de porcelana, su costo es: " +
                            System.getProperty ("line.separator") +
                            "El resultado es: "+ jar.calcularJarPorcelana(12));
                }
                if(jarrones.getSelectedItem().equals("Vidrio"))
                {
                    texto.setText("Compraste 12 Jarrones de vidrio, su costo es: " +
                            System.getProperty ("line.separator") +
                            "El resultado es: "+ jar.calcularJarVidrio(12));
                }
            }
            if(veinticuatroJ.isChecked())
            {
                if(jarrones.getSelectedItem().equals("Cerámica"))
                {
                    texto.setText("Compraste 24 Jarrones de cerámica, su costo es: " +
                            System.getProperty ("line.separator") +
                            "El resultado es: "+ jar.calcularJarCeramica(24));
                }
                if(jarrones.getSelectedItem().equals("Porcelana"))
                {
                    texto.setText("Compraste 24 Jarrones de porcelana, su costo es: " +
                            System.getProperty ("line.separator") +
                            "El resultado es: "+ jar.calcularJarPorcelana(24));
                }
                if(jarrones.getSelectedItem().equals("Vidrio"))
                {
                    texto.setText("Compraste 24 Jarrones de vidrio, su costo es: " +
                            System.getProperty ("line.separator") +
                            "El resultado es: "+ jar.calcularJarVidrio(24));
                }
            }
        }
    }
}