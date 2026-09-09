class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26)return false;
        int[] freq =new int[26];
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]==0){
                return false;
            }

        }
        return true;

    }
}