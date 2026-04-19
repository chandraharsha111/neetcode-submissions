class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i <= n; i++){
            // i & 1 is i%1 
            // i >> 1 is is i/2
            result[i] = result[ i >> 1 ] + (i & 1);
        } 

        return result; 
    }
}
