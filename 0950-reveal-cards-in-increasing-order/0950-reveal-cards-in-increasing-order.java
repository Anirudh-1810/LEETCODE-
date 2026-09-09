class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int n = deck.length;
        Arrays.sort(deck);
        for (int i=0; i<n; i++){
            q.offer(i);
        }
        int[] res = new int[n];
        for (int j : deck){
            res[q.poll()] = j;
            if(!q.isEmpty()) q.offer(q.poll());
        }
        return res;
    }
}