https://leetcode.com/problems/dota2-senate/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String predictPartyVictory(String senate) {
      Queue<Integer> radiant=new LinkedList<>();
      Queue<Integer> dire=new LinkedList<>();
        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i)=='R'){
                radiant.add(i);
            }else{
                dire.add(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r=radiant.poll(), d=dire.poll();
            if(r<d){
                radiant.add(r+senate.length());
            }
            
            else{
                 dire.add(d+senate.length());
            }
        }
        return (radiant.size()>dire.size())?"Radiant":"Dire";
    }
}
