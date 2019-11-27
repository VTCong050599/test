package com.example.myapplication;

public class traicay {
    private String ten;
    private String mota;
    private int Hinh;

    public traicay(String ten, String mota, int hinh) {
        this.ten = ten;
        this.mota = mota;
        Hinh = hinh;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
