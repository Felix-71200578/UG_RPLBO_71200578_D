package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening) {
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal<0){
            System.out.println("Nominal yang anda input tidak valid!");
        } else {
            if (isCheckFee()) {
                if ((nominal+this.feeAntarBank) > this.getSaldo()) {
                    System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
                } else {
                    setSaldo(getSaldo() - (nominal + this.feeAntarBank));
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

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}
