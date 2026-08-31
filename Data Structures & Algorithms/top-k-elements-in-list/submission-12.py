from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq=Counter(nums)
        sorted_list=sorted(freq, key=freq.get, reverse=True)
        return sorted_list[:k]

        