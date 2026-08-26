class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if(sArray.length!=tArray.length){
            return false;
        }
    
        Map<Integer,Integer> sMap = new HashMap<>();
        Map<Integer,Integer> tMap = new HashMap<>();

        for(int i=0;i<sArray.length;i++){
            int sAscii = (int)sArray[i];
            int tAscii = (int)tArray[i];

            sMap.put(sAscii,sMap.getOrDefault(sAscii,0)+1);
            tMap.put(tAscii,tMap.getOrDefault(tAscii,0)+1);
        }
        if(sMap.equals(tMap)){
            return true;
        }
        return false;
    }
}
