/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package exercise201909261.car_manage;

/**
 * @Program
 * @ClassName View
 * @Description TODO
 * @Author Kevin KDA
 * @Date 2019-09-25 12:26
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class View {
    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:02
     * @Description //TODO
     * @Param  * @param scaScan
     * @param contactManage
     * @Return
     */
//    public View(Scanner scaScan) {
//        View(scaScan, contactManage);
//    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:01
     * @Description //TODO
     * @Param  * @param scaScan
     * @param contactManage
     * @Return void
     */
//    public void View(Scanner scaScan) {
//        mainMenu();
//        selectionFunction(scaScan);
//    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 13:19
     * @Description //TODO
     * @Param  * @param
     * @Return void
     */
    private void mainMenu(){
        System.out.println("\n\n\t\t\t通讯录\n===============================");
        System.out.println("1.查看");
        System.out.println("2.添加");
        System.out.println("3.删除");
        System.out.println("4.修改");
        System.out.println("5.退出");
        System.out.print("请选择需要执行的指令:");
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:11
     * @Description //TODO
     * @Param  * @param scaScan
 * @param contactManage
     * @Return void
     */
//    void selectionFunction(Scanner scaScan){
//        switch (scaScan.nextInt()) {
//            default:
////				throw new IllegalStateException("Unexpected value: " + SC.nextInt());
//                System.out.print("\n输入错误，请重新输入\n");
//                View(scaScan);
//            case 1:
//                if (contactManage.showAllData() == 1) {
//                    View(scaScan, contactManage);
//                }
//                View(scaScan, contactManage);
//                break;
//            case 2:
//                String strCheck;
//                do {
//                    contactManage.createContact(scaScan);
//                    System.out.print("是否继续添加(Y/N:)");
//                    strCheck = scaScan.next();
////				}while ((strCheck == "Y") ||(strCheck == "y"));
////				}while (Objects.equals(strCheck, "Y"));
//                }while (Objects.equals(strCheck, "Y") || Objects.equals(strCheck, "y"));
//                View(scaScan, contactManage);
//                break;
//            case 3:
//                contactManage.deleteData(scaScan);
//                View(scaScan, contactManage);
//                break;
//            case 4:
//                contactManage.searchData(scaScan);
//                View(scaScan, contactManage);
//                break;
//            case 5:
//                System.exit(-1);
//                break;
//        }
//    }
}
