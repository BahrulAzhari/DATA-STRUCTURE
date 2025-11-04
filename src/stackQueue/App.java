package stackQueue;

public class App {
    public static void main(String[] args) {
     
        //Stack
        Stack stack = new Stack(10);
    
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(17);
        stack.push(19);
        stack.push(16);
        stack.push(13);
        stack.push(18);
        stack.push(11);
        stack.push(9);

        System.out.println("Hapus elemen teratas " + stack.pop()); 
        System.out.println("Lihat elemen teratas " + stack.peek());

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + ", ");
        }
        System.out.println(stack.isFull());


        System.out.println("==== queueu ===");

        //Queue
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(16);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(12);
        
        System.out.println("Panjang sizes : " + queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.peekFront());
        System.out.println(queue.size());

        System.out.println("Queue Output : ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + ", ");
        }
        System.out.println();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.size());
    }
}
