package com.kevinkda.univ.exam.enterpriseframeworkexam202009.mapper;

import com.kevinkda.univ.exam.enterpriseframeworkexam202009.domain.TbProfile;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/23 14:46
 * @version 1.0.0
 * @project enterprise-framework-exam-202009
 * @package com.kevinkda.univ.exam.enterpriseframeworkexam202009.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Mapper
public interface TbProfileMapper {
    /**
     * delete by primary key
     *
     * @param profileId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer profileId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TbProfile record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbProfile record);

    /**
     * select by primary key
     *
     * @param profileId primary key
     * @return object by primary key
     */
    HashMap selectByPrimaryKey(Integer profileId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TbProfile record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TbProfile record);

    /**
     * select All
     *
     * @return object by primary key
     */
    List<HashMap> selectAll();

    int updateByPrimaryKeyMap(HashMap map);
}