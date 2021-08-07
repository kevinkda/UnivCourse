# -*- encoding: utf-8 -*-
"""
@File       :   
@Contact    :   kevin_kda@yahoo.com.au
@License    :   (C)Copyright 2017-2021, KevinKDA

@Modify Time        @Author     @Version    @Description
----------------    ----------- --------    ------------
2021/8/7 23:38     Kevin Tang  0.0.1       None
"""
from system import log
from system.config.const.constants import Constants

if Constants.enable_logging_output_to_file:
    log.config_loguru_log()

# 获得系统参数
# SYSTEM_CONFIG = SystemConfig().json_format_config
