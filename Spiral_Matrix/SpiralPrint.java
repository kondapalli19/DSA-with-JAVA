public class SpiralPrint {
    public static void main(String[] args) {
        printspiral(6, 6);
    }
    public static void printspiral(int m, int n){
        int[][] arr = new int[m][n];
        int left=0, right=n-1;
        int top=0, bottom=m-1;
        int N=1;
        while(left<=right && top<=bottom){
            for (int i = left; i <= right; i++,N++) {
                arr[top][i]=N;
            }
            top++;
            for (int i = top; i <= bottom; i++,N++) {
                arr[i][right]=N;
            }
            right--;
            if(top<=bottom){
            for (int i = right; i >= left; i--,N++) {
                arr[bottom][i]=N;
            }
            bottom--;
            }
            if(left<=right){
            for (int i = bottom; i >= top; i--,N++) {
                arr[i][left]=N;
            }
            left++;
        }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]<10)
                System.out.print(arr[i][j]+"  ");
                else
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
