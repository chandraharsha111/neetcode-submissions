class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mapResult = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            mapResult.putIfAbsent(key, new ArrayList<>());
            mapResult.get(key).add(s);
        }
        return new ArrayList<>(mapResult.values());

        
    }
}
