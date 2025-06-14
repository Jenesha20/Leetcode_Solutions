class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        d={}
        for i in nums:
            if i in d:
                c=d[i]
                d[i]=c+1
            else:
                d[i]=0
        for i in d:
            if d[i]>=1:
                return True
        return False
        
        