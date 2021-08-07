package com.kevinkda.univ.exam.javase.term20192.service.impl;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;
import com.kevinkda.univ.exam.javase.term20192.dao.IManagerDao;
import com.kevinkda.univ.exam.javase.term20192.dao.impl.ManagerDaoImpl;
import com.kevinkda.univ.exam.javase.term20192.service.IManagerService;

import java.util.Scanner;

/**
 * 程序服务类
 *
 * @author Kevin KDA on 2020/5/22 09:08
 * @version 1.0.0
 * @project exam-java-2019-term-2
 * @package com.kevinkda.univ.exam.javase.term20192.service.impl
 * @classname ManagerServiceImpl
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class ManagerServiceImpl implements IManagerService {
    IManagerDao managerDao = new ManagerDaoImpl();

    Scanner scaScan = new Scanner(System.in);

    /**
     * 提供程序入口，服务方法
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 10:45
     * @description ManagerServiceImpl / service
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 10:45")
    @Override
    public void service() {
        do {
            switch (selectFun()) {
                case 1:
                    addDvd();
                    break;
                case 2:
                    modifyDvd();
                    break;
                case 3:
                    showAll();
                    break;
                case 0:
                    System.exit(-1);
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        } while (true);
    }

    /**
     * 提供显示所有数据的服务方法
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 09:44
     * @description ManagerServiceImpl / showAll
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:44")
    private void showAll() {
        managerDao.showAll();
    }

    /**
     * 提供按DVD名称，修改DVD的方法
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 09:43
     * @description ManagerServiceImpl / modifyDvd
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:43")
    private void modifyDvd() {
//        获得需要修改的数据的名称
        System.out.print("Enter the name of the DVD to be modified: ");
        String name = scaScan.next();
//        获得需要修改的数据的名称
        System.out.print("Enter the modified DVD name: ");
        String nameNew = scaScan.next();

//        进行数据修改
        int modifyCheck = managerDao.modify(name.trim(), nameNew.trim());

//        添加空行
        System.out.println();

//        核验数据修改结果
        if (modifyCheck == 0) {
//            修改成功
            System.out.println("Modified Success");
        } else if (modifyCheck == -1) {
//            输入的需要修改的数据不存在
            System.out.println("Modified Fall: The entered data to be modified does not exist");
        } else if (modifyCheck == -2) {
//            输入的修改后名称重复
            System.out.println("Modified Fall: Duplicate modified name entered");
        }
        managerDao.showAll();
    }

    /**
     * 添加DVD数据，服务方法
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 09:20
     * @description ManagerServiceImpl / addDvd
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:20")
    private void addDvd() {
        System.out.println("\nAdd DVD");

        System.out.print("Input DVD Name: ");
        String name = scaScan.next();
//        System.out.print("Input DVD State: ");
//        int state = scaScan.nextInt();
//        System.out.print("Input DVD Out Dated: ");
//        int outDated = scaScan.nextInt();
//        System.out.print("Input DVD Lending Times: ");
//        int time = scaScan.nextInt();

//        进行数据添加
//        int backCode = managerDao.add(name, state, outDated, time);
        int backCode = managerDao.add(name.trim(), 0, 0, 0);

//        添加空行
        System.out.println();

//        核验数据添加结果
        if (backCode == 1) {
            System.out.println("Add Success");
        } else if (backCode == -1) {
            System.out.println("Add Fall: DVD Name is Exist");
        }

//        显示所有数据
        managerDao.showAll();
    }

    /**
     * 提供功能选择的方法
     *
     * @return int 返回功能选择结果
     * @author Kevin KDA on 2020/5/22 09:41
     * @description ManagerServiceImpl / selectFun
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:41")
    private int selectFun() {
        System.out.println("1. Add DVD");
        System.out.println("2. Modify DVD By Name");
        System.out.println("3. Show All DVD");
        System.out.println("0. Exit");
        System.out.print("Please Input Choose: ");
        return scaScan.nextInt();
    }


//    Constructor、Getter、Setter

    public ManagerServiceImpl() {
    }
}
