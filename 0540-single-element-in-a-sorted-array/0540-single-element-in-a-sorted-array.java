class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;

        if(n==1)return arr[0];
        if(arr[0]!=arr[1])return arr[0];
        if(arr[n-1]!=arr[n-2])return arr[n-1];

        int start=1;
        int end=n-2;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid]== arr[mid + 1])) { 
                //(agr mid ka n odd h toh usse phle wala check krta h || or agar mid ka index even h toh uske right wala check krta h aur agr dono me mil rha h repeated to mtlb ki abhi tk single element nhi aaya isliye )
                start = mid + 1;   // right taraf dhundo 
            } else {
                end = mid - 1;   // nhi toh left taraf dhundo 
            }
        }
        return -1;
    }
}