# -*- encoding: utf-8 -*-
"""
@File       :   
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/7 23:30     Kevin Tang  0.0.1       None
"""
import logging
import os
from time import strftime, localtime

from loguru import logger

from system.config.const.constants import SystemPath


def config_loguru_log():
    """
    Loguru第三方库日志服务配置
    :return:
    """
    # cur = datetime.datetime.now()
    log_path: str = SystemPath().log_folder_path

    log_path += strftime("%Y%m%d", localtime()) + os.path.sep + "log_{time}" + Constants.current_uuid + ".log"

    # if cur.month < 10:
    #     log_path += str(cur.year) + "0" + str(cur.month) + str(cur.day) + os.path.sep \
    #                 + "log_{time}.log"
    # else:
    #     log_path += str(cur.year) + str(cur.month) + str(cur.day) + os.path.sep \
    #                 + "log_{time}.log"

    logger.add(
        log_path,
        # "log" + os.path.sep + "{date}" + os.path.sep + "log_{time}.log",
        rotation="10 MB",
        encoding="utf-8",
        enqueue=True,
        compression="zip",
        retention="4 weeks",
        # serialize=True
    )

    # 系统日志配置加载成功
    logger.info("System log configuration loaded successfully")


def config_logging_sys():
    """
    Python SDK自带日志服务配置
    :return:
    """
    level = logging.DEBUG
    logging.basicConfig(
        # 定义输出到文件的log级别，大于此级别的都被输出
        level=level,
        # 定义输出log的格式
        # format='%(asctime)s %(filename)s : %(levelname)s %(message)s',
        format='%(asctime)s %(name)-30s %(levelname)-8s %(message)s',
        # format='[%(levelname)s][%(asctime)s] %(message)s',
        # format='[%(levelname)s][%(asctime)s][%(filename)s:%(lineno)d]%(message)s',
        # format='[%(asctime)s][%(threadName)s:%(thread)d][task_id:%(name)s][%(filename)s:%(lineno)d]' \
        #        '[%(levelname)s][%(message)s]',
        # 时间
        datefmt='%Y-%m-%d %H:%M:%S',
        # log文件名
        filename='logging.log',
        # 写入模式“w”或“a”
        filemode='a'
    )
    # Define a Handler and set a format which output to console
    # 定义console handler
    console = logging.StreamHandler()
    # 定义该handler级别
    console.setLevel(level)
    formatter = logging.Formatter('%(asctime)s  %(filename)s : %(levelname)s  %(message)s')  # 定义该handler格式
    console.setFormatter(formatter)
    # Create an instance
    # 实例化添加handler
    logging.getLogger().addHandler(console)
