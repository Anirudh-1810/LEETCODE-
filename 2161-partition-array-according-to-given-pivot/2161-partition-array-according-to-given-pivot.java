class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        int index =0;
        int res[]=new int[arr.length];
        for(int x:arr){
            if(x<pivot){
                res[index++]=x;
            }
        }
        for(int x:arr){
            if(x==pivot){
                res[index++]=x;
            }
        }
        for(int x:arr){
            if(x>pivot){
                res[index++]=x;
            }
        }

        return res;
    }
}