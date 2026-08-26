class Solution {
    public boolean stoneGame(int[] piles) {
        int l = 0,r = piles.length-1;
        int aScore = 0, bScore = 0;
        int turn = 0;

        while(l<=r){
            if(piles[l] >=piles[r]){
                if(turn %2 == 0){aScore += piles[l];}
                else{bScore += piles[l];}
                l++;
            }
            else{
                if(turn % 2 == 0){aScore += piles[r];}
                else{bScore += piles[r];}
                r--;
            }
        }
        return (aScore>bScore) ? true : false;
    }
}