class Solution {
    public boolean isBalanced(String num) {
        int ev=0;
        int od=0;
        char[] arr = num.toCharArray();
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                od+=arr[i]-'0';
            }
            else{
                ev+=arr[i]-'0';
            }
        }
        return (od==ev);
    }
}