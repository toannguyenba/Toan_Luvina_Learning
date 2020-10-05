
package Luvina.Lec5.linkedList;
import java.util.LinkedList;
import java.util.List;
// Thêm, revome, print 
public class ThucHanhLinkedList {
    public static void main(String[] args) {         
        //  19, 10, 7, 9, 6, 8, 4, 1, 2 => In ra phải được dãy tăng dần;
        List<Integer> ls = new LinkedList<Integer>();
	int[] arr = {1,10,1,3,4,5,2,10,9,1};
	ls.add(arr[0]);
	
         for (int i = 1; i < arr.length; i++) { 
            // Tim cach chen arr[i]
            int j = i - 1; // Đi từ cuối DS dần về đầu
            // tìm vị trí mà giá trị ở đấy <=arr[i]
//            while (j>= 0 && ls.get(j) > arr[i]) {         
//                j -= 1; 
//            } //NN j= -1             
//            ls.add(j+1, arr[i]); 
            // Đi tư đầu về cuối ls.size()-1
            // tìm vị trí (j) mà giá trị ở đấy >=arr[i]
            // Chèn vào j
            j=0;
              while (j<=ls.size()-1 && ls.get(j) < arr[i]) {         
                j += 1; 
            } //LN j= ls.size()             
            ls.add(j, arr[i]); 
        } 
		
	 for (int i: ls)
             System.out.print(i + " ");
    }
}
