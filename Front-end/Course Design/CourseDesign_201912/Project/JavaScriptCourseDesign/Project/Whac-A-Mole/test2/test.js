// JavaScript Document

//变量声明


var mouseX;//鼠标坐标x,可以不用
var mouseY;//鼠标坐标y，可以不用
var Box = new Array();//地鼠类
var speed = 50;//游戏速度
var currentTime = 0;//当前时间
var score = 0;//分数
var currentBox;//指向上一个地鼠
var stage = 0;//难度
var img = new Image();//地鼠图片
var img2 = new Image();//锤子图片，可以不用
//加载
// img.src = "dishu.png";
img.src = "835795168.jpg";
img2.src = "chuizi.png"

//地鼠类
function createBox(x, y) {
    var Box = new Object;
    Box.x = x;//坐标
    Box.y = y;
    Box.width = 80;//宽高
    Box.height = 80;
    flag = 0;//是否出现地鼠，1为当前坐标内存在地鼠，0为不存在
    Box.color = "#fff000";//可以不用
    return Box;
}

function check(a) {
    //判断是否有地鼠
    if (a.flag == 1) {
        score++;
    }
}

function clickBox() {
    //点击盒子
    document.getElementById("canvasBox").onclick = function (event) {
        var x = event.clientX;
        var y = event.clientY;
        var ox = document.getElementById("canvasBox").offsetLeft;
        var oy = document.getElementById("canvasBox").offsetTop;
        //便利鼠标指针坐标与地鼠盒子的碰撞
        for (var i = 0; i < 9; i++) {
            cx = x - ox;
            cy = y - oy;
            if (cx > Box[i].x && cx < Box[i].x + Box[i].width &&
                cy > Box[i].y && cy < Box[i].y + Box[i].height) {
                check(Box[i]);
                Box[i].flag = 0;
            }
        }
    }
}

function count() {
    //写入score
    document.getElementById("score").innerHTML = "Score:" + score;
}

function judge() {
    //判断是否过关
    if (score == 10) {
        alert("next level!")
        score = 0;
        stage++;
        speed -= 10;
    }
    if (stage > 3) {
        alert("YOU WIN!")
        stage = 0;
        speed = 50;
    }
}

function loop() {
    //alert('loop');
    //计时
    var id = self.setInterval("main()", 30);//循环执行程序，30毫秒执行一次
}

//绘图，程序不同，接口不一一样，可以拿来参考
function drawBox() {
    //alert('drawBox');
    var elem = document.getElementById('canvasBox');
    canvas = elem.getContext('2d');//获取绘图区域
    //canvas.drawImage(img,20,20);
    canvas.fillStyle = "#999";
    canvas.clearRect(0, 0, 270, 480)//清理绘图区域，不清理的话上一次绘制的图片不会消失
    for (var i = 0; i < 9; i++)//绘制所有的地鼠盒子（图片，坐标x,y,绘制宽,高）
    {
        if (Box[i].flag == 1) canvas.drawImage(img, Box[i].x, Box[i].y, Box[i].width, Box[i].height);
        else if (Box[i].flag == 0) canvas.clearRect(Box[i].x, Box[i].y, Box[i].width, Box[i].height);
    }
    //绘制锤子
    canvas.drawImage(img2, mouseX - document.getElementById("canvasBox").offsetLeft - 20, mouseY - document.getElementById("canvasBox").offsetTop - 25)
}

//改变地鼠盒子状态
//当currentTime大于speed时，随机出现一只地鼠，否则currentTime++
function change() {
    if (currentTime >= speed) {
        for (var i = 0; i < 9; i++) {
            if (Box[i].flag = 1) {
                Box[i].flag = 0;
            }
        }
        var i = Math.floor(Math.random() * 10);
        while (i == currentBox) {
            i = Math.floor(Math.random() * 10);
        }
        currentBox = i;
        Box[i].flag = 1;
        Box[i].color = "#ff0000";
        currentTime = 0;
    } else {
        currentTime++;
    }
}

//主函数
function main() {
    //alert('main');
    change();
    clickBox();
    count();
    judge();
    drawBox();
    document.onmousemove = function (event) {
        mouseX = event.clientX;
        mouseY = event.clientY;
        //alert(mouseX)
    }
}

//初始化
function init() {
    //alert('init');

    for (var i = 0; i < 9; i++) {
        var a = createBox((i % 3) * 90, Math.floor(i / 3) * 90);
        Box[i] = a;

    }
    loop();
}

//程序开始执行
window.onload = init;