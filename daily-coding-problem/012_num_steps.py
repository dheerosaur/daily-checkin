
class Solution:

    def climb_iter(self, N, steps):
        table = [1]
        for i in range(1, N + 1):
            ways = 0
            for step in steps:
                if 0 <= i - step < len(table):
                    ways += table[i - step]
            table.append(ways)
        return table[N]


def test():
    sol = Solution()
    cases = [
        (5, [1, 2, 3]),
        (5, [1, 3, 5]),
        (10, [1, 2, 3, 4]),
        (10, [2, 3, 10]),
    ]
    for n, steps in cases:
        print(sol.climb_iter(n, steps))


if __name__ == '__main__':
    test()
