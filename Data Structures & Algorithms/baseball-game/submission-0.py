class Solution:
    def calPoints(self, operations: List[str]) -> int:
        res = 0
        stack = []
        for operation in operations:
            if operation == "+":
                addition = stack[-1] + stack[-2]
                res += addition
                stack.append(addition)
            elif operation == "D":
                multiplication = stack[-1] * 2
                res += multiplication
                stack.append(multiplication)
            elif operation == "C":
                res -= stack.pop()
            else:
                res += int(operation)
                stack.append(int(operation))
        return res
        