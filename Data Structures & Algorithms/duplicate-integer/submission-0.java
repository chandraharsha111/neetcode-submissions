class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet();

        for(int num : nums){
           if(hashSet.add(num) == false){
            return true;
           }         
        }

        return false;
    }
}