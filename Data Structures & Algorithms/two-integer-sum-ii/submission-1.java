class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        // int s =0;
        // int e = n-1;
        // int[] ans = new int[2];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int sum = numbers[i] + numbers[j];
        //         if(sum == target){
        //             ans[0]=i+1;
        //             ans[1]=j+1;
        //         }
        //     }
        // }
        int s=0;
        int e=n-1;

        while(s<e){
            int sum = numbers[s] + numbers[e];
            if(sum > target) e--;
            else if(sum < target) s++;
            else{
                return new int[]{s+1,e+1};
            }
        }
        return new int[0];
        
    }
}
