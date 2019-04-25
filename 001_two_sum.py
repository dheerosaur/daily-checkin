"""
Given a list of numbers and a number k, return whether any two numbers from
the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17
"""
from nose.tools import assert_equal


def two_sum_set(nums, target):
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(target - num)
    return False


class TestBit(object):

    def test_two_sum(self, two_sum_f):
        assert_equal(two_sum_f([1, 2, 3, 4, 5], 6), True)
        assert_equal(two_sum_f([1, 2, 3, 4, 5], 4), True)
        assert_equal(two_sum_f([-1, 2, 9, 0, 4], 3), True)
        assert_equal(two_sum_f([1, 2, 3, 4, 5], 0), False)
        print('Success: {}'.format(two_sum_f.__name__))


def main():
    test = TestBit()
    test.test_two_sum(two_sum_set)


if __name__ == '__main__':
    main()
