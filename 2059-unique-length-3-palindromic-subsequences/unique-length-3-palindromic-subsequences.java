class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.get(ch)[1] = i;
            } else {
                map.put(ch, new int[] { i, -1 });
            }
        }
        int count = 0;
        for (Character c : map.keySet()) {
            int[] idx = map.get(c);
            if (idx[1] != -1) {
                count += countUnique(idx[0], idx[1], s);
            }
        }
        return count;
    }

    public int countUnique(int i,int j,String s){
        HashSet<Character> set = new HashSet<>();
        for(int k=i+1;k<j;k++){
            set.add(s.charAt(k));
        }
        return set.size();
    }
}