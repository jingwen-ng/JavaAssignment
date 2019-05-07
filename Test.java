import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] x = {1,2,3}; // Array

        ArrayList<Integer> y= new ArrayList<Integer>(Arrays.asList(x)); //Convert array to arrayList
        y.add(1);
        y.add(2);
        y.add(3);

    // print out a list of questions
    System.out.println("How old are you?");
    System.out.println("Are you hungry");
    System.out.println("Where do you stay?");

    // for question 1, print out 4 answers which are Integers
    Integer[] age = {18,19,20,21}; // Array
    for (int j = 0; j < age.length; j++) { //Arraylist use .size() and get()
        System.out.println(age[j]);
     }

   

    // for question 2, print out 2 answers which are booleans
        Boolean[] hungry = {true , false };
        System.out.println(hungry);

    // for question 3, print out 4 answers which are strings
    String[] stay = {"Penang", "KL", "Sabah", "Sarawak"};
    System.out.println(stay);

    // add one answer to each question
ArrayList<Integer> n= new ArrayList<Integer>(Arrays.asList(age));
n.add(26);
n.add(23);

    // reprint all of them
}
}