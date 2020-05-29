package com.kevinkda.univ.exam.javase.term20192.dao.impl;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;
import com.kevinkda.univ.exam.javase.term20192.dao.IManagerDao;
import com.kevinkda.univ.exam.javase.term20192.model.Dvd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/22 09:14
 * @version 1.0.0
 * @project exam-java-2019-term-2
 * @package com.kevinkda.univ.exam.javase.term20192.dao.impl
 * @classname ManagerDaoImpl
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class ManagerDaoImpl implements IManagerDao {
    private static List<Dvd> list = null;

    /**
     * 添加DVD，操作层方法
     *
     * @param name     传入DVD名称
     * @param state    传入DVD状态信息
     * @param outDated 传入借出日期
     * @param time     传入借出次数
     * @return int 返回添加状态值
     * @author Kevin KDA on 2020/5/22 10:43
     * @description ManagerDaoImpl / add
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 10:43")
    @Override
    public int add(String name, int state, int outDated, int time) {
//        进行同名内容核验
        int nameCheckFlag = checkDvdName(name);

//        进行同名内容返回结果核验，内容不存在则添加数据
        if (nameCheckFlag == 0) {
//            获得为空的序列化ID
            int serial = getDvdId();
//            创建临时变量实例化数据
            Dvd temp = new Dvd(serial, state, name, outDated, time);
//            向序列化数据中添加临时数据
            list.add(temp);
//            返回成功结果
            return 0;
        } else {
//            存在同名内容，返回错误结果
            return nameCheckFlag;
        }
    }

    /**
     * 显示所有数据
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 10:44
     * @description ManagerDaoImpl / showAll
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 10:44")
    @Override
    public void showAll() {
//        显示字段标题
        System.out.println("\n序号\t\tDVD名称\t\t状态\t\t借出日期\t借出次数");

//        循环遍历输出结果
        for (Dvd i :
                list) {
//            获得借出状态
            String lendFlag = i.getState() == 0 ? "可借" : "已借出";

//            System.out.println("i.toString() = " + i.toString());
            System.out.println(i.getSerial() + "\t\t"
                    + i.getName() + "\t\t"
                    + lendFlag + "\t\t"
                    + i.getOutDated() + "\t\t"
                    + i.getTime()
            );
        }
//        添加空行
        System.out.println();

    }

    /**
     * 进行数据修改
     *
     * @param name    传入待修改的名字
     * @param nameNew 传入修改后的名字
     * @return int 返回修改状态值
     * @author Kevin KDA on 2020/5/22 10:44
     * @description ManagerDaoImpl / modify
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 10:44")
    @Override
    public int modify(String name, String nameNew) {
//        进行同名内容核验
        int nameCheckFlag = checkDvdName(name);

//        进行同名内容返回结果核验，内容存在则修改数据
        if (nameCheckFlag == -1) {
//            进行修改后重名核验
            int nameNewCheckFlag = checkDvdName(nameNew);

//            进行同名内容返回结果核验，内容存在则修改数据
            if (nameNewCheckFlag == 0) {
//                循环遍历数据进行数据库修改
                for (Dvd i :
                        list) {
                    if (name.equals(i.getName())) {
//                        进行数据修改
                        i.setName(nameNew);
//                        返回成功结果
                        return 0;
                    }
                }
            }
//            修改后数据重名
            return -2;
        } else {
//            不存在同名内容，返回错误结果
            return -1;
        }
    }


//    程序逻辑处理方法

    /**
     * 检查数据序列中是否有同名内容存在
     *
     * @param name 传入DVD名称
     * @return int 返回数据中存在结果
     * @author Kevin KDA on 2020/5/22 09:49
     * @description ManagerDaoImpl / checkDvdName
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:49")
    private int checkDvdName(String name) {
        for (Dvd i :
                list) {
//            进行传入数据和序列化数据的重名检查
            if (name.equals(i.getName())) {
//                重名值存在返回-1
                return -1;
            }
        }
//        重名值不存在返回0
        return 0;
    }

    /**
     * 提供返回空序号的方法，服务于添加新的DVD
     *
     * @return int 返回一个为空的序号值
     * @author Kevin KDA on 2020/5/22 09:47
     * @description ManagerDaoImpl / getDvdId
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:47")
    private int getDvdId() {
//        返回末位项目serial的下一值，即serial + 1
        return list.get(list.size() - 1).getSerial() + 1;
    }


    //    Constructor、Getter、Setter

    public ManagerDaoImpl() {
        list = new ArrayList<>();
        list.add(new Dvd(1, 0, "罗马假日", 1, 10));
        list.add(new Dvd(2, 0, "风声鹤唳", 15, 20));
        list.add(new Dvd(3, 0, "浪漫满屋", 7, 50));
    }

    public static List<Dvd> getList() {
        return list;
    }
}
