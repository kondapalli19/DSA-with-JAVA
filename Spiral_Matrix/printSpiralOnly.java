public class printSpiralOnly {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40,50,60},
            {70,80,90,100,110,120},
            {130,140,150,160,170,180}
        };
        printSpiralmat(3, 6, arr);
    }
    public static void printSpiralmat(int row, int col, int[][] arr){
      int left=0, right=col-1;
      int top=0, bottom=row-1;
      while(left<=right && top<=bottom){
        for (int i = left; i <= right; i++) {
            System.out.print(arr[top][i]+" ");
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            System.out.print(arr[i][right]+" ");
        }
        right--;
        if(top<=bottom){
        for (int i = right; i >= left; i--) {
            System.out.print(arr[bottom][i]+" ");
        }
        bottom--;
        }
        if(left<=right){
        for (int i = bottom; i >= top; i--) {
            System.out.print(arr[i][left]+" ");
        }
        left++;
    }
      }
    }
}
