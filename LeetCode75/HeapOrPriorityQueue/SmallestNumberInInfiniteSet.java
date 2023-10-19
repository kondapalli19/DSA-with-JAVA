import java.util.TreeSet;

class SmallestInfiniteSet {

    TreeSet<Integer> set;
    TreeSet<Integer> del;
    public SmallestInfiniteSet() {
        set = new TreeSet<>();
        set.add(1);
        del = new TreeSet<>();
    }

    public int popSmallest() {
        if (!set.isEmpty()) {
            del.add(set.first());
            int i = set.first() + 1;
            while (del.contains(i)) i++;
            set.add(i);
            return set.pollFirst();
        }
        return 0;
    }

    public void addBack(int num) {
        if (del.contains(num)) del.remove(num);
        set.add(num);
    }
}

