var index = 1;
var clearPhotoTime;     //清除图片滚动的时长
var clearTime;          //清除时间滚动的时长
var btn_time_status = false;        //控制时间暂停/继续
window.onload = showTime();
//动态时间
function showTime() {
    clearInterval(clearTime);
    var strWelcome;    //显示当前时段
    var obj = new Date();
    var year = obj.getFullYear();
    var month = obj.getMonth() + 1;
    var date = obj.getDate();
    var day = obj.getDay();
    var hours = obj.getHours();
    var minute = obj.getMinutes();
    var seconds = obj.getSeconds();
    if (hours >= 0 && hours <= 5) {
        strWelcome = '夜深了，请注意用眼健康噢~';
    } else if (hours >= 6 && hours <= 10) {
        strWelcome = '早上好！';
    } else if (hours >= 11 && hours <= 13) {
        strWelcome = '中午好！';
    } else if (hours >= 14 && hours <= 17) {
        strWelcome = '下午好！';
    } else if (hours >= 18 && hours <= 23) {
        strWelcome = '晚上好！';
    }
    if (day == 1) {
        day = '一';
    } else if (day == 2) {
        day = '二';
    } else if (day == 3) {
        day = '三';
    } else if (day == 4) {
        day = '四';
    } else if (day == 5) {
        day = '五';
    } else if (day == 6) {
        day = '六';
    } else if (day == 0) {
        day = '日';
    } else {
        day = '几？这是个问题。';
    }
    document.getElementById('show').innerHTML = strWelcome + '<br/>今天是' + year + '年' + month + '月' + date + '日,星期' + day +
        ',当前时间为：' + hours + ':' + minute + ':' + seconds;
    clearTime = setInterval(showTime, 1000);
}

//暂停/继续按钮
function btnChange() {
    var btn = document.getElementsByTagName('input')[0];
    if(!btn_time_status){
        btn.value = '继续';
        clearInterval(clearTime);
        btn_time_status = true;
    }else {
        btn.value = '暂停';
        showTime();
        btn_time_status = false;
    }
}
//自动轮换图片
function next() {
    clearInterval(clearPhotoTime);
    if (index >= 4) {
        index = 1;
    }
// 底下的/img后面放你的图片名的前缀，不带数字
//例如：img里张图片"photo1.jpg" 把其中的"photo"写到'../img/'后面
//底下所有的 ".src ="都要改 ！！！
   document.getElementById('urlPhoto').src = '../../img/job20200412/photo' + index + '.jpg';
    index++;
    //若鼠标无动作则三秒一轮换
    clearPhotoTime = setInterval(next, 3000);
}

//鼠标移动切换图片
function changeImg(img_index) {
    document.getElementById('urlPhoto').src = '../../img/job20200412/photo' + img_index + '.jpg';
}

//鼠标移开切换下一张图
function changeNextImg(img_index) {
    if (img_index >= 4) {
        img_index = 1;
    } else {
        img_index++;
    }
    document.getElementById('urlPhoto').src = '../../img/job20200412/photo' + img_index + '.jpg';
}

//加载时切换图片
window.onload = next();
