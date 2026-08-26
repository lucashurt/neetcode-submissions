class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        openers = {")" : "(", "]" : "[", "}" : "{"}
        for c in s:
            if c in openers:
                if stack and stack[-1] == openers[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)

        return True if not stack else False