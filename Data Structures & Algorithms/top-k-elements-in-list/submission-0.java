class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        //counting frequency of each number
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        //create buckets where index represents the frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : frequencyMap.keySet()){
            int frequency =  frequencyMap.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(key);
        }

        //Collect the top k frequent elements from right to left
        int[] result = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[index++] = num;
                    if(index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
