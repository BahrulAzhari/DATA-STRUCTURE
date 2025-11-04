package meet2;
import java.util.Stack;
public class StackExample {

    public static void main(String[] args) {
        //deklarasi
        Stack<String> tumpukanBuku = new Stack<>();

        //tambah elemen push()
        System.out.println("--Menammbahkan Elemen ke Stack (push)--");
        tumpukanBuku.push("Buku A");
        tumpukanBuku.push("Buku B");
        tumpukanBuku.push("Buku C");
        System.out.println("tumpukan saat ini : " + tumpukanBuku);

        //melihat elemen teratas
        System.out.println("\n--Melihat elemen teratas (peek)--");
        String bukuTeratas = tumpukanBuku.peek();
        System.out.println("Buku teratas : " + bukuTeratas);
        System.out.println("Tumpukan setelah peek : " + tumpukanBuku);

        //mengambil dan menghapus elemen teratas menggunakan method poop
        System.out.println("\n--Mengambil dan Menghapus Elemen (poop)--");
        String bukuDiambil = tumpukanBuku.pop();
        System.out.println("Buku yang diambil : " + bukuDiambil);
        System.out.println("Tumpukan setelah pop : " + tumpukanBuku);

        //mengambil dan menghapus elemen teratas yang tersisa
        System.out.println("Meengambil buku lagi : " + tumpukanBuku.pop());
        System.out.println("Mengambil buku lagi : " + tumpukanBuku.pop());
        System.out.println("Tumpukan setelah semua di-pop : " + tumpukanBuku);

        //mengecek apakah stack kosong emty()
        System.out.println("--Mengecek status Stack--");
        boolean isKosong = tumpukanBuku.empty();
        System.out.println("Apakah tumpukan kosong? : " + isKosong);

        //mencari posisi elemen dari atas stack menggunakan method search()
        tumpukanBuku.push("Buku X");
        tumpukanBuku.push("Buku Y");
        tumpukanBuku.push("Buku Z");

        System.out.println("\n--Mencari Elemen (Search) --");
        System.out.println("Tumpukan saat ini : " + tumpukanBuku);

        int posisi = tumpukanBuku.search("Buku X");
        System.out.println("Posisi buku 'X' dari atas : " + posisi);




    }
}