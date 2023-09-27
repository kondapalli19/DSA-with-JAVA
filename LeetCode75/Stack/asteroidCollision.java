https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack();
        for(int i=0; i<asteroids.length; i++){
            if(stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
                while(true){
                    int peek=stack.peek();
                    if(peek<0){
                        stack.push(asteroids[i]);
                        break;
                    }
                    else if(peek == -asteroids[i]){
                        stack.pop();
                        break;
                    }
                    else if(peek > -asteroids[i]){
                        break;
                    }
                    else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] output_arr=new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            output_arr[i]=stack.pop();
        }
        return output_arr;
    }
}
