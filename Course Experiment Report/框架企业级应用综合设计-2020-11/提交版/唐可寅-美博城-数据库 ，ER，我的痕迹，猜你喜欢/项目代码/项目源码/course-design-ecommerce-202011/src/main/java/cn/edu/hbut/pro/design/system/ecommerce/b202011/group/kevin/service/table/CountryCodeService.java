package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.CountryCode;

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
public interface CountryCodeService{


    int deleteByPrimaryKey(Integer countryId);

    int insert(CountryCode record);

    int insertOrUpdate(CountryCode record);

    int insertOrUpdateSelective(CountryCode record);

    int insertOrUpdateWithBLOBs(CountryCode record);

    int insertSelective(CountryCode record);

    CountryCode selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKeySelective(CountryCode record);

    int updateByPrimaryKeyWithBLOBs(CountryCode record);

    int updateByPrimaryKey(CountryCode record);

    int updateBatch(List<CountryCode> list);

    int updateBatchSelective(List<CountryCode> list);

    int batchInsert(List<CountryCode> list);

}
