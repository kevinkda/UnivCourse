package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.SystemPermissions;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.SystemPermissionsMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.SystemPermissionsService;
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
public class SystemPermissionsServiceImpl implements SystemPermissionsService{

    @Resource
    private SystemPermissionsMapper systemPermissionsMapper;

    @Override
    public int deleteByPrimaryKey(Integer privilegeId) {
        return systemPermissionsMapper.deleteByPrimaryKey(privilegeId);
    }

    @Override
    public int insert(SystemPermissions record) {
        return systemPermissionsMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SystemPermissions record) {
        return systemPermissionsMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SystemPermissions record) {
        return systemPermissionsMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SystemPermissions record) {
        return systemPermissionsMapper.insertSelective(record);
    }

    @Override
    public SystemPermissions selectByPrimaryKey(Integer privilegeId) {
        return systemPermissionsMapper.selectByPrimaryKey(privilegeId);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemPermissions record) {
        return systemPermissionsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemPermissions record) {
        return systemPermissionsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SystemPermissions> list) {
        return systemPermissionsMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SystemPermissions> list) {
        return systemPermissionsMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SystemPermissions> list) {
        return systemPermissionsMapper.batchInsert(list);
    }

}
