class Solution:
    def longestPalindrome(self, s: str) -> str:
        str=""
        for i in range(len(s)):
            for j in range(i,len(s)):
                sub=s[i:j+1]
                if sub==sub[::-1]:
                    if len(sub)>=len(str):
                        str=sub
        return str