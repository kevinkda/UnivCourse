package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserBrowsingRecords;

import java.util.List;

/**
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table
 * @classname ${CLASS_NAME}
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
public interface UserBrowsingRecordsService {


    int deleteByPrimaryKey(Integer recordId);

    int insert(UserBrowsingRecords record);

    int insertOrUpdate(UserBrowsingRecords record);

    int insertOrUpdateSelective(UserBrowsingRecords record);

    int insertSelective(UserBrowsingRecords record);

    UserBrowsingRecords selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(UserBrowsingRecords record);

    int updateByPrimaryKey(UserBrowsingRecords record);

    int updateBatch(List<UserBrowsingRecords> list);

    int updateBatchSelective(List<UserBrowsingRecords> list);

    int batchInsert(List<UserBrowsingRecords> list);

}

