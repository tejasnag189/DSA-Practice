class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
	int end=nums.length-1;
	
	while(start<end) {
		int num1=nums[start];
		int num2=nums[end];
		
		if(num1+num2==target) {
			return new int [] {start+1 ,end+1};
		}else if(num1+num2>target) {
			end--;
		}else {
			start++;
		}
		
	}
	return new int [] {-1,-1};
    }
}