package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.PasswordTable;

import java.util.List;
    /**
 *
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
public interface PasswordTableService{


    int deleteByPrimaryKey(Integer passId);

    int insert(PasswordTable record);

    int insertOrUpdate(PasswordTable record);

    int insertOrUpdateSelective(PasswordTable record);

    int insertOrUpdateWithBLOBs(PasswordTable record);

    int insertSelective(PasswordTable record);

    PasswordTable selectByPrimaryKey(Integer passId);

    int updateByPrimaryKeySelective(PasswordTable record);

    int updateByPrimaryKeyWithBLOBs(PasswordTable record);

    int updateByPrimaryKey(PasswordTable record);

    int updateBatch(List<PasswordTable> list);

    int updateBatchSelective(List<PasswordTable> list);

    int batchInsert(List<PasswordTable> list);

}
