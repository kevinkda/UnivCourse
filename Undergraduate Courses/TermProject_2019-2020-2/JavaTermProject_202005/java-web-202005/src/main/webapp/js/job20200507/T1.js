window.onload = function () {
    getTime();
    randomNum();
}

function getTime() {
    let myDate = new Date();
    myDate.getYear();        //获取当前年份(2位)
    myDate.getFullYear();    //获取完整的年份(4位,1970-????)
    myDate.getMonth();       //获取当前月份(0-11,0代表1月)
    myDate.getDate();        //获取当前日(1-31)
    myDate.getDay();         //获取当前星期X(0-6,0代表星期天)
    myDate.getTime();        //获取当前时间(从1970.1.1开始的毫秒数)
    myDate.getHours();       //获取当前小时数(0-23)
    myDate.getMinutes();     //获取当前分钟数(0-59)
    myDate.getSeconds();     //获取当前秒数(0-59)
    myDate.getMilliseconds();    //获取当前毫秒数(0-999)
    myDate.toLocaleDateString();     //获取当前日期
    let myTime = myDate.toLocaleTimeString();     //获取当前时间
    myDate.toLocaleString();        //获取日期与时间
    let timeA = document.getElementById("timeA");
    timeA.innerText = myDate + myTime;
}

function randomNum() {
    let numA = Math.round(Math.random() * 9 + 1);
    let numB = Math.round(Math.random() * 9 + 1);
    // console.log(numA + " --- " + numB);
    document.getElementById("numA").innerText = numA;
    document.getElementById("numB").innerText = numB;
    document.getElementById("plus").innerText = numA + numB;
    document.getElementById("min").innerText = numA - numB;
    document.getElementById("A").innerText = numA * numB;
    document.getElementById("B").innerText = Math.fround(numA / numB);
}