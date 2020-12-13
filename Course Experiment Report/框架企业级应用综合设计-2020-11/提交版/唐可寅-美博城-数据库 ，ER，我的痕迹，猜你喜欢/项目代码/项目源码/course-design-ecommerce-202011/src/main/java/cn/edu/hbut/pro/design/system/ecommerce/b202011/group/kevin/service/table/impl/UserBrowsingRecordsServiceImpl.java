package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserBrowsingRecords;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.UserBrowsingRecordsMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.UserBrowsingRecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
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
public class UserBrowsingRecordsServiceImpl implements UserBrowsingRecordsService {

    @Resource
    private UserBrowsingRecordsMapper userBrowsingRecordsMapper;

    @Override
    public int deleteByPrimaryKey(Integer recordId) {
        return userBrowsingRecordsMapper.deleteByPrimaryKey(recordId);
    }

    @Override
    public int insert(UserBrowsingRecords record) {
        return userBrowsingRecordsMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UserBrowsingRecords record) {
        return userBrowsingRecordsMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UserBrowsingRecords record) {
        return userBrowsingRecordsMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UserBrowsingRecords record) {
        return userBrowsingRecordsMapper.insertSelective(record);
    }

    @Override
    public UserBrowsingRecords selectByPrimaryKey(Integer recordId) {
        return userBrowsingRecordsMapper.selectByPrimaryKey(recordId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserBrowsingRecords record) {
        return userBrowsingRecordsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserBrowsingRecords record) {
        return userBrowsingRecordsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UserBrowsingRecords> list) {
        return userBrowsingRecordsMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UserBrowsingRecords> list) {
        return userBrowsingRecordsMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UserBrowsingRecords> list) {
        return userBrowsingRecordsMapper.batchInsert(list);
    }

}

