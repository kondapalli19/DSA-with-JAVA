import java.util.*;

public class multiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //add Elements
        for(int index=0; index<3; index++){
            for(int j=0; j<3; j++){
                list.get(index).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
