let xmlHttp;

function loginNow() {
    let userAcc = document.getElementById("userAcc").value.trim();
    let userPass = document.getElementById("userPass").value.trim();
    if (window.XMLHttpRequest) {
        xmlHttp = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlHttp.onreadystatechange = processRequest;
    xmlHttp.open("get", "https://www.kevinkda.cn/api/ecs-control/LoginAccJsonpServlet?userAcc=" + userAcc + "&userPass=" + userPass, true);
    // xmlHttp.setRequestHeader("Content-type", "application")
    xmlHttp.send(null);
}

function processRequest() {
    if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
        let backCode = xmlHttp.responseText;
        console.log(backCode);
        let accTag = document.getElementById("accTag");
        accTag.style.visibility = "visible";
        accTag.style.color = "red";
        accTag.innerText = backCode;
    }
}