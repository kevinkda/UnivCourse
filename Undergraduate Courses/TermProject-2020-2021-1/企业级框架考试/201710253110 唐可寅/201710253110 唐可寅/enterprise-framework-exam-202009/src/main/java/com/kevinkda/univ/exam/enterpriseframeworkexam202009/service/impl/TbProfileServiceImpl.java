package com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.impl;

import com.kevinkda.univ.exam.enterpriseframeworkexam202009.domain.TbProfile;
import com.kevinkda.univ.exam.enterpriseframeworkexam202009.mapper.TbProfileMapper;
import com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.TbProfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/23 14:45
 * @version 1.0.0
 * @project enterprise-framework-exam-202009
 * @package com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.impl
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public class TbProfileServiceImpl implements TbProfileService {

    @Resource
    private TbProfileMapper tbProfileMapper;

    @Override
    public int deleteByPrimaryKey(Integer profileId) {
        return tbProfileMapper.deleteByPrimaryKey(profileId);
    }

    @Override
    public int insert(TbProfile record) {
        return tbProfileMapper.insert(record);
    }

    @Override
    public int insertSelective(TbProfile record) {
        return tbProfileMapper.insertSelective(record);
    }

    @Override
    public HashMap selectByPrimaryKey(Integer profileId) {
        return tbProfileMapper.selectByPrimaryKey(profileId);
    }

    @Override
    public int updateByPrimaryKeySelective(TbProfile record) {
        return tbProfileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbProfile record) {
        return tbProfileMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<HashMap> selectAll() {
        return tbProfileMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeyMap(HashMap map) {
        return tbProfileMapper.updateByPrimaryKeyMap(map);
    }

}

