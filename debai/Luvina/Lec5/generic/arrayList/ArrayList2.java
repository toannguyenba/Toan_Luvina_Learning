package Luvina.Lec5.generic.arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ArrayList2 {
 public static void main(String[] args)  {   
     List<Student> lst = new ArrayList<Student>();// sx theo ten     
         lst.add(new Student("A05726","AA", 8));
         lst.add(new Student("A06338","AC", 7));
         lst.add(new Student("A05379","AC",5));
         lst.add(new Student("A06338","AB1", 7));
         lst.add(new Student("A06178", "AD",9));          
         System.out.println(lst); 
         //1 Menu -- Sắp theo tên 
        Collections.sort(lst);// Sort by name       
        
        
        Student st1=new Student("......","AC", 9);//Nhap SV can tim kiem  (thay)               
         int i= Collections.binarySearch(lst, st1);// Search  by name 
       
        // Làm sao để in ra được tất cả các SV có trùng tên là AC??
        
         // 2. Menu Sắp xếp theo điểm
        // 2 Sap xep theo Score de chuan bi cho tim kiem nhi phan theo Score
          Collections.sort(lst, new  Comparator <Student>(){ 
            public int compare(Student a, Student b){                     
                     return a.getScore().compareTo(b.getScore());
                   }
            } );  
           System.out.println(lst); 
          st1=new Student("......","AC", 7);//Nhap SV can tim kiem  theo Score 
      // 3 Tim kiem nhi phan theo Score
          i= Collections.binarySearch(lst, st1, new Comparator<Student> (){   @Override
              public int compare(Student a, Student b) {
                  return a.getScore().compareTo(b.getScore());
              } });// tim theo score
          
         System.out.println("index="+i);
      // Làm sao để in ra được tất cả các SV có Score bằng 7...??   
     }
}
