package mx.edu.tesoem.isc.gridviewbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvdatos;
    ArrayList<String> arreglo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    gvdatos = findViewById(R.id.gvdatos);
    contenido contenidoobj = new contenido(arreglo,this);
    gvdatos.setAdapter(contenidoobj);

    arreglo.add("Peter");
        arreglo.add("Kike");
        arreglo.add("Edson");
        arreglo.add("Luis");
        arreglo.add("Tania");
        arreglo.add("Uchiha");
        arreglo.add("Sasuke");
        arreglo.add("Luna");
        arreglo.add("Bombon");
    }

    }

