class Solution {
    public void reverseString(char[] s) {
        int i =0;
        rev(s,i);
    }
    static void rev(char[] s,int i){
        int l= s.length;
        int j=l-i-1;
        if(i==l/2)return;
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            rev(s,i+1);
    }
}