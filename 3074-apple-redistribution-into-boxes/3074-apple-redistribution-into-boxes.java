// class Solution {
//     public int minimumBoxes(int[] apple, int[] cap) {
//         int asum=0;
//         int ans=0;
//         for(int num:apple){
//             asum+=num;
//         }
//         Arrays.sort(cap);
//         for(int j=cap.length-1;j>=0;j--){
//                 asum-=cap[j];
//                 ans++;
//                 if(asum<=0){
//                     return ans;
//                 }
            
//         }
//         return ans;
//     }
// }
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total = 0;
        for(int i : apple){
            total += i;
        }
        int box = 0;
        for(int i=capacity.length-1;i>=0;i--){
            total -= capacity[i];
            box++;
            if(total<=0) return box;
        }
        return box;
    }
}