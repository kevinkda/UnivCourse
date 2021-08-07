// 验证账号
function checkUser() {
    var user = document.getElementById("user").value.trim();//拿到账号的值并去空格
    var pattern = /^[a-zA-Z][a-zA-Z0-9]{3,16}$/;
    if (pattern.test(user)) {
        document.getElementById("user1").innerHTML = '√';
        document.getElementById("user1").style.color = 'green';
        document.getElementById("user").style.borderColor = 'green';
    } else {
        document.getElementById("user1").innerHTML = '账号需以字母由字母和数字组成,且位数大于4';
        document.getElementById("user1").style.color = 'red';
        document.getElementById("user").style.borderColor = 'red';
    }
}

//昵称
function checkName() {
    var name = document.getElementById("name").value.trim();
    var pattern = /[\u4e00-\u9fa5]{2,6}$/;
    if (pattern.test(name)) {
        document.getElementById("name1").innerHTML = '√';
        document.getElementById("name1").style.color = 'green';
        document.getElementById("name").style.borderColor = 'green';
    } else {
        document.getElementById("name1").innerHTML = '昵称由2~6个汉字组成';
        document.getElementById("name1").style.color = 'red';
        document.getElementById("name").style.borderColor = 'red';
    }
}

//emil
function checkEmail() {
    var emil = document.getElementById("emil").value.trim();
    var pattern = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
    if (pattern.test(emil)) {
        document.getElementById("emil1").innerHTML = '√';
        document.getElementById("emil1").style.color = 'green';
        document.getElementById("emil").style.borderColor = 'green';
    } else {
        document.getElementById("emil1").innerHTML = '邮箱由为格式：@域名.com，如：cmr@qq.com';
        document.getElementById("emil1").style.color = 'red';
        document.getElementById("emil").style.borderColor = 'red';
    }
}

//密码
function checkPass() {
    var pwd = document.getElementById("pwd").value.trim();
    var pattern = /[a-zA-Z0-9]{4,10}$/;
    if (pattern.test(pwd)) {
        document.getElementById("pwd1").innerHTML = '√';
        document.getElementById("pwd1").style.color = 'green';
        document.getElementById("pwd").style.borderColor = 'green';
    } else {
        document.getElementById("pwd1").innerHTML = '密码由英文字母和数字组成的4-10位字符';
        document.getElementById("pwd1").style.color = 'red';
        document.getElementById("pwd").style.borderColor = 'red';
    }
}

//确认密码
function checkCpass() {
    var conpwd = document.getElementById("conpwd").value.trim();
    var pattern = document.getElementById("pwd").value.trim();
    if (pattern == conpwd) {
        document.getElementById("conpwd1").innerHTML = '√';
        document.getElementById("conpwd1").style.color = 'green';
        document.getElementById("conpwd").style.borderColor = 'green';
    } else {
        document.getElementById("conpwd1").innerHTML = '请再次输入上面你的密码';
        document.getElementById("conpwd1").style.color = 'red';
        document.getElementById("conpwd").style.borderColor = 'red';
    }
}

//手机号
function checkPhone() {
    var pattern = /0?(13|14|15|18|17)[0-9]{9}/;
    var pnum = document.getElementById("pnum").value.trim();
    if (pattern.test(pnum)) {
        document.getElementById("pnum1").innerHTML = '√';
        document.getElementById("pnum1").style.color = 'green';
        document.getElementById("pnum").style.borderColor = 'green';
    } else {
        document.getElementById("pnum1").innerHTML = '手机号为十一位组成且以13,15,17,18等开头';
        document.getElementById("pnum1").style.color = 'red';
        document.getElementById("pnum").style.borderColor = 'red';
    }
}

//出生日期
function checkBirthday() {
    var birday = document.getElementById("birday").value.trim();
    var pattern = /^(?:19\d{2}|200\d)-(?:1[0-2]|0?[0-9])-(?:3[01]|[12][0-9]|0?[0-9])$/;
    if (pattern.test(birday)) {
        document.getElementById("birday1").innerHTML = '√';
        document.getElementById("birday1").style.color = 'green';
        document.getElementById("birday").style.borderColor = 'green';
    } else {
        document.getElementById("birday1").innerHTML = '出生日期必须在1900-2009之间，如1998-9-1';
        document.getElementById("birday1").style.color = 'red';
        document.getElementById("birday").style.borderColor = 'red';
    }
}