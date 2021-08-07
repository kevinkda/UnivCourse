package com.kevinkda.univ.exam.enterpriseframeworkexam202009.service;

import com.kevinkda.univ.exam.enterpriseframeworkexam202009.domain.TbProfile;

import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/23 14:46
 * @version 1.0.0
 * @project enterprise-framework-exam-202009
 * @package com.kevinkda.univ.exam.enterpriseframeworkexam202009.service
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface TbProfileService {


    int deleteByPrimaryKey(Integer profileId);

    int insert(TbProfile record);

    int insertSelective(TbProfile record);

    HashMap selectByPrimaryKey(Integer profileId);

    int updateByPrimaryKeySelective(TbProfile record);

    int updateByPrimaryKey(TbProfile record);

    List<HashMap> selectAll();

    int updateByPrimaryKeyMap(HashMap map);

}
