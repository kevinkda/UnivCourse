/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package exercise201909061.src.Kevin;

public class Climber {
    int speedUp=3000;
    int speedDown=4500;
    double timeGO=2;
    double timeBack=2.5;
    double distance=(timeGO+timeBack)/(1.0/speedUp+1.0/speedDown);

    public void Climbers(int spUp, int spDown, double tGo, double tBack){
        speedDown = spDown;
        speedUp = spUp;
        timeBack = tBack;
        timeGO = tGo;
    }

    public void showdistance(){
        System.out.println("翻越这座山共走了"+distance+"M");
    }
}
