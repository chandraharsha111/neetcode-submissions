class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        // Add all stones to ProprityQueue 
        for(int stone : stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size()>1){
            // Since we reveresed the collection order in priority queue 
            int largestNumber = maxHeap.poll();
            int secondLargestNum = maxHeap.poll();

            if(largestNumber != secondLargestNum){
                maxHeap.add(largestNumber - secondLargestNum);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
        
    }
}
