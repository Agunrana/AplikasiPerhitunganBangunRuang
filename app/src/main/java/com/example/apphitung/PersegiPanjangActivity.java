package com.example.apphitung;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PersegiPanjangActivity extends AppCompatActivity {
    private EditText nilaip, nilail;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi_panjang);

        nilaip = findViewById(R.id.nilaip);
        nilail = findViewById(R.id.nilail);
        hasil = findViewById(R.id.hasil);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Hitung(View view) {
        // Ambil nilai alas dan tinggi
        String panjangStr = nilaip.getText().toString();
        String lebarStr = nilail.getText().toString();

        // Validasi input
        if (panjangStr.isEmpty() || lebarStr.isEmpty()) {
            Toast.makeText(this, "Panjang dan Lebar harus diisi", Toast.LENGTH_SHORT).show();
            return;
            }

        // Menghitung luas segitiga
        double panjang = Double.parseDouble(panjangStr);
        double lebar = Double.parseDouble(lebarStr);
        double luas = panjang * lebar;

        // Menampilkan hasil
        hasil.setText("Hasil: " + luas);


    }
}