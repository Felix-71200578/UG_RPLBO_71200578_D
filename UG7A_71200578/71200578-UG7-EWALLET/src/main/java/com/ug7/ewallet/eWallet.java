package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet() {}

    public eWallet(User user){
        this.user = new User(user.getNama(), user.getEmail(), user.getUang());
    }

    public void topup(int jumlah){
        if(jumlah > 0) {
            saldo = saldo + jumlah;
        }
    }

    public void transfer(eWallet eWallet, int jumlah){
        if(jumlah > 0) {
            eWallet.saldo += jumlah;
            this.saldo -= jumlah;
        }
    }

    public void withdraw(int jumlah){
        if(jumlah > 0) {
            saldo -= jumlah;
        }
    }

    public void getinfo(){
        System.out.println("[Shopee e-Wallet]");
        System.out.println("Nama: " + this.user.getNama() + " [Pin: " + this.user.getPIN() + "]");
        System.out.println("Email: " + this.user.getEmail());
        if (user.isEmailConfirmed()){
            System.out.print("[Confirmed]");
        }
        System.out.println("Uang cash: " + this.user.getUang());
        System.out.println("Saldo e-wallet: " + this.saldo);
    }

}
