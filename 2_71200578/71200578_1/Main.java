import java.util.Scanner;

public class Main {
    static String namaMobil = "M_71200578";
    static String namaPejalanKaki = "P_71200578";

    static String getNamaMobil(){
        return namaMobil;
    }
    static String getNamaPejalanKaki(){
        return namaPejalanKaki;
    }
    public class Mobil {
        static void jalan(){
            System.out.println("akan jalan");
        }
        static void kurangiKecepatan(){
            System.out.println("akan mengurangi kecepatan");
        }
        static void berhenti(){
            System.out.println("akan berhenti");
        }
    }

    public class PejalanKaki{
        static void menyebrang(){
            System.out.println("akan menyebrangi jalan");
        }
        static void bersiap(){
            System.out.println("akan bersiap untuk menyeberang jalan");
        }
        static void menunggu(){
            System.out.println("akan menunggu");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hijau = 1");
        System.out.println("Kuning = 2");
        System.out.println("Merah = 3");
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();

        if (kodeLampu == 1){
            System.out.println("Mobil ");
            getNamaMobil();
            Mobil.jalan();
            System.out.println(("Pejalan kaki"));
            getNamaPejalanKaki();
            PejalanKaki.menunggu();
        }
        else if (kodeLampu == 2){
            System.out.println("Mobil ");
            getNamaMobil();
            Mobil.kurangiKecepatan();
            System.out.println(("Pejalan kaki"));
            getNamaPejalanKaki();
            PejalanKaki.bersiap();
        }
        else if (kodeLampu == 3){
            System.out.println("Mobil ");
            getNamaMobil();
            Mobil.berhenti();
            System.out.println(("Pejalan kaki"));
            getNamaPejalanKaki();
            PejalanKaki.menyebrang();
        }
        else{
            System.out.println("Kode lalu lintas tidak valid");
        }




    }
}
