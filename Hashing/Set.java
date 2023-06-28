import java.util.*;
public class Set {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Bengaluru");
        set.add("Hyderabad");
        set.add("Bengaluru");
        set.add("Hyderabad");

        System.out.println(set);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Hyderabad");
        lhs.add("Bengaluru");

        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Hyderabad");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
}
