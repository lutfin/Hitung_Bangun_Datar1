package com.example.hitungluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class persegi extends Activity {
    private EditText txtSisi;
    private EditText txtLuas;
    private Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);
        txtSisi = (EditText) findViewById(R.id.txtSisi);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }
    public void hitungLuas(View view) {
        try {
            int sisi = Integer.parseInt(txtSisi.getText().toString());
            int luas = sisi * sisi;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void backtoMenu(View view) { finish();
    }
}