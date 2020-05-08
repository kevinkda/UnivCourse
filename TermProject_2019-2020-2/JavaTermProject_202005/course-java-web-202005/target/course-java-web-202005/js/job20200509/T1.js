function checkAcc() {
    let userAcc = document.getElementById("userAcc").value;
    // console.log(userAcc);
    // console.log(userAcc.trim());
    document.getElementById("userAcc").value = userAcc.trim();
    if (userAcc.length >= 4 && userAcc.length <= 16) {
        document.getElementById("accTag").innerText = "ok";
        document.getElementById("accTag").style.color = "green";
        document.getElementById("btn-sub").disabled = false;
        return true;
    } else {
        document.getElementById("accTag").innerText = "长度不正确，请输入4-16个字符";
        document.getElementById("accTag").style.color = "red";
        document.getElementById("btn-sub").disabled = true;
        return false;
    }
}

function checkPass() {
    let userPass = document.getElementById("userPass").value;
    let userPassT = document.getElementById("userPassT").value;
    // console.log(userPass + " / " + userPassT);
    if (userPass === userPassT) {
        document.getElementById("passTag").innerText = "ok";
        document.getElementById("passTag").style.color = "green";
        document.getElementById("btn-sub").disabled = false;
        return true;
    } else {
        document.getElementById("passTag").innerText = "两次输入的密码不一致";
        document.getElementById("passTag").style.color = "red";
        document.getElementById("btn-sub").disabled = true;
        return false;
    }
}

function checkEmail() {
    let email = document.getElementById("email").value.trim();
    document.getElementById("email").value = email.trim();
    let emailPat = /^(.+)@(.+)$/;
    let matchArray = email.match(emailPat);
    if (matchArray == null) {
        document.getElementById("emailTag").innerText = "Email格式错误";
        document.getElementById("emailTag").style.color = "red";
        document.getElementById("btn-sub").disabled = true;
        return true;
    } else {
        document.getElementById("emailTag").innerText = "ok";
        document.getElementById("emailTag").style.color = "green";
        document.getElementById("btn-sub").disabled = false;
        return false;
    }
}

function checkSubmit() {
    let userAcc = document.getElementById("userAcc").value;
    // console.log(userAcc);
    // console.log(userAcc.trim());
    document.getElementById("userAcc").value = userAcc.trim();
    let email = document.getElementById("email").value;
    document.getElementById("email").value = email.trim();

}