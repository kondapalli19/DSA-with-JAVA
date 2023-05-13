import java.util.*;
public class unique_in_array {
   public static void main(String[] args) {
    int[] arr={5,7,5,7,6,8,9,10};
    ArrayList<Integer> list=new ArrayList<>();
    list=unique(arr);
    System.out.println(list.size());
   } 

public static ArrayList<Integer> unique(int[] arr){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(arr[0]);
    for (int i = 0; i < arr.length; i++) {
        if(!list.contains(arr[i]))
        list.add(arr[i]);
    }
    // copy the unique elements back to array
    for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
    }
  return list;

}
}
