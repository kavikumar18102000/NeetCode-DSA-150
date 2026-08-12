class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            else set.add(i);
        }
        return false;
    }
}