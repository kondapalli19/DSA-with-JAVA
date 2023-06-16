
public class Randomm {
    public static void main(String[] args) {
        int max=10;
        int min=1;
        for (int i = 0; i < 10; i++) {
            System.out.print((int)(Math.random()*(max - min + 1)+min));
            System.out.print("  ");
        }
    }
}
