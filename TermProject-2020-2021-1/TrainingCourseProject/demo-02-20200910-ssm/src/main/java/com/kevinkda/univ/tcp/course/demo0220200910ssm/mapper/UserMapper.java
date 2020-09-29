package com.kevinkda.univ.tcp.course.demo0220200910ssm.mapper;

import com.kevinkda.univ.tcp.course.demo0220200910ssm.domain.User;

/**
 *
 * @author Kevin KDA on 2020/9/15 17:35
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
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