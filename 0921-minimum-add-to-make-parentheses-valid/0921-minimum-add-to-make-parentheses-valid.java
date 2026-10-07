class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int c=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    c++;
                }
            }
       }
       return c+st.size();




    
    // int op=0;
    // int cl=0;
    // for(char c : s.toCharArray()){
    //     if(c=='(')op++;
    //     else{
    //         if(op>0)op--;
    //         else cl++;
    //     }
    // }
    // return op+cl;
    }
}