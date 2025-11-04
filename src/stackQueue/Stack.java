package stackQueue;

public class Stack {

    private int [] data;
    private int maxSize, top;

    public Stack(int size){
        this.maxSize = size;
        data = new int [maxSize];
        top = -1;
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("Data sudah full");
        }else{
            data[++top] = value;
        }       
    }

    public int peek(){
        return data[top];
    }

    public int pop(){
        return data[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
