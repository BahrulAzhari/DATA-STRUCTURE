package meet3;
import java.util.ArrayList;
import java.util.HashMap;

public class Mahasiswa {
    public static void main(String[] args) {
        
        // HashMap untuk menyimpan data Mahasiswa (nim, nama)
        HashMap<String, String> dataMahasiswa = new HashMap<>();
        dataMahasiswa.put("240605110064", "BudiBud");
        System.out.println("--- 1. Data Mahasiswa: --- \n" + dataMahasiswa);

        // HashMap untuk menyimpan nilai tugas Mahasiswa
        HashMap<String, ArrayList<Double>> nilaiTugas = new HashMap<>();

        ArrayList<Double> tugas = new ArrayList<>();
        tugas.add(78.4);
        tugas.add(75.6);
        tugas.add(79.5);
        tugas.add(80.7);
        nilaiTugas.put("240605110064", tugas);
        System.out.println("--- 2. Nilai tugas mahasiswa ---");
        System.out.println(nilaiTugas);

        System.out.println("-- 3. Menghitung nilai rata-rata nilai tugas ---");
        ArrayList<Double> ambilTugas = nilaiTugas.get("240605110064");
        double totalTugas = 0;
        for (double n : ambilTugas) {
            totalTugas += n;
        }
        double rataRataTugas = totalTugas / ambilTugas.size();
        System.out.println("-- 3. Rata-rata Nilai tugas ---");
        System.out.println("Rata-rata tugas : " + rataRataTugas);

        // HashMap nilai UTS
        HashMap<String, Double> nilaiUTS = new HashMap<>();
        nilaiUTS.put("240605110064", 90.7);
        System.out.println("--- 4. Nilai UTS ---");
        System.out.println(nilaiUTS);

        HashMap <String, Double> nilaiUAS = new HashMap<>();
        nilaiUAS.put("240605110064", 87.4);
        System.out.println("--- 5. Nilai UAS ---");
        System.out.println(nilaiUAS);

        // HashMap untuk nilai akhir MatKul (rata2 tugas, UTS, UAS)
        HashMap <String, ArrayList<Double>> nilaiMatkul = new HashMap<>();

        ArrayList <Double> komponenNilai = new ArrayList<>();
        komponenNilai.add(rataRataTugas);
        komponenNilai.add(nilaiUTS.get("240605110064"));
        komponenNilai.add(nilaiUAS.get("240605110064"));

        nilaiMatkul.put("240605110064", komponenNilai);
        
        System.out.println("--- 6. Komponen nilai (rata2 tugas, UTS, UAS) ---");
        System.out.println(nilaiMatkul);

        // menghitung nilai akhir

        double nAkhir = (rataRataTugas * 0.45) + 
                        (nilaiUTS.get("240605110064") * 0.25) + 
                        (nilaiUAS.get("240605110064") * 0.30);
                        
        System.out.println("--- 7. Nilai Akhir ---");
        System.out.println("Nilai Akhir angka : " + nAkhir);

        // menentukan huruf nilai
        String huruf;
        if (nAkhir >= 85) {
            huruf = "A";
        }else if (nAkhir >= 75) {
            huruf = "B";
        }else if (nAkhir >= 65) {
            huruf = "C";
        }else if (nAkhir >= 55) {
            huruf = "D";
        }else{
            huruf = "E";
        }
        System.out.println("Nilai Akhir : " + huruf);
    }
}
