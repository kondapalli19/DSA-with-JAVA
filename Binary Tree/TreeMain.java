import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {

        // Scanner scanner=new Scanner(System.in);
        // BinaryTree tree=new BinaryTree();
        // tree.populate(scanner);
        // tree.display();
        // tree.prettyDisplay();

        BST tree=new BST();
        int[] nums={1,9,0,6,7,4,5,3};
        tree.populate(nums);
        tree.display();
    }
}
