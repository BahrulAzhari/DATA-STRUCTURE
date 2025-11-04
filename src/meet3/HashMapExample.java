package meet3;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> studentMap = new HashMap<>();

        System.out.println("--- Menambahkan Elemen ---");
        studentMap.put("1801", "Ani Susanti");
        studentMap.put("1802", "BudiBud");
        studentMap.put("1803", "Wito Sopir");
        studentMap.put("1804", "Teguh Cilik");
        System.out.println("HashMap setelah ditambahkan : " + studentMap);

        System.out.println("--- Mengambil Nilai (get) ---");
        String nameGet1 = studentMap.get("1803");
        System.out.println("Nama mahasiswa dengan NIM 1803 adalah : " + nameGet1);

        System.out.println("--- Mengubah Nilai (put/replace) ---");
        studentMap.put("1803", "Dustin");
        System.out.println("HashMap setelah perubahan : " + studentMap);

        System.out.println("--- Menghapus Elemen remove() ---");
        studentMap.remove("1804");
        System.out.println("HashMap setelah menghapus 1804 : " + studentMap);

        System.out.println("--- Pengecekan (constain) ---");
        boolean hasKey = studentMap.containsKey("1801");
        System.out.println("Apakah ada NIM 1801? " + hasKey);

        boolean hasValue = studentMap.containsValue("Ani Susanti");
        System.out.println("Apakah ada nama Ani Susanti? " + hasValue);

        System.out.println("--- Iterasi (Perulangan) ---");
        for(Map.Entry<String, String> entry: studentMap.entrySet()){
            System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
        }

        System.out.println("--- Ukuran ---");
        System.out.println("Jumlah mahasiswa saat ini: " + studentMap.size());

        // membersihkan seluruh isi HashMap
        studentMap.clear();
        System.out.println("HashMap setelah clear : " + studentMap);
        System.out.println("Apakah HashMap kosong ? " + studentMap.isEmpty());
    }
}
