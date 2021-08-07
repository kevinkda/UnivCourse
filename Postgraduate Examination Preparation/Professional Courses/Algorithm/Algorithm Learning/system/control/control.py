# -*- encoding: utf-8 -*-
"""
@File       :   
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/7 23:52     Kevin Tang  0.0.1       None
"""
from time import time, strftime, localtime

from loguru import logger

from system.config.const.constants import Constants
from system.control import debug, product


def run():
    begin_time = time()
    logger.info('主程序本次开始运行时间：' + strftime("%Y-%m-%d %H:%M:%S", localtime()))

    # 核验是否进入debug模式
    if Constants.debug_enabled:
        debug.run()
    else:
        product.run()

    end_time = time()
    run_time = end_time - begin_time
    logger.info('主程序本次结束运行时间：' + strftime("%Y-%m-%d %H:%M:%S", localtime()))
    logger.info('主程序本次运行时间：' + str(run_time) + 's')
    return run_time
