package com.ug7.ewallet;

public class GoPay extends eWallet{
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public GoPay(int feeTopup, int feeTransfer, int feeWithdraw){
        this.feeTopup = feeTopup;
        this.feeTransfer = feeTransfer;
        this.feeWithdraw = feeWithdraw;
    }

    public GoPay(){
        this.feeTopup = 1000;
        this.feeTransfer = 500;
        this.feeWithdraw = 2500;
    }

    public GoPay(User user){
        super(user);
    }

    public void topup(int jumlah){
        if(jumlah > 10000) {
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
        System.out.println("[GoPay e-Wallet]");
        super.getinfo();
    }

    public void getUser(){
        super.user.getNama();
    }
}
