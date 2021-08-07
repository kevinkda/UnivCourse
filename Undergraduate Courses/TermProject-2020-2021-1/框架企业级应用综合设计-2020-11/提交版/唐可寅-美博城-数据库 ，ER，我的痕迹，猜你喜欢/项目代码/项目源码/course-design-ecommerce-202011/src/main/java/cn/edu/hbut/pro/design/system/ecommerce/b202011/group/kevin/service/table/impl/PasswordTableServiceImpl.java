package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.PasswordTable;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.PasswordTableMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.PasswordTableService;
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
public class PasswordTableServiceImpl implements PasswordTableService{

    @Resource
    private PasswordTableMapper passwordTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer passId) {
        return passwordTableMapper.deleteByPrimaryKey(passId);
    }

    @Override
    public int insert(PasswordTable record) {
        return passwordTableMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PasswordTable record) {
        return passwordTableMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PasswordTable record) {
        return passwordTableMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(PasswordTable record) {
        return passwordTableMapper.insertOrUpdateWithBLOBs(record);
    }

    @Override
    public int insertSelective(PasswordTable record) {
        return passwordTableMapper.insertSelective(record);
    }

    @Override
    public PasswordTable selectByPrimaryKey(Integer passId) {
        return passwordTableMapper.selectByPrimaryKey(passId);
    }

    @Override
    public int updateByPrimaryKeySelective(PasswordTable record) {
        return passwordTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(PasswordTable record) {
        return passwordTableMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(PasswordTable record) {
        return passwordTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PasswordTable> list) {
        return passwordTableMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<PasswordTable> list) {
        return passwordTableMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<PasswordTable> list) {
        return passwordTableMapper.batchInsert(list);
    }

}
