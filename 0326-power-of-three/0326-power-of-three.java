class Solution {
    public boolean isPowerOfThree(int n) {
        long power=1;
        if(n<1){
            return false;
        }
        while(power<n){
            power=power*3;
        }
        if(power==n||-(power)==n){
            return true;
        }
        return false;
    }
}