package meet4;
import java.util.Collections;
import java.util.List;
public class BubleSort implements SortStrategy{

    public void Sort(List<Integer> data){
        int n = data.size();
        for(int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++) {
                if (data.get(j) > data.get(j + 1)) {
                    Collections.swap(data, j, j + 1);
                }
            }
        }
    }

    public String getNama(){
        return "Buble Sort";
    }
}
