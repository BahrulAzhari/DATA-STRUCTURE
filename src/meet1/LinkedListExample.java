package meet1;
import java.util.LinkedList;
public class LinkedListExample {
    
    public static void main(String[] args) {

        //deklarasi linkedlist
        LinkedList<String> studenList = new LinkedList<>();

        //menambah elemen add()
        System.out.println("\t==menambahkan elemen==");
        studenList.add("Dina");
        studenList.add("Andi");
        studenList.add("Budi");
        studenList.add("Citra");
        System.out.println("List saat ini : " + studenList);

        //Menambah elemen di awal dan diakhir addFirst() addLast()
        System.out.println("\t== menambahkan diawal dan diakhir indeks== ");
        studenList.addFirst("Zaki");
        studenList.addLast("Maya");
        System.out.println("Setelah menambahkan diawal dan diakhir : " + studenList);

        //mengakses elemen
        System.out.println("\t==Megakses Elemen==");
        String firstStudent = studenList.getFirst();
        String lastStudent = studenList.getLast();
        System.out.println("Siswa pertama : " + firstStudent);
        System.out.println("Siswa terakhir : " + lastStudent);

        //akses elemen di indeks tertentu(lambat)
        String thirdStudent = studenList.get(2);
        System.out.println("Siswa di indeks-2 : " + thirdStudent);

        //menghapus elemen
        System.out.println("\t==Menghpus Elemen==");
        studenList.removeFirst();
        studenList.removeLast();
        studenList.remove("Andi");
        System.out.println("List setelah menghapus Zaki, Maya, dan Andi: " + studenList);

        //mengambil informasi dasar
        System.out.println("\t==Informasi List==");
        System.out.println("Ukuran List : " + studenList.size());
        System.out.println("Apakah List berisi 'Dina' : " + studenList.contains("Dina"));

        //menggunakan sebagai Deque (Double Ended Queue)
        System.out.println("\t==Menggunakan Queue/Stack==");
        //push() poop() untuk LIFO (Stack)
        studenList.push("Hana");
        System.out.println("List setelah push 'Hana' : " + studenList);
        studenList.pop();
        System.out.println("List setelah poop : " + studenList);

        //offer() dan poll() untuk FIFO (Queue)
        studenList.offer("Putri");
        System.out.println("List setelah offer 'Putri' : " + studenList);
        studenList.poll();
        System.out.println("List setelah poll : " + studenList);

        //memberikan list
        studenList.clear();
        System.out.println("\t==Membersihkan List==");
        System.out.println("List setelah clear : " + studenList);
    }
}
