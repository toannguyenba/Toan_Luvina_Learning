package Luvina.Lec5.generic.arrayList;
import java.util.*;
public class ArrayList1 {
   public static void main(String args[]) {      
        ArrayList<String> objArr = new ArrayList<String>();// mảng động -
        // Integer, Float, Double, String, ...
        objArr.add("Ajeet");
        objArr.add("Harry");
        objArr.add("Chaitanya");
        objArr.add("Steve");
        objArr.add("Anuj");
        
        // 
        System.out.println("Currently the array list has following elements:"+ objArr);

        /*Add element at the given index*/
        objArr.add(0, "Rahul");//
        System.out.println("Currently the array list has following elements:"+ objArr);
        objArr.add(1, "Justin");//
        System.out.println("Currently the array list has following elements:"+ objArr);
      /*Remove elements from array list like this*/
        objArr.remove("Chaitanya");// Remove Obj
        objArr.remove("Harry");

	  System.out.println("Current array list is:"+objArr);

	  /*Remove element from the given index*/
	  objArr.remove(1);// Remove theo index

	  System.out.println("Current array list is:"+objArr);
	 
   }
}