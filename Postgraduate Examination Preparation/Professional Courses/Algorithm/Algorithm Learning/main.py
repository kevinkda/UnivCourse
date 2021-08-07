# -*- encoding: utf-8 -*-
"""
@File       :   main.py
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/7 23:27     Kevin Tang  0.0.1       None
"""
from time import time, strftime, localtime

from loguru import logger

from system.control import control

if __name__ == '__main__':
    begin_time = time()
    logger.info('程序本次开始运行时间：' + strftime("%Y-%m-%d %H:%M:%S", localtime()))

    module_time = control.run()

    end_time = time()
    logger.info('程序本次结束运行时间：' + strftime("%Y-%m-%d %H:%M:%S", localtime()))
    run_time = end_time - begin_time
    logger.info('程序运行差异时间：' + str(run_time - module_time) + 's')
    logger.info('程序本次运行时间：' + str(run_time) + 's')
