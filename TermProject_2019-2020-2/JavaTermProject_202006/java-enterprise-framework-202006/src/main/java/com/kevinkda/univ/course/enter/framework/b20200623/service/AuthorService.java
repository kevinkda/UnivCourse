package com.kevinkda.univ.course.enter.framework.b20200623.service;

import com.kevinkda.univ.course.enter.framework.b20200623.domain.Author;
import com.kevinkda.univ.course.enter.framework.b20200623.mapper.AuthorMapper;

import javax.annotation.Resource;

/**
 * @author Kevin KDA on 2020/6/23 20:48
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.service
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class AuthorService {

    @Resource
    private AuthorMapper authorMapper;


    public int deleteByPrimaryKey(Integer authorId) {
        return authorMapper.deleteByPrimaryKey(authorId);
    }


    public int insert(Author record) {
        return authorMapper.insert(record);
    }


    public int insertSelective(Author record) {
        return authorMapper.insertSelective(record);
    }


    public Author selectByPrimaryKey(Integer authorId) {
        return authorMapper.selectByPrimaryKey(authorId);
    }


    public int updateByPrimaryKeySelective(Author record) {
        return authorMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Author record) {
        return authorMapper.updateByPrimaryKey(record);
    }

}
