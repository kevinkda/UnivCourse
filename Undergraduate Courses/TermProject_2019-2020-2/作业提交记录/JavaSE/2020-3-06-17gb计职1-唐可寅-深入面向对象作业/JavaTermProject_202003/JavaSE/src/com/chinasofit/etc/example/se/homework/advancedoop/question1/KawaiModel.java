/**
 * Copyright 2009 ChinaSoft International Ltd. All rights reserved.
 */

package com.chinasofit.etc.example.se.homework.advancedoop.question1;

import java.util.Random;

/**
 * <p>Title: KawaiModel</p>
 * <p>Description: 连连看游戏数据模型与操作</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: ChinaSoft International Ltd.</p>
 *
 * @author etc
 * @version 1.0
 */
public abstract class KawaiModel {

    /**
     * 存放连连看地图元素数据
     */
    public int[][] map;
    /**
     * 存放使用提示功能后系统查找到的第一个元素的行值
     */
    public int pointItemAI;
    /**
     * 存放使用提示功能后系统查找到的第一个元素的列值
     */
    public int pointItemAJ;
    /**
     * 存放使用提示功能后系统查找到的第二个元素的行值
     */
    public int pointItemBI;
    /**
     * 存放使用提示功能后系统查找到的第二个元素的列值
     */
    public int pointItemBJ;
//	/**
//	 * 存放第一个折点的行值，在两折连接情况下，第二个折点与第一个元素连接
//	 */
//	public int turningPointAI;
//	/**
//	 * 存放第一个折点的列值，在两折连接情况下，第二个折点与第一个元素连接
//	 */
//	public int turningPointAJ;
//	/**
//	 * 存放第二个折点的行值
//	 */
//	public int turningPointBI;
//	/**
//	 * 存放第二个折点的列值
//	 */
//	public int turningPointBJ;


    /**
     * 存放折点
     */
    public Node[] turningPoints = new Node[2];

    public abstract String getModelName();

//	public void setMaxTurnCount(int count){
//		turningPoints=new Node[count];
//	}
//


    public void setTurningPoints(int i, int j, int position) {
        if (turningPoints[position - 1] == null) {
            turningPoints[position - 1] = new Node();
        }
        Node node = turningPoints[position - 1];
        node.setI(i);
        node.setJ(j);
    }


    /**
     * 设置地图数组，本模型所有操作均建立在一个已有数组的基础之上
     *
     * @param map 一个int型二维数组，用来表述模型中元素的状态
     */
    public void setMap(int[][] map) {
        this.map = map;
    }

    /**
     * 随机生成初始化地图的方法
     *
     * @param elementCount     地图元素的总个数(必须为偶数并且等于(rowCount-2)*(columnCount-2))
     * @param rowCount         地图的行数
     * @param columnCount      地图的列数
     * @param elementTypeCount 元素的种数，种类标号从1到elementTypeCount（标准连连看为29种元素）
     * @return int型二维数组，存放随机生成的地图
     * @throws java.lang.IllegalArgumentException 如果传递的元素总个数不为偶数或元素总个数不等于(行数-2)*(列数-2)，将抛出异常
     */
    public int[][] initMapHelper(int elementCount, int rowCount, int columnCount, int elementTypeCount) {
        if ((elementCount % 2 != 0)
                && (elementCount != ((rowCount - 2) * (columnCount - 2)))) {// 如果参数不满足要求，则抛出异常
            throw new java.lang.IllegalArgumentException();
        }
        Random random = new Random();
        int[] initElement = new int[elementCount];// 创建一个临时的一位数组保存初始化元素
        for (int i = 0; i < elementCount; i += 2) {
            int randomNum = Math.abs(random.nextInt()) % elementTypeCount + 1;// 获取随机元素种类
            initElement[i] = randomNum;
            initElement[i + 1] = randomNum;// 一次性对相邻的两个元素赋值，保证随机得到（elementCount/2）对元素
        }

        // 随机打乱得到的原始数组
        initElement = getRandomArrayHelper(initElement);

        // 将打乱后的一维数组拷贝进最后的二维数组，注意，连连看游戏地图最外圈有一圈0
        int[][] finalMap = new int[rowCount][columnCount];
        int index = 0;
        for (int i = 1; i < rowCount - 1; i++) {
            for (int j = 1; j < columnCount - 1; j++) {
                finalMap[i][j] = initElement[index];
                index++;
            }
        }
        return finalMap;
    }

