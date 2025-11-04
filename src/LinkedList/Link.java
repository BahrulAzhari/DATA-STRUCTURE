package LinkedList;

public class Link {

    public int data;
    public Link next;

    public Link(int value){
        this.data = value;
    }

    public void displayLink(){
        System.out.print(data + ", ");
    }

}
