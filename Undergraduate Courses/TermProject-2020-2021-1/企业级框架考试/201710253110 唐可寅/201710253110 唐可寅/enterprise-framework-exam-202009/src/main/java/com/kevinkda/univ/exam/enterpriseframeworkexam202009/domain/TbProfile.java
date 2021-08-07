package com.kevinkda.univ.exam.enterpriseframeworkexam202009.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kevin KDA on 2020/9/23 14:46
 * @version 1.0.0
 * @project enterprise-framework-exam-202009
 * @package com.kevinkda.univ.exam.enterpriseframeworkexam202009.domain
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbProfile implements Serializable {
    /**
     * 人员id
     */
    private Integer profileId;

    /**
     * 人员姓名
     */
    private String profileName;

    /**
     * 人员年龄
     */
    private Date profileBirthday;

    /**
     * 人员性别
     */
    private String profileGender;

    /**
     * 人员职业
     */
    private String profileCareer;

    /**
     * 人员住所
     */
    private String profileAddress;

    /**
     * 人员手机号
     */
    private String profileMobile;

    private static final long serialVersionUID = 1L;
}