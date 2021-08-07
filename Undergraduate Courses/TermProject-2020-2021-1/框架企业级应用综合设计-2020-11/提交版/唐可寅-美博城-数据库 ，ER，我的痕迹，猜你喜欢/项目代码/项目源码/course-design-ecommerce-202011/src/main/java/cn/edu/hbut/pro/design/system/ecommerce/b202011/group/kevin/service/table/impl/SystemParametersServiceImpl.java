package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.SystemParameters;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.SystemParametersMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.SystemParametersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Service
public class SystemParametersServiceImpl implements SystemParametersService{

    @Resource
    private SystemParametersMapper systemParametersMapper;

    @Override
    public int deleteByPrimaryKey(Integer parameterId) {
        return systemParametersMapper.deleteByPrimaryKey(parameterId);
    }

    @Override
    public int insert(SystemParameters record) {
        return systemParametersMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SystemParameters record) {
        return systemParametersMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SystemParameters record) {
        return systemParametersMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(SystemParameters record) {
        return systemParametersMapper.insertOrUpdateWithBLOBs(record);
    }

    @Override
    public int insertSelective(SystemParameters record) {
        return systemParametersMapper.insertSelective(record);
    }

    @Override
    public SystemParameters selectByPrimaryKey(Integer parameterId) {
        return systemParametersMapper.selectByPrimaryKey(parameterId);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemParameters record) {
        return systemParametersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SystemParameters record) {
        return systemParametersMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(SystemParameters record) {
        return systemParametersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SystemParameters> list) {
        return systemParametersMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SystemParameters> list) {
        return systemParametersMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SystemParameters> list) {
        return systemParametersMapper.batchInsert(list);
    }

}
