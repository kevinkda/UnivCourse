package com.kevinkda.demo.proj.spring.cloud.test.b20201117.mapper;

import com.kevinkda.demo.proj.spring.cloud.test.b20201117.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author Kevin KDA on 2020/11/17 16:48
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.spring.cloud.test.b20201117.mapper
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {
    /**
     * delete by primary key
     * @param userId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     * @param userId primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);
}