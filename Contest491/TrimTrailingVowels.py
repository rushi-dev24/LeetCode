class Solution(object):
    def trimTrailingVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        length=len(s)
        vowels=['a','e','i','o','u']
        s = s[::-1]
        
        for i in range(0,length):
            if s[i] in vowels:
                pass
            else:
                return s[i:][::-1]
        return ""
        ©leetcode
