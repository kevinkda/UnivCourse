package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.mapper;

import com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.domain.TrainInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * MyBatis Mapper TrainInfo
 *
 * @author Kevin KDA on 2020/7/6 21:29
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.mapper
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Mapper
public interface TrainInfoMapper {
    /**
     * delete by primary key
     *
     * @param trainNo primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String trainNo);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TrainInfo record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TrainInfo record);

    /**
     * select by primary key
     *
     * @param trainNo primary key
     * @return object by primary key
     */
    TrainInfo selectByPrimaryKey(String trainNo);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TrainInfo record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TrainInfo record);

    /**
     * select all
     *
     * @return object by primary key
     */
    List<TrainInfo> selectAll();

    /**
     * select all
     *
     * @return object by primary key
     */
    List<HashMap> selectAllMap();

    /**
     * select by primary key
     *
     * @param trainNo primary key
     * @return object by primary key
     */
    List<HashMap> selectByPrimaryKeyMap(String trainNo);

    /**
     * delete by primary key
     *
     * @param trainNo primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKeyString(String trainNo);
}