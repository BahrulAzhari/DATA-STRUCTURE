package meet1;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        //deklarasi ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        //menambahkan elemen ke arraylist add()
        System.out.println("--Menambahkan elemen menggunakan method add()");
        fruits.add("apel");
        fruits.add("Jeruk");
        fruits.add("Mangga");
        System.out.println("ArrayList saat ini: " + fruits);

        //menambahkan elemen ke indeks tertentu
        fruits.add(1,"semangka");
        System.out.println("ArrayList setelah menambahkan 'semangka' di indeks ke 1 :" + fruits);

        //mengambil elemen get()
        System.out.println("--Mengakses Elemen--");
        String firstFruit = fruits.get(0);
        System.out.println("Buah Pertama" + firstFruit);

        //mengubah elemen di indeks tertentu set()
        fruits.set(2, "anggur");
        System.out.println(" ArrayList Setelah mengubah indeks ke 2 : " + fruits);

        //menghapus elemen dari arraylist remove()
        fruits.remove("jeruk");
        System.out.println("\n--menghapus elemen--");
        System.out.println("ArrayList setelah menghapus jeruk :" + fruits);
        fruits.remove(0); //berdasarkan indeks
        System.out.println("ArrayList setelah menghapus elemen di indeks 0 :" + fruits);

        //mengambil ukuran menggunakan size()
        int size = fruits.size();
        System.out.println("--Informasi Tambahan--");
        System.out.println("ArrayList setelah dibersihkan : " + fruits);
        System.out.println("Jumlah elemen di ArrayList : " + size);

        //mengecek apakah arrayList kosong isEmpty()
        boolean isEmpty = fruits.isEmpty();
        System.out.println("apakah arraylist kosong? " + isEmpty);

        //membersihkan seluruh isi arrayList clear()
        fruits.clear();
        System.out.println("ArrayList setelah dibersihkan: " + fruits);
        System.out.println("Jumlah elemen setelah dibersihkan: " + fruits.size());
    }
}
