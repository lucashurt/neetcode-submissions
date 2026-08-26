class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
    public void quicksort(int[]arr,int low, int high){
        if(low < high){
            int p1 = partition(arr,low,high);
            quicksort(arr,low,p1-1);
            quicksort(arr,p1+1,high);
        }
    }

    public int partition (int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}