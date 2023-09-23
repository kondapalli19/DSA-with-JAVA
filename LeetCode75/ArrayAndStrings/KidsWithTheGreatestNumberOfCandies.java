class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=maxItem(candies);
        for(int i=0; i<candies.length; i++){
                if(candies[i]+extraCandies>=max){
                    list.add(true);
                }
                else{
                    list.add(false);
                }
        }
        return list;
    }
    public int maxItem(int[] candies){
        int max=candies[0];
        for(int i=1; i<candies.length; i++){
            if(max<candies[i])
                max=candies[i];
        }
        return max;
    }
}
