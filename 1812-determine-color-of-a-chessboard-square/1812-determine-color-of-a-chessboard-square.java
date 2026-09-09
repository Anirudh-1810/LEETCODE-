class Solution {
    public boolean squareIsWhite(String c) {
        int i =0;
        int j=1;
        if(c.charAt(i)=='a' || c.charAt(i)=='c' || c.charAt(i)=='e' || c.charAt(i)=='g'){
            if(c.charAt(j)=='1' || c.charAt(j)=='3' || c.charAt(j)=='5' || c.charAt(j)=='7'){
                return false;
            }
        }
        else if(c.charAt(i)=='b' || c.charAt(i)=='d' || c.charAt(i)=='f' || c.charAt(i)=='h'){
                if(c.charAt(j)=='2' || c.charAt(j)=='4' || c.charAt(j)=='6' || c.charAt(j)=='8'){
                return false;
            }
        }
        return true;
        
    }
}