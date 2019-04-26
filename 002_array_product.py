"""
Given an array of integers, return a new array such that each element at index
i of the new array is the product of all the numbers in the original array
except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be
[120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be
[2, 3, 6].

"""
from typing import List


def product_except_self(nums: List[int]) -> List[int]:
    """
    It feels straight forward, but there are edge cases if we are looking for
    a solution with multiplying all numbers and then using division

    At the least, we have to eliminate division by 0
    >>> product_except_self([0, 1])
    [1, 0]

    You can't just ignore 0s while calculating product because
    the whole product other than self can simply be zero when there are more 0s
    >>> product_except_self([0, 0, 1])
    [0, 0, 0]

    Simple test case
    >>> product_except_self([1, 2, 3, 4])
    [24, 12, 8, 6]

    More cases
    >>> product_except_self([-4, 5, 0, 6])
    [0, 0, -120, 0]

    >>> product_except_self([-1, -2, -3])
    [6, 3, 2]
    """
    result = [1]
    for i in range(1, len(nums)):
        result.append(result[i - 1] * nums[i - 1])

    product = 1
    for i in range(len(nums) - 1, -1, -1):
        result[i] *= product
        product *= nums[i]

    return result


if __name__ == "__main__":
    import doctest
    doctest.testmod()
