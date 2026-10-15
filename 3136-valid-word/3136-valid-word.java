class Solution {
    public boolean isValid(String word) {
        int l=word.length();
        int v=0;
        int d=0;
            for(char c:word.toCharArray()){
                c=Character.toLowerCase(c);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    v++;
                }
                else if(c>='a' &&c<='z'){
                    d++;
                }
                else if(c>='0' &&c<='9'){
                    continue;
                }
                else{
                    return false;
                }
                
            }
        
        return l>2 && v>0 &&  d>0;
    }
}