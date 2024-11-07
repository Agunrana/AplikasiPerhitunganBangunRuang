package com.example.apphitung;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void segitiga(View view) {
        Intent intent = new Intent(MainActivity.this, SegitigaActivity.class);
        startActivity(intent);
    }

    public void persegi(View view) {
        Intent intent = new Intent(MainActivity.this, PersegiActivity.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, LingkaranActivity.class);
        startActivity(intent);
    }
    public void persegiPanjang(View view) {
        Intent intent = new Intent(MainActivity.this, PersegiPanjangActivity.class);
        startActivity(intent);
    }

}
