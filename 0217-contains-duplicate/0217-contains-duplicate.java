class Solution {
    public boolean containsDuplicate(int[] nums) {
        //bubbleSort(nums);
         Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]==nums[start+1]||nums[end]==nums[end-1]){
                return true;
            }else{
                start++;
                end--;
            }
        }
        return false;
    }
    public void bubbleSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
                if(swapped==false){
                    break;
             }
        }
    }
}