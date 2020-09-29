package com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/16 14:42
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {
    /**
     * delete by primary key
     *
     * @param userId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     *
     * @param userId primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);

    /**
     * select by primary key
     *
     * @return object by primary key
     */
//    List<Map<String, Object>> selectAll();

    List<HashMap> selectAll();

    int deleteByIds(List ids, @Param("item") String item);
}