from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups= defaultdict(list)
        for ele in strs:
            key = "".join(sorted(ele))
            groups[key].append(ele)
        return list(groups.values())

        