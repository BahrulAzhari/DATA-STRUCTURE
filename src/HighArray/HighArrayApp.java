package HighArray;

public class HighArrayApp {
    public static void main(String[] args) {
        
        HighArray highArray = new HighArray(6);

        highArray.insert(2);
        highArray.insert(4);
        highArray.insert(6);
        highArray.insert(7);
        highArray.insert(8);
        highArray.insert(8);
        highArray.show();

        System.out.println(" ");
        highArray.delete(4);
        highArray.delete(8);
        highArray.show();
        System.out.println("\ntemukan 6 : " + highArray.find(6));
    }

}
