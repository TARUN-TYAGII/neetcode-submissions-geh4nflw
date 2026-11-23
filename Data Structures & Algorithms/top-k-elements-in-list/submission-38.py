from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count=Counter(nums)
        ans=[]
        for ele,freq in count.most_common(k):
            ans.append(ele)
        return ans

        