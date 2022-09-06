// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack color_stack = new Stack(5);
  
      // Insert new elements into the stack
      color_stack.push("Black");
      color_stack.push("White");
      color_stack.push("Gray");
      color_stack.push("Purple");
      color_stack.push("Brown");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + color_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + color_stack.peek());
  
      // Remove top element in the stack
      color_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      color_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + color_stack.peek());
      
      color_stack.pop();
      color_stack.pop();
      color_stack.pop();
      color_stack.pop();
      color_stack.pop();
    }
  }
