package com.kevin.homepage.manager;

import com.kevin.homepage.entity.Project;
import com.kevin.homepage.entity.TaskDetails;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Kevin KDA on 2020/2/22 18:15
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.homepage.manager
 * @classname Manager
 * @description TODO
 * @interface/enum
 */
public class Manager {
    private static ArrayList<Project> projects = new ArrayList<Project>(
            Arrays.asList(new Project(
                            "Java程序开发概述 - Job20200218",
                            "20200218",
                            "控制台输出个人简历",
                            "Java SE",
                            "#"
                    ), new Project(
                            "Web入门作业 - Job20200219",
                            "20200219",
                            "Servlet用语句输出个人简历",
                            "Java Web",
                            "work/job20200219/vitae.jsp"
                    ), new Project(
                            "Servlet入门作业 - Job20200220",
                            "20200221",
                            "Servlet转发注册页面提交的用户数据",
                            "Java Web",
                            "work/job20200221/register.jsp"
                    ), new Project(
                            "JSP入门作业 - Job20200221",
                            "20200223",
                            "JSP实现用户注册登录&输出用户列表",
                            "Java Web",
                            "work/job20200223/"
                    ), new Project(
                            "Session会话跟踪 - Job20200224",
                            "20200225",
                            "",
                            "Java Web",
                            "work/job20200225/"
                    )
            )
    );
    private static ArrayList<TaskDetails> taskDetails = new ArrayList<TaskDetails>(
            Arrays.asList(new TaskDetails(
                            "job20200218",
                            "2020-2-18-17gb计职1-唐可寅-第一章Java程序开发概述",
                            "20200217",
                            "20200218",
                            "<p>作业1： </p>\n" +
                                    "            <p>题目：打印自己的一份简历，包括姓名、年龄、性别、电话、QQ、邮箱、微信、学习经历、主修课程、项目经验等。</p>\n" +
                                    "            <p>考核点：能够正确搭建编译运行环境、能够熟练使用打印输出语句，能够编译运行Java类；</p>\n" +
                                    "            <p> 难度：低</p>"
                    ), new TaskDetails(
                            "job20200219",
                            "2020-2-19-17gb计职1-唐可寅-Web入门作业",
                            "20200219",
                            "20200219",
                            "<p>作业1： </p>\n" +
                                    "            <p> 题目：配置tomcat，并且进行调试测试。 </p>\n" +
                                    "            <p> 难度：低 </p>\n" +
                                    "            <br>\n" +
                                    "            <p>作业2： </p>\n" +
                                    "            <p> 题目：修改tomcat端口号8787，并且进行调试测试。 </p>\n" +
                                    "            <p> 难度：低 </p>\n" +
                                    "            <br>\n" +
                                    "            <p>作业3： </p>\n" +
                                    "            <p> 题目：创建Web应用，编写一个Servlet，实现功能：在页面中输出个人简历（姓名，身高，体重，身份证号，家庭住址等等。。）。 </p>\n" +
                                    "            <p> 难度：低 </p>"
                    ), new TaskDetails(
                            "job20200221",
                            "2020-2-21-17gb计职1-唐可寅-第二章Servlet入门作业",
                            "20200220",
                            "20200221",
                            "<p>作业1： </p>\n" +
                                    "            <p>题目：编写html页面，提供注册表单，注册表单中至少要用到文本框、多选框、单选框、下拉列表等表单元素，填写信息后提交到Servlet，Servlet读取注册信息进行显示。</p>\n" +
                                    "            <p>难度：易</p>\n" +
                                    "            <p>作业2：</p>\n" +
                                    "            <p>题目：编写Servlet，验证Servlet的初始化过程，包括配置启动项情况。</p>\n" +
                                    "            <p>难度：易</p>\n" +
                                    "            <p>作业3： </p>\n" +
                                    "            <p>题目：编写Servlet，验证初始化参数的配置和使用。并同时验证使用通配符配置Servlet的方法。</p>\n" +
                                    "            <p>难度：易</p>\n" +
                                    "            <p>作业4： </p>\n" +
                                    "            <p>题目：Servlet 初始化参数和全局参数有什么区别？</p>\n" +
                                    "            <p>难度：易</p>"
                    ), new TaskDetails(
                            "job20200223",
                            "2020-2-23-17gb计职1-唐可寅-第三章JSP入门作业",
                            "20200221",
                            "20200223",
                            "<p>作业1： </p>\n" +
                                    "            <p>题目：在课堂中登录功能的基础上，实现注册功能，要求：有输入校验，用户名、密码、QQ都不能为空，QQ只能是数字组成；用户名不能重复；</p>\n" +
                                    "            <p> 难度：中</p>\n" +
                                    "            <p>作业2： </p>\n" +
                                    "            <p>题目：在课堂中登录/注册功能的基础上，完成查看所有注册用户信息功能，要求显示用户的五个字段。</p>\n" +
                                    "            <p> 难度：中</p>"
                    ), new TaskDetails(
                            "job20200225",
                            "2020-2-25-17gb计职1-唐可寅-第四章会话跟踪作业",
                            "20200224",
                            "20200225",
                            "<p>作业1： </p>\n" +
                                    "<p>题目：模拟实现购物车功能；</p>\n" +
                                    "<p>  1）用户登录后，可以查看商品信息列表，进行添加购物车操作；</p>\n" +
                                    "<p>  2）可以查看购物车中所有选购商品；</p>\n" +
                                    "<p>  3）如果40分钟内没有操作，需要重新登录；</p>\n" +
                                    "<p>  4）商品数据存储在数据库中；</p>\n" +
                                    "<p>  难度：中</p>\n" +
                                    "<p>商品 ID 商品名称商品详情商品数量</p>\n" +
                                    "<p>（添加商品，删除商品）（思考：分页）（简单 Session 里面去难的就是数据库）查询，删除，修改 数量</p>\n" +
                                    "<p>添加汽水 3</p>\n"
                    )
            )
    );


    public static ArrayList<Project> getAllProjects() {
        return projects;
    }

    public static TaskDetails getTaskDetailByTaskName(String strTaskName) {
        for (TaskDetails task :
                taskDetails) {
            if (strTaskName.equals(task.getStrTaskName())) {
                return task;
            }
        }
        return null;
    }
}
