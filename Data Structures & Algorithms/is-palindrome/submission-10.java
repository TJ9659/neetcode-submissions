class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        s = s.toLowerCase();

        while(l < r){
            while(r > l && !isAlpOrNum(s.charAt(r))){
                r--;
            }
            while(l < r && !isAlpOrNum(s.charAt(l))){
                l++;
            }

            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;
        }

        return true;

    }

    public static boolean isAlpOrNum(char c){
        return (c >= 'a' && c <= 'z' ||
            c >= 'A' && c <= 'Z' ||
            c >= '0' && c <= '9'
        );
    }
}
