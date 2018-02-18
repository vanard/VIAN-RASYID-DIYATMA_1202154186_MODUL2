package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenuActivity extends AppCompatActivity {
    ImageView gambar;
    TextView menuMakan, hargaMakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //inisiasi
        gambar = findViewById(R.id.gambar);
        menuMakan = findViewById(R.id.menu_makanan);
        hargaMakan = findViewById(R.id.harga_makanan);

        Intent i = this.getIntent();

        //cek apakah ada data yang dikirim
        if (getIntent().hasExtra("image_res") && getIntent().hasExtra("menu") && getIntent().hasExtra("harga")) {
            //terima data
            int imgRes = i.getIntExtra("image_res", 00);
            String menu = i.getStringExtra("menu");
            String harga = i.getStringExtra("harga");

            //kalo ada set datanya
            gambar.setImageResource(imgRes);
            menuMakan.setText(menu);
            hargaMakan.setText(harga);
        }
    }
}
