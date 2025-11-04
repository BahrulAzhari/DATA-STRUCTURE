package LinkedList.StudyCase;

public class LinkedListApp {
    public static void main(String[] args) {
        
        LinkedList aList = new LinkedList();
        aList.push(1, "Royco");
        aList.push(2, "Etanol");
        aList.push(3, "Baygon");
        aList.push(4, "Polygon");
        aList.displayList();

        aList.push(5, "Bayam");
        aList.push(6, "MAjikom");
        aList.displayList();

        aList.pop();
        aList.pop();
        aList.displayList();
    }

}
