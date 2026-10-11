class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < strs.size(); i++){
            String s = strs.get(i);
            sb.append(s.length() +  "#" + strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            list.add(str.substring(i, j));
            i = j;
        }

        return list;
    }
}
