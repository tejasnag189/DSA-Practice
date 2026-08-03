class Solution {
		 public int firstMissingPositive(int[] arr) {
		        
	        Cyclic_Sort(arr);
	        
	        for (int i = 0; i < arr.length; i++){
	            if (arr[i] != i+1){
	                return i+1;
	            }
	        }
	        return arr.length+1;
	    }
	    
	    static void Cyclic_Sort(int[] arr) {
	        int i = 0;
	        while (i < arr.length) {
	            int correct = arr[i]-1;
	            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
	                swap(arr, i, correct);
	            } else {
	                i++;
	            }
	        }
	    }
	    
	    static void swap(int[] arr, int first, int last) {
	        int temp = arr[first];
	        arr[first] = arr[last];
	        arr[last] = temp;
	    }
	}