package com.example.hitungluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class lingkaran extends Activity {

    private EditText txtJari;
    private EditText txtLuas;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        txtJari = (EditText) findViewById(R.id.txtJari);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }

    public void hitungLuas(View view) {
        try {
            int jari = Integer.parseInt(txtJari.getText().toString());
            double phi = 3.14;
            double luas = phi * jari * jari;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backtoMenu(View view) {
        finish();
    }
}