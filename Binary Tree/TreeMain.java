import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(scanner);
        tree.display();
        tree.prettyDisplay();
    }
}
