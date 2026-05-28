class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums1.length;
        for(int i=0;i<n;i++){
            map.put(nums1[i],i);
        }
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st = new Stack<>();
        for(int num: nums2){
            while(!st.isEmpty() && num > st.peek()){
                int val = st.pop();
                int idx = map.get(val);
                ans[idx]=num;
            }
            if(map.containsKey(num)){
                st.push(num);
            }
        }
        return ans;
    }
}