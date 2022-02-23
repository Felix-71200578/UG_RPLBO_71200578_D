package com.ug3.soal1;


import java.util.Scanner;

public class UG3soal1
{
    public static void main( String[] args ) {
        String nama;
        String tanggal;
        String jumlah;
        String berat;
        Scanner scan = new Scanner(System.in);
        System.out.println("============Data Product============");
        System.out.print("Nama Makanan: ");
        nama = scan.nextLine();
        System.out.print("Tanggal Kadaluarsa: ");
        tanggal = scan.nextLine();
        System.out.print("Jumlah (quantity): ");
        jumlah = scan.nextLine();
        System.out.print("Berat (gram): ");
        berat = scan.nextLine();

        System.out.println("============Data Product============");
        System.out.println("Nama = " + nama);
        System.out.println("Tanggal Kadaluarsa = " + tanggal);
        System.out.println("Jumlah (quantity) = " + jumlah);
        System.out.println("Berat (gram) = " + berat);

    }
}