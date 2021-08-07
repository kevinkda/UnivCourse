function workA() {
    let userID = document.getElementById("userID").value.trim();
    let userAcc = document.getElementById("userAcc").value.trim();
    let sex = "";
    let box = document.getElementsByName("sex");

    for (let i = 0; i < box.length; i++) {
        if (box[i].checked) {
            sex = box[i].value;
            break;
        }
    }
    location.href = "../../case/job20200508/sign.jsp?userID=" + userID + "userAcc=" + userAcc + "&sex=" + sex;
}