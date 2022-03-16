package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Scanner;
public class Vending_Machines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public Vending_Machines() {
        this.code = "";
        this.capacity = 0;
        this.usedCapacity = 0;
        this.goods = new ArrayList<>();
        this.acceptanceBalance = new ArrayList<>();
        this.consumerMoney = 0;
    }

    public Vending_Machines(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }

    public Vending_Machines(String code, int capacity, Goods goods, double[] acceptanceBalance) {
        this.code = code;
        this.capacity = capacity;
        this.goods.add(goods);
        this.acceptanceBalance = acceptanceBalance;
    }

    public void proceedOrder(String goodsCode, int orderQuantity) {
        this.usedCapacity -= orderQuantity;
        int hasil = 0;
        if (consumerMoney > goods.get(Integer.valueOf(goodsCode)).price) {
            hasil = consumerMoney - goods.get(Integer.valueOf(goodsCode)).price)
            return hasil;
        }
        else if (consumerMoney > goods.get(Integer.valueOf(goodsCode)).price) {
            withdrawMoney();
        }
        else {
            giveGood(goodsCode);
        }
    }

    public void takeMoney(double money) {
        if (acceptanceBalance.contains(money)) {
            proceedOrder();
        }
        else {
            withdrawMoney();
        }
    }

    public void giveGood(double goodsPrice, String goodsName) {
        if (usedCapacity >= capacity) {
            System.out.println("Kapasitas telah penuh. Tidak dapat menambahkan barang baru");
        }
        else {
            Goods good = new Goods();
            good.
        }
    }

    public double withdrawMoney() {
        System.out.println("Maaf, nominal uang yang anda masukkan tidak dapat kami terima");
        System.out.println("Mengembalikan uang anda sebesar Rp " + String.valueOf(consumerMoney));
        return consumerMoney;
    }

    public void inputGoods(Goods goods) {
        this.goods.add(goods);
    }
}
