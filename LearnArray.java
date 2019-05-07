import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * LearnArray
 */
public class LearnArray {

  static void remove(ArrayList<Integer> n) { //void means doesn't return any thing in the function
    n.remove(2);
    System.out.println(n);
  }

  static void sort(ArrayList<Integer> n) {
    n.sort(Comparator.naturalOrder());
    System.out.println(n);
  }

  static Integer indexOf(ArrayList<Integer> n) { //no void, it return a value
    Integer pos;
    pos =n.indexOf(7);
    System.out.println(pos);
    return pos;
    
  }

  static void bool(ArrayList<Integer> n) {
    boolean ans = n.contains(4);
    if (ans) 
        System.out.println("The list contains 4"); 
    else
        System.out.println("The list does not contains 4"); 
   }
  
static void printElement(ArrayList<Integer> n) {
        System.out.println(n.get(4));
   }

static void changeElement(ArrayList<Integer> n) {
    n.set(2, 123);
    System.out.println(n);
}

   
 

  public static void main(String[] args) {
    Integer[] x = {8, 5, 1, 2, 7, 4};

    // convert to ArrayList

    ArrayList<Integer> n= new ArrayList<Integer>(Arrays.asList(x));
    // remove the 3rd number
    // n.remove(2);
    // System.out.println(n);
  // remove(n);
    

    // print the sorted ArrayList
    //  Collections.sort(n);
    //  System.out.println(n);
    

    // n.sort(Comparator.naturalOrder());
    // System.out.println(n);

    // sort(n);
    
    // print the index of the number 7
    // int pos =n.indexOf(7);
    // System.out.println(pos);

    indexOf(n);

    // print boolean representing if the ArrayList contains the number 4
    // boolean ans = n.contains(4);
    // if (ans) 
    //     System.out.println("The list contains 4"); 
    // else
    //     System.out.println("The list does not contains 4"); 
    // bool(n);

    // print the element at index 4
    // System.out.println(n.get(4));

    // printElement(n);

    // change the element at index 2 into value: 123
    // n.set(2, 123);
    // System.out.println(n);

    // changeElement(n);
  }
}