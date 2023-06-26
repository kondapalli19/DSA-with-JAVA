public class reverse_alternate_k_nodes extends SLL {
    public static void main(String[] args) {
        SLL list=new SLL();

         list.insertFirst(23);
         list.insertFirst(43);
         list.insertFirst(90);
         list.insertFirst(100);

         list.insertLast(78);
         list.insertLast(12);

     list.insert(56, 2);

        Node root=reverseAlternate(list.head, 2);
        list.display();

        
    }
    public static Node reverseAlternate(Node head, int k){

        if(k<=1 || head==null || head.next==null){
            return head;
        }

        Node prev=null;
        Node present=head;
        Node last=prev;
        Node newEnd=present;
        Node next=present.next;


            for (int i = 0; i < k && present!=null; i++) {
                present.next=prev;
                prev=present;
                present=next;

                if(next!=null){
                    next=next.next;
                }
        }
        
        head=prev;
        newEnd.next=present;

        for (int i = 0; i < k; i++) {
            prev=present;
            present=present.next;
        }
    }
}