    /**
     * 随机打乱原始数组
     *
     * @param srcArray int型数组，存放未打乱的原始数据
     * @return int型数组，存放打乱后的结果
     */
    public int[] getRandomArrayHelper(int[] srcArray) {
        Random random = new Random();
        int[] resultArray = new int[srcArray.length];
        //srcIndex:还剩下的元素个数
        int srcIndex = srcArray.length;
        for (int i = 0; i < srcArray.length; i++) {
            int randomIndex = Math.abs(random.nextInt() % srcIndex);//随机取数组下标
            resultArray[i] = srcArray[randomIndex];
            srcArray[randomIndex] = srcArray[--srcIndex];//将最后一个未使用的元素和取出来的元素交换
        }
        return resultArray;
    }


    /**
     * 判断两个元素是否能够通过一条直线连接
     *
     * @param itemAI 第一个元素的行值
     * @param itemAJ 第一个元素的列值
     * @param itemBI 第二个元素的行值
     * @param itemBJ 第二个元素的列值
     * @return 布尔值，如果为True，说明两个元素能够通过一条直线连接，反之，则两个元素不能通过一条直线连接
     */
    public boolean linkByLine(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        // 两个元素在一条水平线上
        if (itemAI == itemBI) {
            int minJ = itemAJ < itemBJ ? itemAJ : itemBJ;
            int maxJ = itemAJ < itemBJ ? itemBJ : itemAJ;
            for (int j = minJ + 1; j < maxJ; j++) {
                if (map[itemAI][j] != 0) {
                    return false;
                }
            }
            return true;
        } else if (itemAJ == itemBJ) {
            // 两个元素在一条垂直线上
            int minI = itemAI < itemBI ? itemAI : itemBI;
            int maxI = itemAI < itemBI ? itemBI : itemAI;
            for (int i = minI + 1; i < maxI; i++) {
                if (map[i][itemAJ] != 0) {
                    return false;
                }
            }
            return true;
        } else {
            // 两个元素不在一条直线上
            return false;
        }
    }

