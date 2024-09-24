package com.example.fotoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BTAceptar = findViewById(R.id.BTAceptar);
        final EditText ETNombre = findViewById(R.id.ETNombreFoto);

        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String StNombre = ETNombre.getText().toString();


                Intent sIntent = new Intent(MainActivity.this, SecondActivity.class);
                sIntent.putExtra("STNombre", StNombre);
                sIntent.putExtra("ImageResource", R.drawable.cr7);
                startActivity(sIntent);
            }
        });
    }
}
