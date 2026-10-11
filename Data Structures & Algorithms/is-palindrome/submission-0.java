class Solution {
    public boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        char[] arr = lowerS.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            while(left < right && !isLetterOrDigit(arr[left])){
                left++;
            }
            while(right > left && !isLetterOrDigit(arr[right])){
                right--;
            }

            if(arr[left] != arr[right]){
                return false;
            }

            left++;
            right--;
        }

        return true;
        
    }

    public static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
