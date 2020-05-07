function workA() {
    let userAcc = document.getElementById("userAcc");
    let sex = "";
    let box = document.getElementsByName("sex");

    for (let i = 0; i < box.length; i++) {
        if (box[i].checked) {
            sex = box[i].value;
            break;
        }
    }
    location.href = "../../case/20200507/sign.jsp?userAcc" + userAcc + "&sex" + sex;
}