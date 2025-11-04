package SimpleShorting;

public class ShortApp {
    public static void main(String[] args) {
        
        Short arr = new Short(7);
        arr.insert(77);
        arr.insert(3);
        arr.insert(52);
        arr.insert(5);
        arr.insert(1);
        arr.insert(11);
        arr.insert(22);
        arr.show();
        
        System.out.println("\n--Setelah diurutkan");
        arr.InsertionShort();
        arr.show();
        
    }
    
}
