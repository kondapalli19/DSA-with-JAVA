public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size=0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){

        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insert(int val, int index){

        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size-1){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
            Node node = new Node(val,temp.next); 
            temp.next=node;  
        }
        size+=1;
    }

    public int deleteFirst(){

        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size-=1;
        return val;
    }

    public Node get(int index){

        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp; 
    }

    public int deleteLast(){

        if(size<=1){
            return deleteFirst();
        }
        int val=tail.val;
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        size-=1;
        return val;
    }

    public int delete(int index){

        if(index==0){
            return deleteFirst();
        }

        if(index==size-1){
            return deleteLast();
        }
        Node prev=head;
        int val=prev.next.val;
        prev.next=prev.next.next;
        size-=1;
        return val;
    }

    public void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    
    public Boolean find(int val){

        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    private class Node{

        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
