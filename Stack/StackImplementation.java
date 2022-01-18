import java.util.stack;

public class StackImplementation {
    public static void main(String[] args){
      // Create new stack  
      Stack stack = new Stack();
          
      // Put Entrys in stack
      stack.push(5);
      stack.push(3);
      stack.push(7);
      stack.push(1);
      stack.push(9);
      stack.push(14);
      
      // Read top entry
      System.out.println(stack.peek()); // 14
      
      // Remove top
      stack.pop();
      
      // Read top and remove it
      System.out.println(stack.pop()); // 1
         
      //Leftover Stack: 7, 3, 5
    }
}
