class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i =left;i<=right;i++){
            String st=words[i];
            char[] arr=st.toCharArray();
            char ch=arr[0];
            char ch2 =arr[arr.length-1];
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(ch2=='a'||ch2=='i'||ch2=='e'||ch2=='o'||ch2=='u')){
                count++;
            }
        }
        return count;
    }
}