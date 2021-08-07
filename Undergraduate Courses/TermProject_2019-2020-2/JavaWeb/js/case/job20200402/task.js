//task1
let task1 = document.getElementById('task1');
var num1 = prompt('请输入第一个数：');
var num2 = prompt('请输入第二个数：');
var sum = parseInt(num1) + parseInt(num2);
task1.innerText = sum;

//task2
let task2 = document.getElementById('task2');
var obj = new Date();
var year = obj.getFullYear();
var month = obj.getMonth() + 1;
var date = obj.getDate();
var day = obj.getDay();
var hours = obj.getHours();
var minute = obj.getMinutes();
var seconds = obj.getSeconds();
var milliseconds = obj.getMilliseconds();
task2.innerText = '现在是：' + year + '年' + month + '月' + date + '日星期' + day + ',' + hours + '时' + minute + '分' + seconds + '秒 ' + milliseconds + '毫秒.';

//task3
let task3 = document.getElementById('task3');
var count = 0;
let temp = ' ';
var sum = 0;
for (var i = 1; i <= 50; i++) {
    if (i % 3 == 0) {
        if (i > 30) {
            temp = temp + i + ' ';
        }
        sum += parseInt(i);
        count++;
    }
}
task3.innerText =
    '1-50之间能被3整除且大于30的数有：' + temp + '\n' +
    '1-50之间所有能被3整除的数的和为：' + sum + '\n' +
    '共有' + count + '个数字';