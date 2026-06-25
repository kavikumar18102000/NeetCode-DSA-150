class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> el = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!el.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}