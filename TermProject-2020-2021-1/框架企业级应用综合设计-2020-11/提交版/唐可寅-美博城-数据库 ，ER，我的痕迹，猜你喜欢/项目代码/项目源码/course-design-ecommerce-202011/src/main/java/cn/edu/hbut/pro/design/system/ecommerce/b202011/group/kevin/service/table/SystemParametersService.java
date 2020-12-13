package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.SystemParameters;

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
public interface SystemParametersService{


    int deleteByPrimaryKey(Integer parameterId);

    int insert(SystemParameters record);

    int insertOrUpdate(SystemParameters record);

    int insertOrUpdateSelective(SystemParameters record);

    int insertOrUpdateWithBLOBs(SystemParameters record);

    int insertSelective(SystemParameters record);

    SystemParameters selectByPrimaryKey(Integer parameterId);

    int updateByPrimaryKeySelective(SystemParameters record);

    int updateByPrimaryKeyWithBLOBs(SystemParameters record);

    int updateByPrimaryKey(SystemParameters record);

    int updateBatch(List<SystemParameters> list);

    int updateBatchSelective(List<SystemParameters> list);

    int batchInsert(List<SystemParameters> list);

}
