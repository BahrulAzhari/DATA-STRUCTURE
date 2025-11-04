package doublyLinkedList;

public class DoublyLinkedList {

    Link first;
    Link last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Link newLink = new Link(data);
        if (isEmpty()) {
            last = newLink;
        }else{
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int data){
        Link newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        }else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public Link deleteFirst(){
        Link temp =  first;
        if (first.next == null) {
            last = null;
        }else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteLast(){
        Link temp = last;
        if (first.next == null) {
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){
        Link current = first;
        while(current.Data != key){
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Link newLink = new Link(data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        }else{
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(int key){
        Link current = first;
        while (current.Data != key) {
            current = current.next;
            if(current == null){
                return null;
            }
        }

        if(current == first){
            first = current.next;
        }else{
            current.next.previous = current.next;
        }

        if(current == last){
            last = last.previous;
        }else{
            // 1 next prev 2 next prev 3
            current.previous.next = current.previous;
        }
        return current;
    }

    public void displayForward(){
        System.out.print("List " + " first --> last ");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.print("List " + " last --> first ");
        Link current = last;
        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
