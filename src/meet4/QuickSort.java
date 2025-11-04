package meet4;
import java.util.List;
import java.util.Collections;
public class QuickSort implements SortStrategy{

    public void Sort(List<Integer> data){
        quickSort(data, 0, data.size() - 1);
    }

    public String getNama(){
        return "Quick Sort";
    }

    // rekursif utama
    private void quickSort(List<Integer> data, int low, int high){
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    //method partisi(memilih elemen terakhir sbg pivot)
    private int partition(List<Integer> data, int low, int high){
        int pivot = data.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data.get(j) <= pivot) {
                i++;
                Collections.swap(data, i, j);
            }
        }
        Collections.swap(data, i + 1, high);
        return i + 1;
    }

}
