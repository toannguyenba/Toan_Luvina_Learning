package Luvina.cautrucDLJava.treeMap;

import Luvina.Lec5.generic.hashMap.*;
import Luvina.Lec5.generic.arrayList.*;

/**
 *
 * @author ManhHung
 */
public class Author  implements Comparable<Author>// cai lại method compareTo
{   private String code;
    private String name; 

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public Author(String code, String name ) {
        this.code = code; 
        this.name = name;
    }

    

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "(" + code + "," + name + ")";
    }

    @Override
    public int compareTo(Author t) {
        return this.name.compareTo(t.name);
    }
  
           
 }
 
