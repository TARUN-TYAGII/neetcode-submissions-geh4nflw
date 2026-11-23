class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        n = len(nums)
        ans=0
        seen = set()

        for ele in nums:
            seen.add(ele)

        for ele in nums:
            if ele-1 not in seen:
                start=ele
                local=0
                while ele in seen:
                    ele+=1
                    local+=1
                ans=max(ans,local)
        return ans

        