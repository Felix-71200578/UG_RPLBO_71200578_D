package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void topUp(long saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
        }
        else {
            System.out.println("Nominal Anda tidak valid! Nominal harus lebih dari 0");
        }
    }

    public void bayar(int jumlah, Keyboard k) {
        if ((jumlah*k.getHarga())>this.saldo) {
            System.out.println("Pembayaran gagal! Saldo Anda kurang, silakan melakukan top up!");
        }
        else if ((jumlah*k.getHarga())<0){
            System.out.println("Input jumlah tidak valid!");
        }
        else {
            System.out.println(("Pembayaran sukses! Silakan mengambil "+k.getMerkModel()+" di counter"));
            this.saldo -= jumlah* k.getHarga();

        }
    }
}
