function getPrice() {
    let box = document.getElementsByName("car");
    let result = "";
    for (let i = 0; i < box.length; i++) {
        if (box[i].value) {
            result = box[i].value;
            break;
        }
    }
    if (result == "") {
        document.getElementById("info").innerText = "";
    }
    else if (result=="4s"){
        document.getElementById("info").innerText = "4s 3000";
    }else {
        document.getElementById("info").innerText = "汽修 200";
    }
}