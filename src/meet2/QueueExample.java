package meet2;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {

        Queue<String> antreanPelanggan = new LinkedList<>();

        //menambah elemen ke dalam antrean menggunakan method offer() atau offer()
        System.out.println("--Menambahkan Elemen ke Queue (add/offer)--");
        antreanPelanggan.offer("Pelanggan A");
        antreanPelanggan.offer("Pelanggan B");
        antreanPelanggan.offer("Pelanggan C");
        System.out.println("Antrean saat ini : " + antreanPelanggan);

        //melihat elemen terdepan tanpa menghapusnya menggunakan method peek() atau element()
        System.out.println("\n--Melihat Elemen Terdepan (peek/element)--");
        String pelangganDepan = antreanPelanggan.peek();
        System.out.println("Pelanggan di depan antrean : " + pelangganDepan);
        System.out.println("Antrean Setelah di peek : " + antreanPelanggan);


        //Mengambil dan menghapus elemen terdepan menggunakan method poll()
        System.out.println("\n--mengambil dan menghapus elemen (pooll)");
        String pelangganDilayani = antreanPelanggan.poll();
        System.out.println("Pelanggan yang dilayani : " + pelangganDilayani);
        System.out.println("Antrean setelah di poll : " + antreanPelanggan);

        //mengambil dan menghapus elemen yang tersisa
        System.out.println("melayani pelanggan lagi : " + antreanPelanggan.poll());
        System.out.println("Antrean setelah semua di-poll : " + antreanPelanggan);

        //mengecek apakah antrean kosong isEmpty
        System.out.println("\n--Mengecek Status Queue--");
        boolean isKosong = antreanPelanggan.isEmpty();
        System.out.println("Apakah antrean kosong? : " + isKosong);

        //menambahkan elemen lagi untuk percobaan selanjutnya
        antreanPelanggan.offer("Pelanggan X");
        antreanPelanggan.offer("Pelanggan Y");
        antreanPelanggan.offer("Pelanggan Z");

        System.out.println("Antrean Saat ini : " + antreanPelanggan);

        //menggunakan method remove
        // remove() mirip dengan poll() tetapi akan melempar
        // NoSuchElementException jika antrean kosong
        System.out.println("Melayani pelanggan dengan remove():" + antreanPelanggan.remove());
        System.out.println("Antrean setelah remove() : " + antreanPelanggan);
        


    }
    
}
