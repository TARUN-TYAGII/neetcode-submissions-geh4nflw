class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        arr=[]
        freq={}
        for i,ele in enumerate(nums):
            diff = target - ele
            if diff in freq:
                return [freq.get(diff),i]
            freq[ele]=i
        return [-1,-1]
