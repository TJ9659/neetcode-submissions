class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        for(int i = 0; i < arrS.length; i++){
            if(!mapS.containsKey(arrS[i])){
                mapS.put(arrS[i], 0);
            }else{
                mapS.put(arrS[i], mapS.get(arrS[i]) + 1);
            }
        }

        for(int i = 0; i < arrT.length; i++){
            if(!mapT.containsKey(arrT[i])){
                mapT.put(arrT[i], 0);
            }else{
                mapT.put(arrT[i], mapT.get(arrT[i]) + 1);
            }
        }

        if(mapS.equals(mapT)){
            return true;
        }

        return false;
    }
}
