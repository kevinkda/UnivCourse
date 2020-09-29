package com.kevinkda.univ.course.enter.framework.b20200629.service;

import com.kevinkda.univ.course.enter.framework.b20200629.domain.Author;
import com.kevinkda.univ.course.enter.framework.b20200629.mapper.AuthorMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/6/23 20:48
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200629.service
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


    public int insert(Map record) {
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

    public int updateByPrimaryKeySelectiveOfMap(Map record) {
        return authorMapper.updateByPrimaryKeySelectiveOfMap(record);
    }

    public int selectCount() {
        return authorMapper.selectCount().get(0);
    }

    public List<Map> selectAuthorList(Map<String, Object> map) {
        return authorMapper.selectAuthorList(map);
    }

    public int updateByPrimaryKey(Author record) {
        return authorMapper.updateByPrimaryKey(record);
    }

    public List<Author> selectAll() {
        return authorMapper.selectAll();
    }

    public AuthorMapper getAuthorMapper() {
        return authorMapper;
    }

    public void setAuthorMapper(AuthorMapper authorMapper) {
        this.authorMapper = authorMapper;
    }
}
