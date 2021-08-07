# -*- encoding: utf-8 -*-
"""
@File       :   
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/7 23:58     Kevin Tang  0.0.1       None
"""
import traceback
from time import strftime, time, sleep, localtime

from loguru import logger

from system.config.const.constants import Constants


def run():
    logger.info('主程序本次开始运行时间：' + strftime("%Y-%m-%d %H:%M:%S", localtime()))
    try:
        logger.info('程序初始化完成')
        # 前置自动运行暂停, 预留用户填入数据文件时间

        # 开始自动执行报告生成程序
    except Exception as e:
        logger.exception(e)
        logger.error(traceback.format_exc())
    finally:
        end_time = time()

        # 程序中断显示运行结果
        sleep(2)
        interrupt_before_program_end()

        return end_time


def interrupt_before_program_end():
    if Constants.enable_breakpoint_before_program_end:
        # input("Program run completed, any key to end.\nIf there is any abnormality, please feed back the complete folder: ")
        input("程序运行结束, 请按任意键结束运行.\n如有任何程序问题请及时将故障点及Log日志向Trans反馈: ")
