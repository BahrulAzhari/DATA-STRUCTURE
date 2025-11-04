package doublyLinkedList;

public class Link {

    public int Data;
    public Link next;
    public Link previous;

    public Link(int data){
        this.Data = data;
    }

    public void displayLink(){
        System.out.print(Data + ", ");
    }

}
