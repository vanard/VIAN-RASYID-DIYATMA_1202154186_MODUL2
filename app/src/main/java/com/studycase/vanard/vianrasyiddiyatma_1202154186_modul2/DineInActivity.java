package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String meja = "";
    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Toast.makeText(this, "Pesan Dine In", Toast.LENGTH_SHORT).show();

        Spinner meja_spinner = findViewById(R.id.labels_meja);
        if (meja_spinner != null){
            meja_spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_meja, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (meja_spinner != null){
            meja_spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        meja = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this, meja + " telah terpilih", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this, "Pilih Meja", Toast.LENGTH_SHORT).show();
    }

    public void pesan(View view) {
        editName = findViewById(R.id.edit_nama);
        Intent daftarMenu = new Intent(DineInActivity.this, DaftarMenuActivity.class);
        if (editName != null){
            startActivity(daftarMenu);
        }else{
            Toast.makeText(this, "Isi nama terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}
