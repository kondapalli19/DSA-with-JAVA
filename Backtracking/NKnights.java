public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        Knights(board, 0, 0, 4);
    }

    public static void Knights(boolean[][] board, int row, int col, int knight){
        if(knight==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length){
            return;
        }
        if(col==board.length){
            Knights(board, row+1, 0, knight);
            return;
        }
        if(issafe(board, row, col)){
            board[row][col]=true;
            Knights(board, row, col+1, knight-1);
            board[row][col]=false;
        }
        Knights(board, row, col+1, knight);
    }

    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("O ");
                }
            }
            System.out.println();
    }
    }

    public static boolean issafe(boolean[][] board, int row, int col){
        if(isvalid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isvalid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isvalid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isvalid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean isvalid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

}
