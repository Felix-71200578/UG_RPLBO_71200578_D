import java.util.Scanner;
public class hitungDiskon_71200578_D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Banyak belanjaan: ");
        int jmlBarang = inp.nextInt();

        int totalHarga = 0;
            for (int i = 0; i < jmlBarang; i++){
                System.out.print("Harga barang: ");
                totalHarga += inp.nextInt();
            }
        if (101000 <= totalHarga && totalHarga = 200000){
            totalHarga = totalHarga * 0.05;
        }
        else if (201000 <= totalHarga && totalHarga <= 400000){
            totalHarga = totalHarga * 0.05;
        }
        else if (400000 <= totalHarga ){
            totalHarga = totalHarga * 0.2;
        }

        else if (totalHarga <= 100000){
            return totalHarga;
        }
    }
}
