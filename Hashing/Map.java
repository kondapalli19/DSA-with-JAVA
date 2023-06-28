import java.util.*;
public class Map {
    public static void main(String[] args) {

        // HashMap<String, Integer> map=new HashMap<>();
        // map.put("India", 150);
        // map.put("China", 100);
        // map.put("Indonesia",90);
        // map.put("US",200);

        // System.out.println(map);
        // System.out.println(map.get("China"));
        // System.out.println(map.containsKey("US"));
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
        // map.remove("China");
        // System.out.println(map);

        // Set<String> keys=map.keySet();
        
        // System.out.println(keys);

        // for(String k:keys){
        //     System.out.println(k);
        // }
        
        // map.clear();

        LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China",50);
        lhm.put("US",400);
        lhm.put("Bhutan",5);

        System.out.println(lhm);

        TreeMap<String, Integer> ht=new TreeMap<>();
        ht.put("India", 150);
        ht.put("China",50);
        ht.put("US",400);
        ht.put("Bhutan",5);

        System.out.println(ht);
    }
}
