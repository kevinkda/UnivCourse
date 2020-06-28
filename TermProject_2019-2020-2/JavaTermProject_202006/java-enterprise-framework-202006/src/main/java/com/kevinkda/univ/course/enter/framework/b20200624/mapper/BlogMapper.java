package com.kevinkda.univ.course.enter.framework.b20200624.mapper;

import com.kevinkda.univ.course.enter.framework.b20200624.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author Kevin KDA on 2020/6/23 20:31
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Mapper
public interface BlogMapper {
    /**
     * delete by primary key
     *
     * @param blogId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer blogId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Blog record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Blog record);

    /**
     * select by primary key
     *
     * @param blogId primary key
     * @return object by primary key
     */
    Blog selectByPrimaryKey(Integer blogId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Blog record);

    /**
     * select by primary key
     *
     * @return object by primary key
     */
    List<Blog> selectAll();
}