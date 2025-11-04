package LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        
        LinkedList theList = new LinkedList();

        theList.insertFirst(22);
        theList.insertFirst(21);
        theList.insertFirst(11);
        theList.insertFirst(12);

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();

            System.out.print("Deleted");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();

        theList.insertFirst(33);
        theList.insertFirst(31);
        theList.insertFirst(22);
        theList.insertFirst(18);
        theList.displayList();

        Link f = theList.delete(31);
        if (f != null) {
            System.out.println("Ketemu data...." + f.data);
        }else{
            System.out.println("link tidak ditemukan");
        }

        Link d = theList.delete(88);
        if (d != null) {
            System.out.println("hapus link dengan key " + d.data);
        } else {
            System.out.println("link tidak ditemukan");
        }
        theList.displayList();
    }

}
