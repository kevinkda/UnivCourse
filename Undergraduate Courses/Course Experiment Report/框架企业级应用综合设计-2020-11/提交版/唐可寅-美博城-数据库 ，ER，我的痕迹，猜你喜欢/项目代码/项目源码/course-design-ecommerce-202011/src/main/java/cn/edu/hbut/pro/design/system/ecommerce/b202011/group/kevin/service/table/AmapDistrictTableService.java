package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.AmapDistrictTable;

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
public interface AmapDistrictTableService{


    int deleteByPrimaryKey(Integer districtId);

    int insert(AmapDistrictTable record);

    int insertOrUpdate(AmapDistrictTable record);

    int insertOrUpdateSelective(AmapDistrictTable record);

    int insertOrUpdateWithBLOBs(AmapDistrictTable record);

    int insertSelective(AmapDistrictTable record);

    AmapDistrictTable selectByPrimaryKey(Integer districtId);

    int updateByPrimaryKeySelective(AmapDistrictTable record);

    int updateByPrimaryKeyWithBLOBs(AmapDistrictTable record);

    int updateByPrimaryKey(AmapDistrictTable record);

    int updateBatch(List<AmapDistrictTable> list);

    int updateBatchSelective(List<AmapDistrictTable> list);

    int batchInsert(List<AmapDistrictTable> list);

}