    /**
     * 判断两个元素是否能够通过一次转折连接
     *
     * @param itemAI 第一个元素的行值
     * @param itemAJ 第一个元素的列值
     * @param itemBI 第二个元素的行值
     * @param itemBJ 第二个元素的列值
     * @return 布尔值，如果为True，说明两个元素能够通过一次转折连接，反之，则两个元素不能通过一次转折连接
     */
    public boolean linkByOneTurn(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        // 如果两个元素能够一折连接，那么折点是固定的，即（itemAI,itemBJ）或（itemBI,itemAJ）
        if ((map[itemAI][itemBJ] == 0)
                && linkByLine(itemAI, itemAJ, itemAI, itemBJ)
                && linkByLine(itemBI, itemBJ, itemAI, itemBJ)) {
            setTurningPoints(itemAI, itemBJ, 1);
//			turningPointAI = itemAI;
//			turningPointAJ = itemBJ;// 保存折点信息
            return true;
        } else if ((map[itemBI][itemAJ] == 0)
                && linkByLine(itemAI, itemAJ, itemBI, itemAJ)
                && linkByLine(itemBI, itemBJ, itemBI, itemAJ)) {
//			turningPointAI = itemBI;
//			turningPointAJ = itemAJ;
            setTurningPoints(itemBI, itemAJ, 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断两个元素是否能够通过两次转折连接
     *
     * @param itemAI 第一个元素的行值
     * @param itemAJ 第一个元素的列值
     * @param itemBI 第二个元素的行值
     * @param itemBJ 第二个元素的列值
     * @return 布尔值，如果为True，说明两个元素能够通过两次转折连接，反之，则两个元素不能通过两次转折连接
     */
    public boolean linkByTwoTurn(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        for (int i = 0; i < map.length; i++) {
            if (map[i][itemAJ] == 0 && linkByLine(i, itemAJ, itemAI, itemAJ) && linkByOneTurn(i, itemAJ, itemBI, itemBJ)) {
//				turningPointBI=i;
//				turningPointBJ=itemAJ;
                setTurningPoints(i, itemAJ, 2);
                return true;
            }
        }
        for (int j = 0; j < map[itemAI].length; j++) {
            if (map[itemAI][j] == 0 && linkByLine(itemAI, j, itemAI, itemAJ) && linkByOneTurn(itemAI, j, itemBI, itemBJ)) {

//				turningPointBI=itemAI;
//				turningPointBJ=j;
                setTurningPoints(itemAI, j, 2);
                return true;
            }
        }
        return false;
    }

    /**
     * 判断两个元素是否能够连接
     *
     * @param itemAI 第一个元素的行值
     * @param itemAJ 第一个元素的列值
     * @param itemBI 第二个元素的行值
     * @param itemBJ 第二个元素的列值
     * @return byte值<br>
     * 返回值为0，表示两个元素无法连接<br>
     * 返回值为1表示两个元素能够通过一条直线连接<br>
     * 返回值为2表示两个元素能够通过一次转折连接<br>
     * 返回值为3表示两个元素能够通过两次转折连接
     * @see KawaiModel #linkByLine(int, int, int, int)
     * @see KawaiModel #linkByOneTurn(int, int, int, int)
     * @see KawaiModel #linkByTwoTurn(int, int, int, int)
     */
    public abstract byte isConnected(int itemAI, int itemAJ, int itemBI, int itemBJ);

    /**
     * 当地图中存在上面为非0元素，而下面为0时，将两个元素对调
     *
     * @return 布尔值，表示是否执行过对调操作
     */
    public boolean downHelper() {
        boolean change = false;
        for (int i = map.length - 2; i > 1; i--) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0 && map[i - 1][j] != 0) {
                    map[i][j] = map[i - 1][j];
                    map[i - 1][j] = 0;
                    change = true;
                }
            }
        }
        return change;
    }

    /**
     * 将地图中所有非0元素往下串的方法
     */
    public void downMove() {
        while (downHelper()) ;
    }

