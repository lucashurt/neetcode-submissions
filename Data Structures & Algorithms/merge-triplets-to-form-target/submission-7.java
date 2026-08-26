class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<triplets.length;i++){
            if(triplets[i][0]>target[0] || triplets[i][1]>target[1] || triplets[i][2]>target[2]){
                continue;
            }
            for(int j=0;j<triplets[0].length;j++){
                if(triplets[i][j] == target[j]){
                    set.add(j);
                }
            }
        }
        for(int num: set)
        System.out.println(num);
        return set.size() == 3;
    }
}
