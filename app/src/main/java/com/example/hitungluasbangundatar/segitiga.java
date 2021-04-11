package com.example.hitungluasbangundatar;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

import android.os.Bundle;

public class segitiga extends Activity {
    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtLuas;
    private Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }
    public void hitungLuas(View view) {
        try {
            int alas = Integer.parseInt(txtAlas.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int luas = (alas * tinggi) / 2;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void backtoMenu(View view) { finish();
    }
}