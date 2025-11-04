package doublyLinkedList;

public class DoublyLinkedListApp {

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(22);
        list.insertFirst(23);
        list.insertFirst(93);
        list.insertFirst(31);
        list.displayForward();

        // list.insertAfter(22, 65);
        list.insertFirst(12);
        list.insertFirst(67);
        list.insertFirst(88);
        list.displayBackward();
    }

}
