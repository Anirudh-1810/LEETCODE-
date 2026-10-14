class Solution {
    public int titleToNumber(String ct) {
        long ans=0;
        for(int i =0;i<ct.length();i++){
            char ch =ct.charAt(i);
            ans=ans*26+(ch - 'A' +1 );
        }
        return (int) ans;
    }
}