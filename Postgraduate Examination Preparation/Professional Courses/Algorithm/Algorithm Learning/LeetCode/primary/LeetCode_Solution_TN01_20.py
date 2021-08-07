# -*- encoding: utf-8 -*-
"""
@File       :   
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/8 0:11     Kevin Tang  0.0.1       None
"""
import doctest

from typing import List

from icecream import ic
from loguru import logger


class Solution(object):
    class twoSum(object):
        """
        1. 两数之和
        给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
        你可以按任意顺序返回答案。

        示例 1：
        输入：nums = [2,7,11,15], target = 9
        输出：[0,1]
        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
        https://leetcode-cn.com/problems/two-sum/
        """
        def twoSumA(self, nums: List[int], target: int) -> List[int]:
            backList: List[int] = []
            itemCountA: int = 0
            print("Nums: " + str(nums))
            print("Target: " + str(target))
            for fItem in nums:
                itemCountB: int = itemCountA + 1
                flag: bool = False
                # while(itemCountB<len(nums)):
                # for sItem in range(itemCountA+1, len(nums)):
                # for sItem in nums[itemCountB:len(nums)]:
                for sItem in nums[itemCountB:-1]:
                    # itemCountB+=1
                    # sItem=nums[itemCountB]
                    print("First Item: " + str(fItem) + " ,Second Item: " + str(sItem))
                    if (fItem + sItem) == target:
                        print("Testing Cut")
                        backList.append(itemCountA)
                        backList.append(itemCountB)
                        # backList=[itemCountA,itemCountB]
                        print("Item Count A: " + str(itemCountA))
                        print("Item Count B: " + str(itemCountB))
                        flag = True
                        break
                if flag:
                    break
                itemCountA += 1

            print("Back List: " + str(backList))
            return backList

        def twoSumB(self, nums: List[int], target: int) -> List[int]:
            """
            :param nums:
            :param target:
            :return:

            >>> Solution().twoSum().twoSumB(nums=[2, 7, 11, 15], target=9)
            [0, 1]
            >>> Solution().twoSum().twoSumB(nums=[3, 2, 4], target=6)
            [1, 2]
            """
            # logger.debug("Nums: " + str(nums) + ", Targer: " + str(target))

            backList: List[int] = []
            itemCountA: int = 0
            itemCountB: int = 0
            runCount: int = 0

            for itemLayerA in nums:
                itemCountB = itemCountA + 1
                exitFlag: bool = False
                splitList: list = nums[itemCountB:len(nums)]
                # logger.warning(str(splitList))
                for itemLayerB in splitList:
                    runCount += 1
                    # logger.debug(runCount)
                    # logger.info("Item Layer A: " + str(itemLayerA) + ", Item Layer B: " + str(itemLayerB))
                    # logger.info("Item Layer A: " + str(itemCountA) + ", Item Layer B: " + str(itemCountB))
                    if (itemLayerA + itemLayerB) == target:
                        backList.append(itemCountA)
                        backList.append(itemCountB)
                        # logger.warning(str(True))
                        exitFlag = True
                        break
                    itemCountB += 1
                if exitFlag:
                    break
                itemCountA += 1
            # logger.info("Back List: " + str(backList))
            return backList


if __name__ == '__main__':
    ic(doctest.testmod())
    pass
