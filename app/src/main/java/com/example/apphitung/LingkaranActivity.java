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

public class LingkaranActivity extends AppCompatActivity {
    private EditText nilair;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lingkaran);

        nilair = findViewById(R.id.nilair);
        hasil = findViewById(R.id.hasil);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Hitung(View view) {
        // Ambil nilai alas dan tinggi
        String jarijariStr = nilair.getText().toString();

        // Validasi input
        if (jarijariStr.isEmpty()) {
            Toast.makeText(this, "Jari-jari harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        // Menghitung luas segitiga
        double jarijari = Double.parseDouble(jarijariStr);
        double luas = 3.14 * (jarijari * jarijari);

        // Menampilkan hasil
        hasil.setText("Hasil: " + luas);
    }

}