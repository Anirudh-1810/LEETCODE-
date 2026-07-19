class Solution {
    public int gcd(int i ,int j){
        if(j==0)return i;
        return gcd(j,i%j);
    }
    public int findGCD(int[] arr) {
    //    int lg=Integer.MIN_VALUE;
    //    int sl= Integer.MAX_VALUE;
    //    for(int i = 0;i<arr.length;i++){
    //     if(arr[i]>lg){
    //         lg=arr[i];
    //     }
    //     if(arr[i]<sl){
    //         sl=arr[i];
    //     }

    //    }
       Arrays.sort(arr);
       int len=arr.length-1;
       int i=arr[0];
       int j=arr[len];
       int res=gcd(i,j);
       return res;
    }
}