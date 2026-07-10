class Solution {
    public int[] productExceptSelf(int[] height) {
        int n = height.length;
        int[] leftm = new int[n];
        int[] rightm= new int[n];
        leftm[0]=1;
        rightm[n-1]=1;
        for(int i=1;i<n;i++){
            leftm[i]=leftm[i-1]*height[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightm[i]=rightm[i+1]*height[i+1];
        }
        int[] res= new int[n];
        for(int i =0;i<n;i++){
            res[i]=leftm[i]*rightm[i];
        }
        return res;
    }
}

