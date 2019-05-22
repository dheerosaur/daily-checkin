opp = dict(zip('({[]})', ')}][{('))


class Solution:
    def well_formed(self, parens: str) -> bool:
        stack = []
        for paren in parens:
            if stack and stack[-1] == opp[paren]:
                stack.pop()
            else:
                stack.append(paren)
        return not stack


def test():
    sol = Solution()
    cases = [
        '([])[]({})',
        '([)]',
        '((()',
    ]
    for case in cases:
        print(sol.well_formed(case))


if __name__ == '__main__':
    test()
