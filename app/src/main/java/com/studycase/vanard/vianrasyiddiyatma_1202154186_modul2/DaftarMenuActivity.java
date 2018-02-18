package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenuActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    String[] Menu, Harga;
    int[] Img_res = {R.drawable.bakso, R.drawable.buburayam, R.drawable.gadogado, R.drawable.gudeg,
            R.drawable.nasigoreng, R.drawable.nasipadang, R.drawable.oporayam, R.drawable.pempek,
            R.drawable.rawon, R.drawable.rendang, R.drawable.satedaging, R.drawable.sopbuntut,
            R.drawable.sopkonro, R.drawable.soto};
    ArrayList<Menu>menuList = new ArrayList<Menu>();
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        mRecyclerView = findViewById(R.id.recyclerview);
        Menu = getResources().getStringArray(R.array.menu_makanan); //mengambil data dari string
        Harga = getResources().getStringArray(R.array.harga_makanan);
        int i = 0;
        for (String menuMakanan : Menu){  //mengisi data arraylist
            Menu menu = new Menu(Img_res[i], menuMakanan, "Harga: Rp " + Harga[i]);
            menuList.add(menu);
            i++;
        }

        //menset recyclerview
        mAdapter  = new MenuAdapter(this, menuList);
        mRecyclerView.setAdapter(mAdapter);
        //recyclerview sebagai pengelola tata letak default
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
