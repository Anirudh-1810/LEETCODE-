class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a'] = i;
        }
        boolean[] seen = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(seen[ch-'a']) continue;
            while(!st.isEmpty() && st.peek()>ch && last[st.peek()-'a']>i){
                char rm = st.pop();
                seen[rm-'a'] = false;
            }
            st.push(ch);
            seen[ch-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}