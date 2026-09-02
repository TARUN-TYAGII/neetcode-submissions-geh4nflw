class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxx=nums[0]
        add=nums[0]

        for ele in nums[1:]:
            add = max(ele, ele+add)
            maxx = max(add,maxx)
        return maxx

        

        