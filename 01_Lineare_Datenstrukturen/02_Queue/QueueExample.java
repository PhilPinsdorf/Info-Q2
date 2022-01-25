import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
      // Create new Queue
      Queue<Integer> queue = new LinkedList<Integer>();
      
      // Add elements to Queue
      queue.add(2);
      queue.add(6);
      queue.add(3);
      queue.add(9);
      queue.add(7);
      queue.add(14);
      
      // Read first entry
      System.out.println(queue.poll()); // 2

      // Remove first element
      queue.remove();
      
      // Read and remove
      System.out.println(queue.remove()); //3
      
      // Leftover Queue: 9, 7, 14
    }
}
