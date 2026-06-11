class Solution:
    def maxArea(self, heights: List[int]) -> int:
        ans = 0
        p1 = 0
        p2 = len(heights) - 1

        while p1 < p2:
            height = min(heights[p1], heights[p2])
            area = height * (p2 - p1)
            ans = max(ans, area)

            if heights[p1] < heights[p2]:
                p1 = p1 + 1
            else:
                p2 = p2 - 1

        return ans
