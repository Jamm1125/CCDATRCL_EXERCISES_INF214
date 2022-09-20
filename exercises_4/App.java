import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Myclassmate = new LinkedList<>();

        // Adds elements to the queue
        Myclassmate.add("Gonzales, Marvin John");
        Myclassmate.add("Vargas, Jethro Ruiz");
        Myclassmate.add("Almocera, Alliyah");
        Myclassmate.add("Jean Angelo Flores");
        Myclassmate.add("Verzosa, Luis Miguel");

        // Display all elements of the queue.
        System.out.println(Myclassmate);

        // Returns the number of elements in the queue.
        System.out.println(Myclassmate.size());

        // Shows the element at the front of the queue
        System.out.println(Myclassmate.peek());

        // Removes the element at the front of the queue
        Myclassmate.remove();
        Myclassmate.remove();
        Myclassmate.remove();
        Myclassmate.remove();
        Myclassmate.remove();

        // Display all elements of the queue.
        System.out.println(Myclassmate);

        // Adds elements to the queue
        Myclassmate.add("Masangcay, Jenina Velle");
        Myclassmate.add("Victoria, Elaine Grace");
        Myclassmate.add("Bantegui, Moses Christian");
        Myclassmate.add("Dapitillo, Kean John");
        Myclassmate.add("Guansing, Ivan");
        
        // Display all elements of the queue.
        System.out.println(Myclassmate);

        // Returns the number of elements in the queue.
         System.out.println(Myclassmate.size());

        // Shows the element at the front of the queue
         System.out.println(Myclassmate.peek());
     
       
    }
}
