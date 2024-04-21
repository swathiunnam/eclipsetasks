package day1;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
         ArrayList<String> fruits=new ArrayList<String> ();
         //Adding elements to the arraylist
         fruits.add("Apple");
         fruits.add("Banana");
         fruits.add("Grapes");
         fruits.add("Mango");
         fruits.add("Pine apple");
          System.out.println("The elements in the list are:"+fruits);
          //Deleting all the elements from arraylist
          fruits.clear();
          System.out.println("After deleting the elements from list:"+fruits);



	}

}
