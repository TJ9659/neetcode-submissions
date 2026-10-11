class Solution {
    public boolean isPalindrome(String s) {
        String formattedS = s.toLowerCase();
        char[] arr = formattedS.toCharArray();
        int r = arr.length - 1;
        int l = 0;

        while(l < r){
            while(l < r && !isLetterOrDigit(arr[l])){
                l++;
            }

            while(r > l && !isLetterOrDigit(arr[r])){
                r--;
            }

            if(arr[l] != arr[r]){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    public static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
