package com.kevinkda.univ.course.enter.framework.b20200624.mapper;

import com.kevinkda.univ.course.enter.framework.b20200624.domain.Comment;
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
public interface CommentMapper {
    /**
     * delete by primary key
     *
     * @param commentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Comment record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Comment record);

    /**
     * select by primary key
     *
     * @param commentId primary key
     * @return object by primary key
     */
    Comment selectByPrimaryKey(Integer commentId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Comment record);

    /**
     * select by blogId
     *
     * @param blogId blogId
     * @return object by blogId
     */
    List<Comment> selectByBlogId(Integer blogId);
}