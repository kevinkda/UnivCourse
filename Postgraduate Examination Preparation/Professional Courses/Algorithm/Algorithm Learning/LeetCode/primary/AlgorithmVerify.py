# -*- encoding: utf-8 -*-
"""
@File       :   
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/8 0:13     Kevin Tang  0.0.1       None
"""
import unittest

from icecream import ic

from LeetCode.primary.LeetCode_Solution_TN01_20 import Solution


class AlgorithmVerifyTesting(unittest.TestCase):

    # def verify(self, functionName, args):
    #     ic(functionName(args))
    # pass

    def test(self):
        self.leetCode_Solution_TN01()

    def leetCode_Solution_TN01(self):
        self.assertEqual(ic(Solution().twoSumA(nums=[2, 7, 11, 15], target=9)), [0, 1])
        self.assertEqual(ic(Solution().twoSumA(nums=[3, 2, 4], target=6)), [1, 2])
        self.assertEqual(Solution().twoSumA(nums=[2, 7, 11, 15], target=9), [0, 1])
