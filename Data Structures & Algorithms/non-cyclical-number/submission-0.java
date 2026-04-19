class Solution {
    public boolean isHappy(int n) {
     
        HashSet<Integer> seen = new HashSet<Integer>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = getNextN(n);
        }
        return n == 1;
    }


    int getNextN(int n){
        int totalSum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            totalSum= totalSum + lastDigit * lastDigit;
            n = n/10;
        }
        return totalSum;
    }
      
}
