public class new_lsearch {
    public static void main(String[] args) {
        int[] arr={45, 89, 90, 0, 3, 26, 78};
        
        int target=0;
        boolean ans = lsearch(arr, target);
        System.out.println(ans);
    }
    static boolean lsearch(int[] arr, int target){
        for(int i:arr){
            if(arr.length==0){
                return false;
            }
            else if(i==target){
                return true;
            }

        }
        return false;
    }
    
}
