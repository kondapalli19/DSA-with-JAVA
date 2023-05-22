import java.util.Arrays;

public class SpiralMatiii {
    public static void main(String[] args) {
        SpiralMatiii solution = new SpiralMatiii();

        int rows = 5;
        int cols = 4;
        int rStart = 1;
        int cStart = 2;

        int[][] matrix = solution.spiralMatrixIII(rows, cols, rStart, cStart);

        System.out.println("Spiral Matrix:");
        for (int[] row : matrix) {
            System.out.print("["+row[0] + "," + row[1]+"]"+" ");
        }
    }
        public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            int[][] matrix = new int[rows*cols][2];
            int k = 0;
            
            int rEnd = rStart + 1;
            int cEnd = cStart + 1;
    
            while(true) {
                // right 
                for(int i = cStart; i <= cEnd; i++) {
                    if(i < cols && i >= 0 && rStart >= 0) {
                        matrix[k][0] = rStart;
                        matrix[k][1] = i;
                        k++;
                    }
                }
                cStart--;
                cEnd++;
    
                if(k == matrix.length) {
                    break;
                }
    
                // down 
                for(int i = rStart + 1; i <= rEnd; i++) {
                    if(i < rows && i >= 0 && cEnd - 1 < cols) {
                        matrix[k][0] = i;
                        matrix[k][1] = cEnd - 1;
                        k++;
                    }
                }
                rStart--;
                rEnd++;
    
                if(k == matrix.length) {
                    break;
                }
    
                // left
                for(int i = cEnd - 2; i >= cStart; i--) {
                    if(i >= 0 && i < cols && rEnd - 1 < rows) {
                        matrix[k][0] = rEnd - 1;
                        matrix[k][1] = i;
                        k++;
                    }
                }
            
                if(k == matrix.length) {
                    break;
                }
    
                // up
                for(int i = rEnd - 2; i > rStart; i--) {
                    if(i >= 0 && i < rows && cStart >= 0) {
                        matrix[k][0] = i;
                        matrix[k][1] = cStart;
                        k++;
                    }
                }
            
                if(k == matrix.length) {
                    break;
                }
            }
            return matrix;
        }
    
}
