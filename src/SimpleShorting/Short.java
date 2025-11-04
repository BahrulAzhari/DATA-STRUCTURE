package SimpleShorting;

public class Short {
    private int[] data;
    private int nElemen;

    public Short(int size){
        this.data = new int[size];
        nElemen = 0;
    }

    public void insert(int value){
        data[nElemen++] = value;
    }

    public void show(){
        for(int i = 0; i < nElemen; i++){
            System.out.print(data[i] + ", ");
        }
    }

    public boolean find(int value){
        for(int i = 0; i < data.length; i++){
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }
 
    public boolean delete(int value){
        int i;
        for(i = 0; i < data.length; i++){
            if (data[i] == value) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        }else{
            for(int j = i; j < data.length;j++){
                data[i] = data[i + 1]; // 1, 2, 3, 4 => 1, 3, 3, 4 => 1, 3, 4, null
            }
            nElemen--;
            return true;
        }
    }

    public void swap(int one, int two){
        int temp = data[one];
        data[one] = data[two];
        data[two] = temp;
    }

    public void BubleShort(){
        int limit, i;

        for(limit = nElemen-1; limit > 0; limit--){
            for(i = 0; i < limit; i++){
                if (data[i] > data[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }

    // 7, 3, 4, 2, 5
    public void SelectionShort(){
        int first, i, min;
        //  first = 7
        for(first = 0; first < nElemen; first++){
            min = first; // min = 7, update min = 3
            //  i = 3
            for(i = first + 1; i < nElemen; i++){
                // data[3] < data[7]
                if (data[i] < data[min]) {
                    min = i; // min = 3
                }
            }
            //tukar(7,3) = > (3,7,...)
            swap(first, min);
        }
    }

    // 7, 3, 4, 2, 5
    public void InsertionShort(){
        int i, CurIn;
        //  CurIn = 3
        for(CurIn = 1; CurIn < nElemen; CurIn++){
            int temp = data[CurIn]; //temp = 3

            i = CurIn; // i = 3
            //selagi (3 > 0 dan 7 >= 3)
            while (i > 0 && data[i - 1] >= temp) {
                data[i] = data[i - 1]; // data[i] = 3
                i--;
            }
            data[i] = temp; // 3
        }

    }
}
