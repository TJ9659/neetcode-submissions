class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        for(int i = 0; i < charArrayS.length; i++){
            mapS.put(charArrayS[i], i);
        }

        for(int i = 0; i < charArrayT.length; i++){
            mapT.put(charArrayT[i], i);
        }

        if(mapS.equals(mapT)){
            return true;
        }

        return false;
    }
}
