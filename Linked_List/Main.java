public class Main {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.insertFirst(23);
        list.insertFirst(43);
        list.insertFirst(90);
        list.insertFirst(100);
        list.insertLast(78);
        list.insertLast(12);
        list.insert(56, 2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(23));
    }
}
