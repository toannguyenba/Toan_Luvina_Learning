package Luvina.Lec5.generic.hashMap;

import Luvina.Lec5.generic.arrayList.*;

/**
 *
 * @author ManhHung
 */
class Author   // cai lại method compareTo
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
 @Override // Hash function -- hàm băm ở trong bảng băm
    public int hashCode(){
        int hash = (int) ((int)name.charAt(0)*10
                +name.charAt(1));
        System.out.println("hashCode of key: " 
                + name + " = " + hash);
        return hash;
    }
    @Override
    public boolean equals(Object obj){
         return code.equals(((Author) obj).code);
    }
           
 }
 
