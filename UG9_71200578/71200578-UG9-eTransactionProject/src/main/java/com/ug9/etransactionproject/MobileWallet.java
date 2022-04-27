package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp) {
        super(nama, saldo);
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal<0){
            System.out.println("Nominal yang anda input tidak valid!");
        } else if ((nominal+this.feeTransferBank)> getSaldo()){
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
        } else {
            if (dp instanceof BNImo || dp instanceof BRImo) {
                if ((nominal+this.feeTransferBank) > this.getSaldo()) {
                    System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
                } else {
                    setSaldo(getSaldo() - (nominal + this.feeTransferBank));
                    dp.setSaldo(dp.getSaldo() + nominal);
                    this.printBuktiTransfer(dp, nominal);
                }
            } else {
                if (nominal > this.getSaldo()) {
                    System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
                } else {
                    setSaldo(getSaldo() - nominal);
                    dp.setSaldo(dp.getSaldo() + nominal);
                    this.printBuktiTransfer(dp, nominal);
                }
            }

        }

    }
}
