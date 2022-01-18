import java.util.stack;

/*
  LIFO: Last In First Out
  You can only access the top Element of the stack like a stack of paper 

  Methods: 
    peek  =>  Read top entry without removing
    pop 	=>  Read top entry with removing
    push  =>  Put new entry ontop of the stack
*/

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
