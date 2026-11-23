class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp={}
        ans=[]
        for ele in strs:
            key=''.join(sorted(ele))
            if key not in mp:
                mp[key]=[]
            mp[key].append(ele)
        return list(mp.values())
        