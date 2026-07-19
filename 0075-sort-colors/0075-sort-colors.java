class Solution {
    public void sortColors(int[] nums) {
         for(int i=0;i<nums.length;i++) {
        	    boolean 	swaped=false;
        	    for(int j=1;j<nums.length-i;j++) {
        	    	if(nums[j]<nums[j-1]) {
        	    		swap(nums,j,j-1);
        	    		swaped=true;	
        	    	}
        	   }
        	    if(swaped==false) {
        	    	break;
        	    }
        }
    }
static void swap(int[]arr,int f,int l) {
	int temp=arr[f];
	arr[f]=arr[l];
	arr[l]=temp;
}
}