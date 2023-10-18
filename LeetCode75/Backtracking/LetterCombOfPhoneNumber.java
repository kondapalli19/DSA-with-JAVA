class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<String>();
        int num=Integer.parseInt(digits);
        return keypad(num);
    }
       public List<String> keypad(int num){
        String[] options={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String output="";
        return keypad(num, output, options);
    }
        public List<String> keypad(int num, String output, String[] options){
        if(num==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(output);
            return list;
        }
        int n1=num%10;
        String s1=options[n1];
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            list.addAll(keypad(num/10, s1.charAt(i)+output, options));
        }
        return list;
    }
    }
