class Solution:
    def isValid(self, s: str) -> bool:
        st = []

        for ele in s:
            if ele in "(,{,[":
                st.append(ele)
            else:
                if len(st)==0:
                    return False
                last = st.pop()
                if (ele == ")" and last!="(") or (ele == "}" and last!="{") or (ele == "]" and last!="["):
                    return False
        return len(st)==0
        