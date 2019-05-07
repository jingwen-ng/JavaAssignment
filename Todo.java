import java.util.ArrayList;
import java.util.Arrays;

public class Todo {
    public static void main(String[] args) {
     String List1 = "Task 1"; 
     boolean xCompleted = true;
     String List2 = "Task 2"; 
     String List3 = "Task 3"; 

   
ArrayList<String> list = new ArrayList<>();
list.add("Buy Groceries");
list.add("Make Breakfast");
list.add("Make Assignments");



for (int i = 0; i < list.size(); i++) { //Arraylist use .size() and get()
    System.out.println((i+1) + ". " + list.get(i));
 }

// an array of boolean
ArrayList<Boolean> booList = new ArrayList<>();
booList.add(true);

// an array of integer
ArrayList<Integer> intList = new ArrayList<>();
intList.add(1);


// add a boolean ot the array of boolean
booList.add(false);

// add a integer to the array of integer
intList.add(2);

// for a for loop to print out each
for (int j = 0; j < booList.size(); j++) { //Arraylist use .size() and get()
    System.out.println(booList.get(j));
 }

 for (int z = 0; z < intList.size(); z++) { //Arraylist use .size() and get()
    System.out.println(intList.get(z));
 }

  //  String[] list = { "Buy Groceries","Make Breakfast","Make Assignments"};
    //  for (int i = 0; i < list.length; i++) {
    //     System.out.println((i+1) + ". " + list[i]);
    //  }

    //  System.out.println(List1);
    //  System.out.println(List2);
    //  System.out.println(List3);

    //  if(xCompleted){
    //      System.out.println(List1 + " [X]");
    //  }else{
    //      System.out.println(List1 + " [ ]");
    //  }

    //  if(xCompleted){
    //     System.out.println(List2 + " [X]");
    // }else{
    //     System.out.println(List2 + " [ ]");
    // }

    // if(xCompleted){
    //     System.out.println(List3 + " [X]");
    // }else{
    //     System.out.println(List3 + " [ ]");
    // }

    }
}