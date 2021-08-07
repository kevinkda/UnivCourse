# -*- encoding: utf-8 -*-
"""
@File       :   constants.py
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/7 23:32     Kevin Tang  0.0.1       None
"""
import json
import os
import sys
import uuid

from loguru import logger


class Constants(object):
    # Debug测试控制
    debug_enabled: bool = False
    # debug_enabled: bool = True
    # 日志输出到文件功能启用标识
    enable_logging_output_to_file: bool = False
    # 程序结束前断点功能启用标识
    # enable_breakpoint_before_program_end: bool = True
    enable_breakpoint_before_program_end: bool = False
    # 更新版本序列号功能启用标识
    enable_update_version_serial_number: bool = True
    # enable_update_version_serial_number: bool = False

    # 当前程序运行UUID
    current_uuid: str = str(uuid.uuid4()).upper()


class SystemPath(object):
    # 程序根路径
    root_path: str = os.getcwd() + os.path.sep

    # 日志输出路径
    log_folder_path: str = root_path + 'log' + os.path.sep
    # 配置文件夹路径
    config_folder_path: str = root_path + 'config' + os.path.sep
    # 输出文件夹路径
    output_folder_path: str = root_path + 'output' + os.path.sep

    # 输出文件夹路径
    output_weibo_folder_path: str = output_folder_path + 'weibo' + os.path.sep

    # 系统配置文件路径(YAML)
    yaml_application_config_path: str = config_folder_path + 'application.yaml'
    # 系统配置文件路径(JSON)
    json_application_config_path: str = config_folder_path + 'config.json'


class SystemConfig(object):
    # JSON格式配置信息
    json_format_config: json

    def __init__(self):
        self.get_config()
        logger.info(self.json_format_config)

    def get_config(self):
        """
        获取config.json文件信息
        :return:
        """
        # 核验系统配置文件路径(JSON)是否存在
        if not os.path.isfile(SystemPath.json_application_config_path):
            logger.warning('当前路径：{} 不存在配置文件config.json'.format(
                os.path.split(os.path.realpath(__file__))[0] + os.sep)
            )
            sys.exit()
        # 尝试开启文件读取数据
        try:
            with open(SystemPath.json_application_config_path, encoding='utf-8') as f:
                self.json_format_config = json.loads(f.read())
        except ValueError:
            logger.error('config.json 格式不正确，请参考 '
                         'https://github.com/dataabc/weibo-crawler#3程序设置')
            sys.exit()
