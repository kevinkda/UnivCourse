function checkAccount() {
    let account = document.getElementById("account").value.trim();
    if (account === '') {
        document.getElementById("accountError").innerText = "账号不能为空";
        document.getElementById("accountError").className = "errorT1";
        document.getElementById("account").style.borderColor = "red";
        return false;
    } else {
        if (account.length >= 11 && account.substr(0, 10) === "chinasoft@") {
            document.getElementById("accountError").innerText = "OK";
            document.getElementById("accountError").className = "errorT1";
            document.getElementById("account").style.borderColor = "green";
            return true;
        } else {
            document.getElementById("accountError").innerText = "账号必须以chinasoft@开头";
            document.getElementById("accountError").className = "errorT1";
            document.getElementById("account").style.borderColor = "red";
            return false;
        }
    }
}

function check() {
    if (checkAccount()) {
        return true;
    } else {
        return false;
    }
}