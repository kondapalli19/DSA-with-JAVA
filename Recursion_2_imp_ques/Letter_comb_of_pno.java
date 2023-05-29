public class Letter_comb_of_pno {
    public static void main(String[] args) {
        keypad(23);
    }
    public static void keypad(int num){
        String[] options={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String output="";
        keypad(num, output, options);
    }
    public static void keypad(int num, String output, String[] options){
        if(num==0){
            System.out.println(output);
            return;
        }
        int n1=num%10;
        String s1=options[n1];
        for (int i = 0; i < s1.length(); i++) {
            keypad(num/10, s1.charAt(i)+output, options);
        }
    }
}
