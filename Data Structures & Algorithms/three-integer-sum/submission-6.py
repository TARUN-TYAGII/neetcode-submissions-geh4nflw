class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        nums.sort()

        for i,ele in enumerate(nums):
            if i>0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            
            j=i+1
            k=len(nums)-1
            while(j<k):
                sum = nums[i] + nums[j] + nums[k]
                if sum==0:
                    ans.append([nums[i], nums[j], nums[k]])
                    j+=1
                    k-=1
                    while j<k and nums[j] == nums[j-1]:
                        j+=1
                elif sum>0:
                    k-=1
                else:
                    j+=1
        return ans
            

        