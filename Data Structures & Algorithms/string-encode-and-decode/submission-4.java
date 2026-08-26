class Solution {

    public String encode(List<String> strs) {
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            newStr.append(strs.get(i).length());
            newStr.append('#');
            newStr.append(strs.get(i));
        }
        return newStr.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int ptr = 0;
        while(ptr<str.length()){
            StringBuilder num = new StringBuilder();
            while(str.charAt(ptr)!='#'){
                num.append(str.charAt(ptr));
                ptr++;
            }
            int length = Integer.parseInt(num.toString());
            res.add(str.substring(ptr+1,ptr+length+1));
            ptr+=length+1;
        }
        return res;
    }
}
