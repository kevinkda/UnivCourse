package com.kevin.job20200306.task2;

import com.kevin.job20200306.task2.entity.Player;
import com.kevin.job20200306.task2.face.IPlay;

/**
 * @author Kevin KDA on 2020/3/6 15:23
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task2
 * @classname Main0306T2
 * @description TODO
 * @interface/enum
 */
public class Main0306T2 {
    public static void main(String[] args) {
//        Player player = new Player();

        IPlay iPlay = new Player();
        iPlay.play("test.mp3");
    }
}
