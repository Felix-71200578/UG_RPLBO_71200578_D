package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);

    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (dp instanceof Dana) {
            System.out.println("Akun Dana tidak valid");
        }
        else {
            this.setFeeTransferBank(ovoFeeTransferBank);
            super.transfer(dp, nominal);
        }
    }
}
