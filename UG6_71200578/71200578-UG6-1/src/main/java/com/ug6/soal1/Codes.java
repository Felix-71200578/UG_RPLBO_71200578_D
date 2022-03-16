package com.ug6.soal1;

public class Codes {
    private final String GOODSCODES = "GD";
    private final static String VENDINGMACHINECODE = "VM";
    private final String[] TYPE = {"DR","FD","GD"};

    public String generateGoodsCode(String type, String name) {
        String goodsCode = this.GOODSCODES + type + name.charAt(0) + name.charAt(-1);
        return goodsCode;
    }

    public String generateVendingMachines(int order) {
        String vendingMachine = this.VENDINGMACHINECODE + order;
        return vendingMachine;
    }
}
