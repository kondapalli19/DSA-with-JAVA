public class Number_pathCount {
    public static void main(String[] args) {
        System.out.println(Pathcount(3,3));
    }
    public static int  Pathcount(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int count=0;
        if(r>1){
            count+=Pathcount(r-1, c);
        }
        if(c>1){
            count+=Pathcount(r, c-1);
        }
        return count;
    }
}
