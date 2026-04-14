class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        

        int s =0;
        int e=n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int ele = nums[mid];
            if(ele == target) return mid;
            else if( ele < target) s++;
            else e--;
        }
        return -1;
        
    }
}
