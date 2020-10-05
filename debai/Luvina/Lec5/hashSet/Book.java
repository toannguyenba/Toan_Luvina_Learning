package Luvina.Lec5.hashSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Book {
    private String title;
    private String author;
    private Integer year;
    public Book(String title, String author, Integer year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }  
    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return author + "," + title + "," + year.toString();
    }
    @Override // Hash function -- hàm băm ở trong bảng băm
    public int hashCode(){
        int hash = (int) ((int)author.charAt(0)*10
                +author.charAt(1));
        System.out.println("hashCode of key: " 
                + author + " = " + hash);
        return hash;
    }
    @Override
    public boolean equals(Object obj){
         return author.equals(((Book) obj).author);
//        boolean t1=title.equals(((Book)obj).title);
//        if (!t1) return t1;
//        boolean t2=author.equals(((Book)obj).author);
//        if (!t2) return t2;
//        return year.equals(((Book)obj).year);
    }
  
}

class comparatorTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
class comparatorYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear().compareTo(o2.getYear());
    }

}
