package com.example.fotoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String StNombre = intent.getStringExtra("STNombre");
        int imageResource = intent.getIntExtra("ImageResource", R.drawable.ic_launcher_background);


        TextView textView = findViewById(R.id.textViewNombreFoto);
        textView.setText("El nombre de la foto es: " + StNombre);


        ImageView imageView = findViewById(R.id.imageViewFoto);
        imageView.setImageResource(imageResource);
    }
}
