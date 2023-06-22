public class MainStack {
    public static void main(String[] args)throws Exception {
        CustomStack stack=new CustomStack(5);

        stack.push(90);
        stack.push(78);
        stack.push(0);
        stack.push(34);
        stack.push(12);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();

        DynamicStack stack1=new DynamicStack(5);

        stack1.push(90);
        stack1.push(78);
        stack1.push(0);
        stack1.push(34);
        stack1.push(12);
        stack1.push(72);

        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

    }
}
