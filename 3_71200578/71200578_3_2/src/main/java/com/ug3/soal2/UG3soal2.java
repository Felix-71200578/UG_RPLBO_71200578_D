package com.ug3.soal2;

import java.util.Scanner;

public class UG3soal2
{
    public static void main( String[] args )
    {
        boolean running = true;
        String kalimat1;
        String kalimat2;
        String pilihan;
        while (running) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bilangan Fibonacci dari kata");
            System.out.print("Masukkan input pertama: ");
            kalimat1 = scan.nextLine();
            System.out.print("Masukkan input kedua: ");
            kalimat2 = scan.nextLine();
            System.out.println("Bilangan Fibonacci");
            int n1 = kalimat1.length();
            int n2 = kalimat2.length();
            int n3,i;
            int jumlah = 10;

            System.out.print(n1 + " " + n2);

            for(i=2;i<=jumlah;++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.println();
            System.out.print("Keluar dari program (ketikan exit) : ");
            pilihan = scan.nextLine();
            if(pilihan.equals("exit")){
                running = false;
            }
        }



    }
}
