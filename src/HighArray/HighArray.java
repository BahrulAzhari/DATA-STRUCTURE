package HighArray;

public class HighArray {

    private int[] data;
    private int nElemen;

    public HighArray(int size){
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


}
