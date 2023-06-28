public class MainHashMap extends CustomHashMap {
    public static void main(String[] args) {
      
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("Bhutan",70);
        hm.put("China",300);
        hm.put("US",80);
        hm.put("Russia",120);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.remove("Bhutan"));
        System.out.println(hm.isEmpty());

        for (String key : hm.keySet()) {
            System.out.println("Key = "+key+" , value = "+hm.get(key));
        }

    }
}
