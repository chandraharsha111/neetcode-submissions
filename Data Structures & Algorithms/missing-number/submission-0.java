class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int xorr = n;

        for (int i = 0; i < n; i++){
            // Xorr with index value, number in index and final element to find missing no
            xorr = xorr ^ nums[i] ^ i;
        }

        return xorr;
        
    }
}
