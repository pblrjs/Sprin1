package com.example.nivelacionsprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.nivelacionsprint2.Adaptadores.ProductoAdapter;
import com.example.nivelacionsprint2.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProducts;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProducts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        arrayProducts = new ArrayList<>();
        // *** Creacion de productos
        Producto producto1 = new Producto("Bajo electrico", "Instrumento de cuerda", 860, R.drawable.bajo_electrico);
        Producto producto2 = new Producto("Bajo sexto", "Instrumento de cuerda", 550, R.drawable.bajo_sexto);
        Producto producto3 = new Producto("Guitarra electrica", "Instrumento de cuerda", 450, R.drawable.guitarra_electrica);
        Producto producto4 = new Producto("Guitarra acustica", "Instrumento de cuerda", 350, R.drawable.guitarra_acustica);
        Producto producto5 = new Producto("Piano de cola", "Instrumento de cuerda percutida", 2500, R.drawable.piano_cola);
        Producto producto6 = new Producto("Saxofon", "Instrumento de viento", 1200, R.drawable.saxo);
        Producto producto7 = new Producto("Viola", "Instrumento de cuerda frotada", 760, R.drawable.viola);
        Producto producto8 = new Producto("Violin", "Instrumento de cuerda frotada", 630, R.drawable.violin);
        Producto producto9 = new Producto("Violonchelo", "Instrumento de cuerda frotada", 780, R.drawable.violonchelo);

        arrayProducts.add(producto1);
        arrayProducts.add(producto2);
        arrayProducts.add(producto3);
        arrayProducts.add(producto4);
        arrayProducts.add(producto5);
        arrayProducts.add(producto6);
        arrayProducts.add(producto7);
        arrayProducts.add(producto8);
        arrayProducts.add(producto9);

        // ***
        productoAdapter = new ProductoAdapter(this, arrayProducts);
        listViewProducts = (ListView) findViewById(R.id.listViewProducts);

        listViewProducts.setAdapter(productoAdapter);
    }
}