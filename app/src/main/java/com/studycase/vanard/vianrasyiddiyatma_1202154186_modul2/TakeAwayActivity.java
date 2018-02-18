package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        Toast.makeText(this, "Pesan Take Away", Toast.LENGTH_SHORT).show();
    }

    public void pesan(View view) {
        EditText editName = findViewById(R.id.edit_nama);
        EditText editHp = findViewById(R.id.edit_hp);
        EditText editAdr = findViewById(R.id.edit_alamat);
        Intent daftarMenu = new Intent(TakeAwayActivity.this, DaftarMenuActivity.class);
        if (editName != null && editHp != null && editAdr != null){
            startActivity(daftarMenu);
        }else{
            Toast.makeText(this, "Isi data identitas terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}
