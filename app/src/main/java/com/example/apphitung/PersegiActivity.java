package com.example.apphitung;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PersegiActivity extends AppCompatActivity {
    private EditText nilais;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi);

        nilais = findViewById(R.id.nilais);
        hasil = findViewById(R.id.hasil);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Hitung(View view) {
        // Ambil nilai alas dan tinggi
        String sisiStr = nilais.getText().toString();

        // Validasi input
        if (sisiStr.isEmpty()) {
            Toast.makeText(this, "Sisi dan Tinggi harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        // Menghitung luas segitiga
        double sisi = Double.parseDouble(sisiStr);
        double keliling = sisi + sisi + sisi + sisi;

        // Menampilkan hasil
        hasil.setText("Hasil: " + keliling);
    }
}