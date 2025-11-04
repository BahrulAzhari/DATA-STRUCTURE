package DataPegawai;

public class DataPegawaiApp {
    public static void main(String[] args) {
        
        DataPegawai list = new DataPegawai();
        list.tambahData("Yanto", 12516471886L);
        list.tambahData("Yanti", 17516471886L);
        list.tambahData("Yatno", 11216471886L);
        list.tambahData("Sugeng", 18716471886L);
        list.tambahData("Teguh cilik", 18816471886L);
        list.tambahData("ir.Jendral Wito", 13416471886L);
        list.displayData();
        
        list.hapusDataPertama();
        list.displayData();
        
    // Tampilkan sebelum sorting
    System.out.println("Sebelum sorting:");
    list.displayData();

    // Panggilan sesuai permintaan: gunakan overload yang menerima DataPegawai
    list.BubleSort(list);

    // Tampilkan setelah sorting
    System.out.println("Setelah sorting:");
    list.displayData();
        
    }
}
