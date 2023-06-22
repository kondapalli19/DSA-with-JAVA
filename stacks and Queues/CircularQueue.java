public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    protected int end=0;
    protected int front=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item)throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        data[end++]=item;
        end%=data.length;
        size++;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int removed=data[front++];
        front%=data.length;
        size--;
        return removed;
    }

    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        return data[front];
    }

    public void display()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int i=front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("END");
    }

}
