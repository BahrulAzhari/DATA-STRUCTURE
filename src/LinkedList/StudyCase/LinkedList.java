package LinkedList.StudyCase;

public class LinkedList {

    Link firs;

    public LinkedList(){
        this.firs = null;
    }

    public void push(int id, String nama){
        Link aLink = new Link(id, nama);
        aLink.next = firs;
        firs = aLink;
    }

    public boolean isEmpty(){
        return (firs == null);
    }

    public Link pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop");
            return null;
        }
        Link temp = firs;
        firs = firs.next;
        return temp;
    }

    public void displayList(){
        System.out.println("Stack(top --> bottom): ");
        Link current = firs;
        while (current != null) {
            System.out.println("{" + current.id + ", " + current.nama + " }");
            current = current.next;
        }
        System.out.println();
    }
}
