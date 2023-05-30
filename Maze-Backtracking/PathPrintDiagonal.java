public class PathPrintDiagonal {
    public static void main(String[] args) {
        PathprintDiagonal("", 3, 3);
    }
    public static void PathprintDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            PathprintDiagonal(p+'D',r-1, c-1);
        }
        
        if(r>1){
            PathprintDiagonal(p+'V',r-1, c);
        }
        if(c>1){
            PathprintDiagonal(p+'H',r, c-1);
        }
        
    }
}
