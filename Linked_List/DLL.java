public class DLL {

    private Node head;

    // Get the node corresponds to the index provided
    public Node get(int index){

        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp; 
    }

    // Insert at first
    public void insertFirst(int val){

        Node node = new Node(val);
        node.next=head;
        node.prev=null;

        if(head!=null){
            head.prev=node;
        }
        head=node;
    }    

    // Insert at Last
    public void insertLast(int val){

    Node node = new Node(val);

    if (head == null) {
        head = node;
        return;
    }

    Node last = head;
    while (last.next != null) {
        last = last.next;
    }

    last.next = node;
    node.prev = last;
    node.next = null;
}

    // Insert at position
   public void insert(int after, int val){

    Node p=get(after);
    if(p==null){
        System.out.println("Does not exist");
        return;
    }

    Node node=new Node(val);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next!=null){
        node.next.prev=node;
    }

   } 

   // Delete at First
   public int deleteFirst(){

    int val=head.val;
    
    if(head.next!=null){
        head=head.next;
        head.prev=null;
    }
    return val;
   }

    // Delete at Last
   public int deleteLast(){

   
        Node node=head;
        Node last=null;
        while(node!=null){
            last=node;
            node=node.next;
        }
        int val=last.val;
        last=last.prev;
        last.next=null;
    
    return val;
   }

   // Delete at position
   public int delete(int index){

    if(index==0){
        return deleteFirst();
    }
    
    Node temp=get(index-1);
    int val=temp.next.val;
    temp.next=temp.next.next;

    return val;
   }

    // Display the list
    public void display(){

        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }
    


    // Node Structure 
    private class Node{

        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
