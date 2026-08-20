class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int sum=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='R'){
                sum++;
            }
            if(ch=='L'){
                sum--;
            }
            if(sum==0){
                count++;
            }

        }
        return count;
    }
}