package meet2;
import java.util.ArrayList;
public class KotaApp {
    public static void main(String[] args) {
        
        ArrayList<Kota> daftarKota = new ArrayList<>(); 

        //push
        daftarKota.add(new Kota("Bandung", 30, 40));
        daftarKota.add(new Kota("Surabaya", 37, 88));
        daftarKota.add(new Kota("Tulungagung", 66, 55));
        daftarKota.add(new Kota("Trenggalek", 99, 109));
        daftarKota.add(new Kota("Tulungagung", 123, 534));

        System.out.println("== Daftar kota yang tersedia : ==");
        for (Kota kota : daftarKota) {
            System.out.println(kota);
        }

        //data tour
        ArrayList<Kota> daftarTour = new ArrayList<>();

        //menambahkan kota ke tour
        Kota daftarTujuan1 = daftarKota.get(2);
        daftarTour.add(daftarTujuan1);
        System.out.println("menambahkan : " + daftarTujuan1.getnamaKota());

        Kota daftarTujuan2 = daftarKota.get(0);
        daftarTour.add(daftarTujuan2);
        System.out.println("Menambahkan : " + daftarTujuan2.getnamaKota());

        Kota daftarTujuan3 = daftarKota.get(1);
        daftarTour.add(daftarTujuan3);
        System.out.println("Menambahkan : " + daftarTujuan3.getnamaKota());

        System.out.println("--Rencana tour saat ini--");
        System.out.println("Urutan kunjungan : " + daftarTour);
        System.out.println("Kota teratas tujuan tour : " + daftarTour.get(0));

        System.out.println("Menghitung total jarak : ");
        double jarak1 = daftarTujuan1.hitungJarakRute(daftarTour);
        System.out.println("Jarak 1 : " + jarak1 + " km");
    }
    
}
