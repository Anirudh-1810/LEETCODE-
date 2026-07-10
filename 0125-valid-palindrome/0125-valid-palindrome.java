class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        // String str=st.replaceAll("[^a-zA-z0-9]","");
        // int i=0;
        // int j=str.length()-1;
        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
            
        // }
        // System.out.println(str);
        // return true;
        String str = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
        
    }
}