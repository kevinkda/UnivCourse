package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Mapper
public interface UserAddressMapper {
    /**
     * delete by primary key
     * @param addressId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer addressId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UserAddress record);

    int insertOrUpdate(UserAddress record);

    int insertOrUpdateSelective(UserAddress record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserAddress record);

    /**
     * select by primary key
     * @param addressId primary key
     * @return object by primary key
     */
    UserAddress selectByPrimaryKey(Integer addressId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserAddress record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserAddress record);

    int updateBatch(List<UserAddress> list);

    int updateBatchSelective(List<UserAddress> list);

    int batchInsert(@Param("list") List<UserAddress> list);
}