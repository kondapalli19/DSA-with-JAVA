https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
class Solution 
{
    public int equalPairs(int[][] grid) 
    {
        int countOfEqualPairs = 0;
        boolean blnEqual;

        for(int idx=0; idx<grid.length; idx++)
        { 
            for(int j=0; j<grid.length; j++)
            {
                blnEqual = true;
                for(int k=0; k<grid.length; k++)
                {
                    if(grid[idx][k] != grid[k][j])
                    {
                        blnEqual = false;
                        break;
                    }
                }  
                countOfEqualPairs += blnEqual ? 1 : 0;              
            }             
        }

        return countOfEqualPairs;
    }
}
