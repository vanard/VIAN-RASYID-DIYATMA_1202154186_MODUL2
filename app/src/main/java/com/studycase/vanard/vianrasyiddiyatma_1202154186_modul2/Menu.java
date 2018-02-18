package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul2;

/**
 * Created by viani on 16/02/2018.
 */

public class Menu {
    private int img_res;
    private String menu, harga;

    //konstruktor
    public Menu(int img_res, String menu, String harga){
        this.setImg_res(img_res);
        this.setMenu(menu);
        this.setHarga(harga);
    }
    //setter dan getter
    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
