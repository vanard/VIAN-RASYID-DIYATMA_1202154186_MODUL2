package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by viani on 17/02/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private ArrayList<Menu> menulist = new ArrayList<Menu>(); //deklarasi arraylist
    private LayoutInflater mInflater; //deklarasi layout inflater
    Context context;

    //konstruktor
    public MenuAdapter(Context context, ArrayList<Menu> menulist){
        mInflater = LayoutInflater.from(context);
        this.menulist = menulist;
        this.context = context;
    }

    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View menuView = mInflater.inflate(R.layout.list_item, parent, false); //bertanggung jawab untung menginflate view
        return new MenuViewHolder(menuView, context, menulist); //mengembalikan object viewholder
    }

    @Override
    public void onBindViewHolder(MenuAdapter.MenuViewHolder holder, int position) {
        final Menu menu = menulist.get(position);

        //menset data ke holder
        holder.gambarMenu.setImageResource(menu.getImg_res());
        holder.namaMenu.setText(menu.getMenu());
        holder.hargaMenu.setText(menu.getHarga());
    }

    @Override
    public int getItemCount() {
        return menulist.size();
    } //jumlah item

    //menangani tiap list view yang ditampilkan pada recycler view
    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        //inisiasi
        ImageView gambarMenu;
        TextView namaMenu, hargaMenu;
        LinearLayout parentLayout;
        ArrayList<Menu> menulist = new ArrayList<Menu>();
        Context context;
        public MenuViewHolder(View itemView, Context context, ArrayList<Menu> menulist) {
            super(itemView);
            //inisiasi data
            this.menulist = menulist;
            this.context = context;
            itemView.setOnClickListener(this);
            gambarMenu = itemView.findViewById(R.id.gambar);
            namaMenu = itemView.findViewById(R.id.menu_makanan);
            hargaMenu = itemView.findViewById(R.id.harga_makanan);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getAdapterPosition();  //ambil posisi adapter
            Menu menu = this.menulist.get(mPosition);
            final int img = menu.getImg_res();
            final String menuMakanan = menu.getMenu();
            final String harga = menu.getHarga();

            //bungkus data yang akan dikirim
            Intent i = new Intent(context, DetailMenuActivity.class);
            i.putExtra("image_res", img);
            i.putExtra("menu", menuMakanan);
            i.putExtra("harga", harga);

            //panggil activity
            this.context.startActivity(i);
        }
    }
}
