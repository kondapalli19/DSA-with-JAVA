import java.util.Scanner;

public class BinaryTree {

    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }

    private Node root;

    // Insertion
    public void populate(Scanner scanner){
        System.out.println("Enter the value of root node : ");
        int val=scanner.nextInt();
        root=new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){

        System.out.println("Do you want to enter left node of "+node.val);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left node of "+node.val);
            int val=scanner.nextInt();
            node.left=new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right node of "+node.val);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right node of "+node.val);
            int val=scanner.nextInt();
            node.right=new Node(val);
            populate(scanner, node.right);
        }
    }

    // Display
    public void display(){
        display(root," ");
    }

    private void display(Node node, String indent){

        if(node==null){
            return;
        }

        System.out.println(indent + node.val);
    System.out.print(indent+"\t");
    display(node.left, indent);
    System.out.print(indent+"\t");
    display(node.right, indent);
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
        }

        private void prettyDisplay(Node node, int level){
            if(node==null){
            return;
            }

            prettyDisplay(node.right, level+1);
            if(level!=0){
                for (int i = 0; i < level; i++) {
                    System.out.print("\t\t");
                }
                System.out.println("|--------->"+node.val);
            }
            else{
                System.out.println(node.val);
            }
            prettyDisplay(node.left, level+1);
        }
    }

