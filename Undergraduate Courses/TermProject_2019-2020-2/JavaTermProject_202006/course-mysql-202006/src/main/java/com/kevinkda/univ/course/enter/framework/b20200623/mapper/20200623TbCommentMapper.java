package com.kevinkda.univ.course.enter.framework.b20200623.mapper;

import com.kevinkda.univ.course.enter.framework.b20200623.domain.20200623TbComment;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author Kevin KDA on 2020/6/23 20:48
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Mapper
public interface 20200623TbCommentMapper {
    /**
     * delete by primary key
     * @param commentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(20200623TbComment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(20200623TbComment record);

    /**
     * select by primary key
     * @param commentId primary key
     * @return object by primary key
     */
    20200623TbComment selectByPrimaryKey(Integer commentId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(20200623TbComment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(20200623TbComment record);
}