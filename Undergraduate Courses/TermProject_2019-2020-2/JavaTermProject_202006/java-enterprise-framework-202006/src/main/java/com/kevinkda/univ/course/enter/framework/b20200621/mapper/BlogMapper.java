package com.kevinkda.univ.course.enter.framework.b20200621.mapper;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;
import com.kevinkda.univ.course.enter.framework.b20200621.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Kevin KDA on 2020/6/21 16:30
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200621.mapper
 * @classname BlogMapper
 * @apiNote <p></p>
 * @since 2020.06.21
 */
@Mapper
public interface BlogMapper {
    /**
     * 查询Blog信息
     *
     * @return java.util.List<com.kevinkda.univ.course.enter.framework.b20200621.domain.Blog>
     * @author Kevin KDA on 2020/6/21 16:37
     * @description BlogMapper / queryBlog
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/6/21 16:37")
    List<Blog> queryBlog();

    /**
     * 根据blogID查询Blog项目信息
     *
     * @param blogId blogID
     * @return com.kevinkda.univ.course.enter.framework.b20200621.domain.Blog
     * @author Kevin KDA on 2020/6/21 17:51
     * @description BlogMapper / queryBlogById
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/6/21 17:51")
    Blog queryBlogById(int blogId);

    int insertBlog(Blog blog);

    int updateBlog(Blog blog);

    int deleteBlog(int blogId);


}
