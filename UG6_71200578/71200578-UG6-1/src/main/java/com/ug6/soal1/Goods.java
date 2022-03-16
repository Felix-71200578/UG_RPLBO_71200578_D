package com.ug6.soal1;

public class Goods {
    private String code;
    private String name;
    private int quantity;
    private double price;

    public Goods(){
        this.code = "";
        this.name = "";
        this.quantity = 0;
        this.price = 0;
    }

    public Goods(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Goods(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
}

