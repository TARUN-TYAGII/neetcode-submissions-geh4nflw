class Solution:
    def maxArea(self, heights: List[int]) -> int:
        ans=0
        p1=0
        p2=len(heights)-1
        for num in heights:
            height = min(heights[p1], heights[p2])
            water = height * (p2-p1)
            ans = max(ans, water)

            if heights[p1] < heights[p2]:
                p1 +=1
            else:
                p2 -=1
        return ans
        