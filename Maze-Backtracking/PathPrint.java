public class PathPrint {
    public static void main(String[] args) {
        Pathcount("", 3, 3);
    }
    public static void Pathcount(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        
        if(r>1){
            Pathcount(p+'D',r-1, c);
        }
        if(c>1){
            Pathcount(p+'R',r, c-1);
        }
        
    }
}
