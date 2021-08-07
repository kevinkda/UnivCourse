//清除计时
let clearTime;
//用户注册的账号
let userName = '';
//用户注册的密码
let userPwd = '';
//账号规范检查
let accountStatus = false;
//密码规范检查
let pwdStatus = false;

//用户输入账号时的提示
function accountNote1() {
    let tip = document.getElementById('account_tip');
    if (!accountStatus) {
        tip.innerHTML = '账号只能以英文加字母组成，且第一位必须是英文！长度不可超过八位';
        tip.style.color = '#000';
    } else {
        tip.innerHTML = '√';
        tip.style.color = '#0f0';
    }
}

//用户输完账号后的验证
function accountNote2() {
    userName = document.getElementById('account').value.trim(); //获取用户输入的账号
    if (userName === '') {
        accountStatus = false;
        document.getElementById('account').style.borderColor = '#f00';
        document.getElementById('account_tip').innerHTML = '账号不可以为空！';
        document.getElementById('account_tip').style.color = '#f00';
    } else if ((userName.charAt(0) >= 'A' && userName.charAt(0) <= 'Z')
        || (userName.charAt(0) >= 'a' && userName.charAt(0) <= 'z')) {
        //判断用户输入账号的第一个字符是否为英文字母
        for (let i = 0; i < userName.length; i++) {
            let c = userName.charAt(i);
            //判断用户输入的所有字符是否均为字母或英文
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            } else {
                accountStatus = false;
                document.getElementById('account').style.borderColor = '#f00';
                document.getElementById('account_tip').innerHTML = '格式有误！账号只能以英文加字母组成';
                document.getElementById('account_tip').style.color = '#f00';
                break;
            }
            accountStatus = true;
            document.getElementById('account').style.borderColor = '#0f0';
            document.getElementById('account_tip').innerHTML = '√';
            document.getElementById('account_tip').style.color = '#0f0';
        }
    } else {
        accountStatus = false;
        document.getElementById('account').style.borderColor = '#f00';
        document.getElementById('account_tip').innerHTML = '格式有误！账号的第一位必须是英文开头';
        document.getElementById('account_tip').style.color = '#f00';
    }

}

//用户输入密码时的提示
function passNote1() {
    let tip = document.getElementById('pwd1_tip');
    if (!pwdStatus) {
        tip.innerHTML = '密码必须由三位数字和三位英文组成！';
        tip.style.color = '#000';
    } else {
        tip.innerHTML = '√';
        tip.style.color = '#0f0';
    }
}

//用户输完密码后的验证
function passNote2() {
    //获取用户输入的密码
    userPwd = document.getElementById('pwd1').value.trim();
    if (userPwd === '') {
        pwdStatus = false;
        document.getElementById('pwd1').style.borderColor = '#f00';
        document.getElementById('pwd1_tip').innerHTML = '密码不能为空！';
        document.getElementById('pwd1_tip').style.color = '#f00';
    } else if (userPwd.length === 6) {
        //判断用户输入密码的长度为是否为六
        let numCount = 0;
        let letterCount = 0;
        for (let i = 0; i < userPwd.length; i++) {
            let c = userPwd.charAt(i);
            //判断用户输入的所有字符是否均为字母或英文
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                letterCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else {
                pwdStatus = false;
                document.getElementById('pwd1').style.borderColor = '#f00';
                document.getElementById('pwd1_tip').innerHTML = '格式有误！密码只能由英文和数字组成';
                document.getElementById('pwd1_tip').style.color = '#f00';
                break;
            }
            if (numCount === 3 && letterCount === 3) {
                pwdStatus = true;
                document.getElementById('pwd1').style.borderColor = '#0f0';
                document.getElementById('pwd1_tip').innerHTML = '√';
                document.getElementById('pwd1_tip').style.color = '#0f0';
            } else {
                pwdStatus = false;
                document.getElementById('pwd1').style.borderColor = '#f00';
                document.getElementById('pwd1_tip').innerHTML = '格式有误！英文和数字必须都为3位';
                document.getElementById('pwd1_tip').style.color = '#f00';
            }
        }
    } else {
        pwdStatus = false;
        document.getElementById('pwd1').style.borderColor = '#f00';
        document.getElementById('pwd1_tip').innerHTML = '格式有误！密码长度必须为六位';
        document.getElementById('pwd1_tip').style.color = '#f00';
    }

}

//确认密码时的提示
function passNote3() {
    let tip = document.getElementById('pwd2_tip');
    let pwdCheck = document.getElementById('pwd2').value.trim();
    if ((pwdCheck === userPwd) && (pwdCheck !== '')) {
        tip.innerHTML = '√';
        tip.style.color = '#0f0';
    } else {
        tip.innerHTML = '请再次输入密码';
        tip.style.color = '#000';
    }
}

//确认密码后的验证
function pwdNoitcer4() {
    let pwdCheck = document.getElementById('pwd2').value.trim();
    if ((pwdCheck === userPwd) && (pwdCheck !== '')) {
        document.getElementById('pwd2').style.borderColor = '#0f0';
        document.getElementById('pwd2_tip').innerHTML = '√';
        document.getElementById('pwd2_tip').style.color = '#0f0';
    } else if (pwdCheck === '') {
        document.getElementById('pwd2').style.borderColor = '#f00';
        document.getElementById('pwd2_tip').innerHTML = '输入不能为空！';
        document.getElementById('pwd2_tip').style.color = '#f00';
    } else {
        document.getElementById('pwd2').style.borderColor = '#f00';
        document.getElementById('pwd2_tip').innerHTML = '两次密码输入不一致！';
        document.getElementById('pwd2_tip').style.color = '#f00';
    }
}

//确认是否能注册
function valiUser() {
    if (accountStatus && pwdStatus) {
        document.getElementsByTagName('form')[0].submit();
    } else {
        alert('注册失败！')
    }
}

//根据部门的不同来打印
function departInfo() {
    if (document.getElementById('dep_hr').checked) {
        document.getElementsByTagName('textarea')[0].innerText = 'HR部门细则：\n...';
    } else if (document.getElementById('dep_rd').checked) {
        document.getElementsByTagName('textarea')[0].innerText = 'RD部门细则：\n...';
    } else {
        userDepart = '奇思妙想部';
        document.getElementsByTagName('textarea')[0].innerText = '该部门尚未建设...';
    }
    document.getElementById('departmentRule').style.display = 'block';
}

