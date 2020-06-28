package com.kevinkda.univ.course.enter.framework.b20200623.mapper;

import com.kevinkda.univ.course.enter.framework.b20200623.domain.Author;
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
public interface AuthorMapper {
    /**
     * delete by primary key
     *
     * @param authorId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer authorId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Author record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Author record);

    /**
     * select by primary key
     *
     * @param authorId primary key
     * @return object by primary key
     */
    Author selectByPrimaryKey(Integer authorId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Author record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Author record);
}