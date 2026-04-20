class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Create a Map of numbers and their frequencies
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int n : nums){
           countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1 ];

        // Adding numbers with same frequency into a List 
        for(int key : countMap.keySet()){
            int frequency = countMap.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        // Iterate backwards from the highest frequency to fill the result
        int[] result = new int[k];
        int counter = 0;
        for(int i = buckets.length-1; i >= 0 && counter < k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[counter] = num;
                    counter = counter + 1;
                    if(counter == k){
                       return result;
                    }
                }
            }
        }

      return result;
    }
}
