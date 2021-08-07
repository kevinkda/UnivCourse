package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.service;

import com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.domain.TrainInfo;
import com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.mapper.TrainInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * TrainInfo服务层
 *
 * @author Kevin KDA on 2020/7/6 21:29
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.service
 * @classname TrainInfoService
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public class TrainInfoService {

    @Resource
    private TrainInfoMapper trainInfoMapper;

    public int deleteByPrimaryKey(String trainNo) {
        return trainInfoMapper.deleteByPrimaryKey(trainNo);
    }

    public int deleteByPrimaryKeyString(String trainNo) {
        return trainInfoMapper.deleteByPrimaryKey(trainNo);
    }

    public int insert(TrainInfo record) {
        return trainInfoMapper.insert(record);
    }

    public int insertSelective(TrainInfo record) {
        return trainInfoMapper.insertSelective(record);
    }

    public TrainInfo selectByPrimaryKey(String trainNo) {
        return trainInfoMapper.selectByPrimaryKey(trainNo);
    }

    public List<HashMap> selectByPrimaryKeyMap(String trainNo) {
        return trainInfoMapper.selectByPrimaryKeyMap(trainNo);
    }

    public List<TrainInfo> selectAll() {
        return trainInfoMapper.selectAll();
    }

    public List<HashMap> selectAllMap() {
        return trainInfoMapper.selectAllMap();
    }

    public int updateByPrimaryKeySelective(TrainInfo record) {
        return trainInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TrainInfo record) {
        return trainInfoMapper.updateByPrimaryKey(record);
    }

}
