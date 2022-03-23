package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(int feeTopup, int feeTransfer, int feeWithdraw){
        this.feeTopup = feeTopup;
        this.feeTransfer = feeTransfer;
        this.feeWithdraw = feeWithdraw;
    }

    public ShopeePay(){
        this.feeTopup = 500;
        this.feeTransfer = 0;
        this.feeWithdraw = 1000;
    }
    public ShopeePay(User user){
        super(user);
    }

    public void topup(int jumlah){
        if(jumlah > 0) {
            super.topup(jumlah + this.feeTopup);
        }
    }

    public void transfer(eWallet eWallet, int jumlah){
        if(jumlah > 0) {
            super.transfer(eWallet, jumlah + this.feeTransfer);
        }
    }

    public void withdraw(int jumlah){
        if(jumlah > 0) {
            super.withdraw(jumlah + this.feeWithdraw);
        }
    }

    public void getInfo(){
        System.out.println("[Shopee e-Wallet]");
        super.getinfo();
    }

    public void getUser(){
        super.user.getNama();
    }
}
