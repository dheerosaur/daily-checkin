from collections import deque


class Solution:
    """
    Create a Deque q that will store indices of array elements.
    The queue will store indices useful in every window and it will
    maintain decreasing order of values from front to rear in q.
    That is, A[q.front()] to A[q.rear()] are sorted in decreasing order
    """

    def print_max(self, A, k):
        q = deque()

        for i in range(k):
            while q and A[i] >= A[q[-1]]:
                q.pop()
            q.append(i)

        for i in range(k, len(A)):
            print('{} '.format(A[q[0]]), end=' ')

            while q and q[0] <= i - k:
                q.popleft()

            while q and A[i] >= A[q[-1]]:
                q.pop()

            q.append(i)

        print('{} '.format(A[q[0]]))


def test():
    sol = Solution()
    cases = [
        ([10, 5, 8, 2, 3, 9, 6], 3),
        ([1, 2, 3, 5, 4, 6, 7], 5),
        (range(10), 4),
    ]
    for case in cases:
        sol.print_max(*case)
        # assert sol.print_max() == sol.print_max_2()


if __name__ == '__main__':
    test()