    /**
     * 当地图中存在下面为非0元素，而上面为0时，将两个元素对调
     *
     * @return 布尔值，表示是否执行过对调操作
     */
    public boolean upHelper() {
        boolean change = false;
        for (int i = 1; i < map.length - 1; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0 && map[i + 1][j] != 0) {
                    map[i][j] = map[i + 1][j];
                    map[i + 1][j] = 0;
                    change = true;
                }
            }
        }
        return change;
    }

    /**
     * 将地图中所有非0元素往上串的方法
     */
    public void upMove() {
        while (upHelper()) ;
    }

    /**
     * 当地图中存在右面为非0元素，而左面为0时，将两个元素对调
     *
     * @return 布尔值，表示是否执行过对调操作
     */
    public boolean leftHelper() {
        boolean change = false;
        for (int i = 0; i < map.length; i++) {
            for (int j = map[i].length - 2; j > 1; j--) {
                if (map[i][j] == 0 && map[i][j - 1] != 0) {
                    map[i][j] = map[i][j - 1];
                    map[i][j - 1] = 0;
                    change = true;
                }
            }
        }
        return change;
    }

    /**
     * 将地图中所有非0元素往左串的方法
     */
    public void leftMove() {
        while (leftHelper()) ;
    }

    /**
     * 当地图中存在左面为非0元素，而右面为0时，将两个元素对调
     *
     * @return 布尔值，表示是否执行过对调操作
     */
    public boolean rightHelper() {
        boolean change = false;
        for (int i = 0; i < map.length; i++) {
            for (int j = 1; j < map[i].length - 1; j++) {
                if (map[i][j] == 0 && map[i][j + 1] != 0) {
                    map[i][j] = map[i][j + 1];
                    map[i][j + 1] = 0;
                    change = true;
                }
            }
        }
        return change;
    }

    /**
     * 将地图中所有非0元素往右串的方法
     */
    public void rightMove() {
        while (rightHelper()) ;
    }

    /**
     * 判断目前的地图状态是否已经过关，如果一个地图中所有的元素都为0，则表示所有的元素都已经消掉，过关
     *
     * @return 布尔值，如果为true，则表示已经过关，如果为false则表示还未过关
     */
    public boolean isPass() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 将现在地图重新洗牌的方法，游戏死掉，或者用户自己无法找到可以连接的元素对，希望进行重新洗牌时调用
     */
    public void resetMapHelper() {
        //计算目前地图中还存在多少元素
        int elementCount = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    elementCount++;
                }
            }
        }
        //创建一个临时数组保存现有元素
        int[] element = new int[elementCount];
        int index = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    element[index] = map[i][j];
                    index++;
                }
            }
        }
        //将数组随机打乱
        element = getRandomArrayHelper(element);
        //将打乱后的结果放回地图数组
        index = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    map[i][j] = element[index];
                    index++;
                }
            }
        }
    }

    /**
     * 打印输出连接状态结果
     *
     * @param itemAI 第一个元素的行值
     * @param itemAJ 第一个元素的列值
     * @param itemBI 第二个元素的行值
     * @param itemBJ 第二个元素的列值
     */
    public void showConnectState(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        int code = isConnected(itemAI, itemAJ, itemBI, itemBJ);
        if (code == 0) {
            System.out.println(">>>结果:对不起，按照规则，两个节点不能连接");
        } else {
            System.out.println(code + ">>>结果:恭喜，按照规则，两个节点可以连接，连接路径如下：");

            StringBuffer line = new StringBuffer();
            line.append("(");
            line.append(itemAI);
            line.append(",");
            line.append(itemAJ);
            line.append(")->");

            for (int i = code - 2; i >= 0; i--) {
                Node node = turningPoints[i];
                line.append("(");
                line.append(node.getI());
                line.append(",");
                line.append(node.getJ());
                line.append(")->");
            }
            line.append("(");
            line.append(itemBI);
            line.append(",");
            line.append(itemBJ);
            line.append(")");
            System.out.println(line.toString());

//			switch (code) {
//			case 1:
//				System.out.println("(" + itemAI + "," + itemAJ + ")->("
//						+ itemBI + "," + itemBJ + ")");
//				break;
//			case 2:
//				System.out.println("(" + itemAI + "," + itemAJ + ")->("
//						+ turningPointAI + "," + turningPointAJ + ")->("
//						+ itemBI + "," + itemBJ + ")");
//				break;
//			case 3:
//				System.out.println("(" + itemAI + "," + itemAJ + ")->("
//						+ turningPointBI + "," + turningPointBJ + ")->("
//						+ turningPointAI + "," + turningPointBJ + ")->("
//						+ itemBI + "," + itemBJ + ")");
//
//				break;
//			}
        }
    }

    /**
     * 用于对用户进行提示，找出一对可以连接的元素
     *
     * @return boolean值，
     * 如果为true，说明还存在可以连接的元素对，其坐标将存放在pointItemAI、pointItemAJ、pointItemBI、pointItemBJ四个成员中，
     * 如果返回值为false，说明游戏已经死掉，不存在可以连接的元素对了
     */
    public boolean pointHelper() {
        for (int i = 1; i < map.length - 1; i++) {// 外面两层循环，查找第一个元素
            for (int j = 1; j < map[i].length - 1; j++) {// 循环时去掉最外圈的0元素，稍微优化性能
                for (int i1 = 1; i1 < map.length - 1; i1++) {// 里面两层循环，查找地二个元素，思考：是否还有优化的可能
                    for (int j1 = 1; j1 < map[i].length - 1; j1++) {
                        if (isConnected(i, j, i1, j1) != 0) {
                            pointItemAI = i;
                            pointItemAJ = j;
                            pointItemBI = i1;
                            pointItemBJ = j1;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
