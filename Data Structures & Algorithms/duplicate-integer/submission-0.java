class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> el = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(el.contains(nums[i])){
                return true;
            }
            else{
                el.add(nums[i]);
            }
        }

        return false;
    }
}