class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l < r){
            while(target < numbers[l] + numbers[r]){
                r--;
            }

            if(numbers[l] + numbers[r] == target){
                return new int[] {l+1, r+1};
            }

            l++;
        }

        return new int[] {0, 0};

    }
}
