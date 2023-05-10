import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(78);
        list.add(90);
        list.add(87);
        System.out.println(list);
        System.out.println(list.contains(90));
        System.out.println(list.contains(9));
        list.remove(2);
        System.out.println(list);
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        for(int item=0; item<5; item++){
            System.out.println(list.get(item));
        }
    }
}
