class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] count = new int[26];
            for(int i=0;i<str.length();i++){
                count[str.charAt(i) - 'a']++;
            }
            map.putIfAbsent(Arrays.toString(count),new ArrayList<>());
            map.get(Arrays.toString(count)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
