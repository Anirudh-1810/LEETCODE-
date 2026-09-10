class Solution {
    public int findTheWinner(int n, int k) {
        // int c =1;
        // Queue<Integer> q = new LinkedList<>();
        // for(int i =1;i<=n;i++){
        //     q.offer(i);
        // }
        // while(q.size()!=1){
        //     if(c!=k){
        //         q.offer(q.poll());
        //         c++;
        //     }
        //     else{
        //         q.poll();
        //         c=1;
        //     }
        // }
        // return q.peek();
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }
        return ans + 1;
    }
}