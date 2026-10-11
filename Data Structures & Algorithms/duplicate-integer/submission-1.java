class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }

        return false;
    }
}
