package com.example.zajecia2.model;

public class Auto {
    private String marka;
    private int rokProdukcji;

    public Auto(String marka, int rokProdukcji) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }


}
