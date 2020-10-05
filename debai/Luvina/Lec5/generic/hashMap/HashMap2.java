package Luvina.Lec5.generic.hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author maychu
 */
public class HashMap2 {
   public static void main(String args[]) {
       // K, V
      HashMap<Author, Book> hmap = new HashMap<Author, Book>();
      hmap.put(new Author("Au1","Name1"), new Book("Tutorial Java 1.1", "C1", 1990,12));
      hmap.put(new Author("Au2","Name2"), new Book("Tutorial Java 1.1", "C1", 1990,2));
      hmap.put(new Author("Au3","3Name1"), new Book("Tutorial Java 1.1", "C1", 1990,7));
      hmap.put(new Author("Au4","4Name1"), new Book("Tutorial Java 1.1", "C1", 1990,49));
      hmap.put(new Author("Au5","5Name1"),new Book("Tutorial Java 1.1", "C1", 1990,3));
      // Liet ke cac doi tuong
      Iterator<Author> iterator = hmap.keySet().iterator();
      while(iterator.hasNext()) {
         Author key = iterator.next();
         System.out.print("key is: "+ key + " & Value is: ");
         System.out.println(hmap.get(key));
      }     
      Book var= hmap.get(new Author("Au2","Name2") );// tim book theo key O(1);// Tim theo ham bam va bang bam
      System.out.println("Value at index 2 is: "+var);

      /* Remove values based on key*/
      hmap.remove(3);
      System.out.println("Map key and values after removal 3:");      
      Iterator<Author> iterator2 = hmap.keySet().iterator();
      while(iterator2.hasNext()) {
          Author key = iterator2.next();
          System.out.print("Key is: "+key + " & Value is: ");
          System.out.println(hmap.get(key));
       }

   }
}
