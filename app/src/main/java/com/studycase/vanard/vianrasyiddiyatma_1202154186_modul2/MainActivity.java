package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, getString(R.string.nama_nim), Toast.LENGTH_LONG).show();
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void pilihMenu(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.dine_in:
                if (checked)
                    displayToast(getString(R.string.dine_in));
                break;
            case R.id.take_away:
                if (checked)
                    displayToast(getString(R.string.take_away));
                break;
            default:
                displayToast(getString(R.string.pilih_menu_dulu));
                break;
        }
    }

    public void pesanSekarang(View view) {
        int rdg =((RadioGroup) findViewById(R.id.radio_menu)).getCheckedRadioButtonId();
        final Intent dinein = new Intent(MainActivity.this, DineInActivity.class);
        final Intent takeaway = new Intent(MainActivity.this, TakeAwayActivity.class);

        switch (rdg){
            case R.id.dine_in:
                startActivity(dinein);
                break;
            case R.id.take_away:
                startActivity(takeaway);
                break;
            default:
                displayToast(getString(R.string.pilih_menu_dulu));
                break;
        }
    }
}
