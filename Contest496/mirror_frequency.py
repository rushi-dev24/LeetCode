from collections import Counter

class Solution(object):
    def mirrorFrequency(self, s):
        counts=Counter(s)
        unpaired_count=0
        for char in s:
            if char.isdigit():
                mirror=chr(ord('0')+(9-(ord(char)-ord('0'))))
            elif 'a'<=char<='z':
                mirror=chr(ord('a')+(25-(ord(char)-ord('a'))))
            else:
                mirror=None
            if mirror and counts[mirror]>0:
                counts[mirror]-=1
            else:
                unpaired_count+=1
        return unpaired_count
©leetcode
