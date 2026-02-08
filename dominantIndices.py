class Solution(object):
    def dominantIndices(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res=0
        n=len(nums)
        for i in range(n-1):
            temp=nums[i+1:]
            if nums[i]>(sum(nums[i+1:])/float(len(temp))):
                res=res+1
        return res
        
        
