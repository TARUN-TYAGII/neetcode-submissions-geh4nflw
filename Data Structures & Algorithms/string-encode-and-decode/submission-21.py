class Solution:

    def encode(self, strs: List[str]) -> str:
        ans=''
        for ele in strs:
            ans += str(len(ele)) + '#' + ele
        return ans
        

    def decode(self, s: str) -> List[str]:
        i=0
        ans=[]
        while i < len(s):
            j=i
            while s[j] != '#':
                j+=1
            length = int(s[i:j])
            word = s[j+1: j+1+length]
            ans.append(word)
            i=j+1+length
        return ans
