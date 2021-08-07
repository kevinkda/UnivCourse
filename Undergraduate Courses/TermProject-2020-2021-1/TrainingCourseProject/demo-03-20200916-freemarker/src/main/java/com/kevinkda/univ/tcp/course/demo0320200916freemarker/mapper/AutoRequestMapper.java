package com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.AutoRequest;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author Kevin KDA on 2020/9/17 15:27
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Mapper
public interface AutoRequestMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(AutoRequest record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AutoRequest record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    AutoRequest selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AutoRequest record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AutoRequest record);
}