package Luvina.cautrucDLJava.treeMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
/**
 * @author maychu
 */
public class TreeMap2 {
   public static void main(String args[]) {
     // K, V
       TreeMap<Author, Book> tmap = new TreeMap<Author, Book>();          
      tmap.put( new Author("Au1","Name1"), new Book("Tutorial Java 1.1", "C1", 1990,1));
      tmap.put( new Author("Au2","Name2"), new Book("Tutorial Java 1.1", "C1", 1990,12));
      tmap.put( new Author("Au3","3Name1"), new Book("Tutorial Java 1.1", "C1", 1990,12));
      tmap.put( new Author("Au4","4Name1"), new Book("Tutorial Java 1.1", "C1", 1990,12));
 
      boolean kt = tmap.containsKey(new Author("Au2","Name2"));// tim kiem nhi phan nhu tren cay NPTK
      if (kt) {System.out.println("The TreeMap containc key ");}
      else {System.out.println("The TreeMap not containc key ");
      }
       
   }
}