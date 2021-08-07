package com.kevinkda.univ.exam.javase.term20192.dao;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;

/**
 * @author Kevin KDA on 2020/5/22 09:11
 * @version 1.0.0
 * @project exam-java-2019-term-2
 * @package com.kevinkda.univ.exam.javase.term20192.dao
 * @classname IManagerDao
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface IManagerDao {
    /**
     * 添加DVD，操作层方法
     *
     * @param name     传入DVD名称
     * @param state    传入DVD状态信息
     * @param outDated 传入借出日期
     * @param time     传入借出次数
     * @return int 返回添加状态值
     * @author Kevin KDA on 2020/5/22 09:37
     * @description IManagerDao / add
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:37")
    int add(String name, int state, int outDated, int time);

    /**
     * 显示所有数据
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 10:04
     * @description IManagerDao / showAll
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 10:04")
    void showAll();

    /**
     * 进行数据修改
     *
     * @param name 传入待修改的名字
     * @param nameNew 传入修改后的名字
     * @return int 返回修改状态值
     * @author Kevin KDA on 2020/5/22 10:25
     * @description IManagerDao / modify
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 10:25")
    int modify(String name, String nameNew);
}
