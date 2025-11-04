package meet4;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Sorter {

    private SortStrategy strategy;

    // konstuksi: menerima dan menetapkan strategi
    public Sorter(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    //method untk menjalankan sorting menggunakan strategi ini
    public void executeSort(List<Integer> data){
        long startTime = System.nanoTime();

        System.out.println("-------------------------------");
        System.out.println("Menggunakan Algoritma: " + strategy.getNama());
        System.out.println("Data awal : " + data);

        //panggil metode sort dari strategi yang aktif
        strategy.Sort(data);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        //dalam milidetik

        System.out.println("Data Terurut: " + data);
        System.out.println("Waktu Eksekusi : " + duration + " ms");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        
        //contoh data acak
        List<Integer> initialData = new ArrayList(Arrays.asList(50,10,90,30,70,40));

        //1. menggunakan bubleSort
        Sorter sorter = new Sorter(new BubleSort());
        sorter.executeSort(new ArrayList<>(initialData));

        //2. mengganti strategy tanpa mengubah kode inti sorter
        sorter.setStrategy(new QuickSort());
        sorter.executeSort(new ArrayList<>(initialData));
    }
}
