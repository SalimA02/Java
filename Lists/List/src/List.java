import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class List {
    public static void main(String[] args) throws Exception{

        Random rand = new Random(); // create instance of Random class
        
        ArrayList<Integer> l1 = new ArrayList<Integer>(); // create instance of ArrayList class

        for(int i = 0; i <10; i++){

            // append 10 random integers to arraylist

            int random = rand.nextInt(1000);

            l1.add(random);

        }
        

        ArrayList<Integer> l2 = new ArrayList<>(l1);
        l2.sort(null); // sort array


        System.out.println();
        System.out.println("Initial ArrayList : " + l1);
        System.out.println("The first element of the arraylist is: "+ l1.get(0));
        System.out.println("The last element of the arraylist is: "+ l1.get(l1.size()-1));
        System.out.println();
        System.out.println("Sorted ArrayList: " + l2);
        System.out.println("The first element of the arraylist is: "+ l1.get(0));
        System.out.println("The last element of the arraylist is: "+ l1.get(l1.size()-1));
        System.out.println();
        System.out.println("Biggest Integer in ArrayList: " + Collections.max(l1));
        System.out.println();
        System.out.println("Smallest Integer in  ArrayList: " + Collections.min(l1));
        System.out.println();

    }
}
