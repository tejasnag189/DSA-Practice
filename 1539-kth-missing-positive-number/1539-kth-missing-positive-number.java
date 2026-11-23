class Solution {
    public int findKthPositive(int[] arr, int k) {
        int currentValue=1;
        int missing=0;
        int index=0;
        while(k>0){
             if(index<arr.length&&arr[index]==currentValue){
                index++;
                currentValue++;
            }

            else{
                missing=currentValue;
                currentValue++;
                k--;
            }
           
        }
        return missing ;
    }
}