package com.kevinkda.univ.course.enter.framework.b20200629.mapper;

import com.kevinkda.univ.course.enter.framework.b20200629.domain.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/6/27 22:36
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200629.mapper
 * @classname
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
    int insert(Map record);

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

    /**
     * select all
     *
     * @return object all
     */
    List<Author> selectAll();

    /**
     * select count
     *
     * @return object count
     */
    List<Integer> selectCount();

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelectiveOfMap(Map record);

    /**
     * select all limit
     *
     * @return object all
     * @param map
     */
    List<Map> selectAuthorList(Map<String, Object> map);
}
