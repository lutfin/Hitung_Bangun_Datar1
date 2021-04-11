package com.example.hitungluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.app.ListActivity;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button btnPersegi, btnPersegiPanjang, btnSegitiga, btnLingkaran;
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, persegi.class));
            }
        });

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, persegipanjang.class));
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, segitiga.class));
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, lingkaran.class));
            }
        });
    }
}