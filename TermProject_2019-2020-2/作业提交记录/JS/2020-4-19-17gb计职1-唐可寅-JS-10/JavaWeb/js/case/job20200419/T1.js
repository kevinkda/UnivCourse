let count = 1;

function add() {
    document.getElementById('btn-submit').disabled = 'disabled';
    let all = document.getElementById("all");
    let p1 = document.createElement("p");
    let spanUserName = document.createElement("span");
    p1.innerHTML = '姓名：';
    spanUserName.innerHTML = ' 请输入您的真实姓名';
    spanUserName.setAttribute('id', 'userName-span' + count);
    let inputText = document.createElement("input");
    inputText.setAttribute("type", "text");
    inputText.setAttribute("id", "username" + count);
    inputText.setAttribute("maxlength", '4');
    inputText.setAttribute("onblur", "valiName(" + count + ")");
    p1.appendChild(inputText);
    p1.appendChild(spanUserName);
    // ------------p1姓名元素标签组装完毕----------------------

    let p2 = document.createElement("p");//用来放性别
    p2.innerHTML = '性别：';
    // 组装男用户
    let spanRadioMan = document.createElement("span");
    let inputRadioMan = document.createElement("input");
    inputRadioMan.setAttribute("type", "radio");
    inputRadioMan.setAttribute("value", "1");
    inputRadioMan.setAttribute("name", "sex" + count);
    inputRadioMan.setAttribute("checked", "checked");
    spanRadioMan.innerHTML = "男";
    p2.appendChild(inputRadioMan);
    p2.appendChild(spanRadioMan);

    // 组装女用户
    let spanRadioWoman = document.createElement("span");
    let inputRadioWoman = document.createElement("input");
    inputRadioWoman.setAttribute("type", "radio");
    inputRadioWoman.setAttribute("value", "0");
    inputRadioWoman.setAttribute("name", "sex" + count);
    spanRadioWoman.innerHTML = "女";
    p2.appendChild(inputRadioWoman);
    p2.appendChild(spanRadioWoman)
    // ------------p2性别元素标签组装完毕----------------------

    let p3 = document.createElement("p");
    p3.innerHTML = '要求：';
    let inputCheckbox1 = document.createElement("input");
    let spanCheckbox1 = document.createElement("span");
    // 提供车辆的checkbox
    inputCheckbox1.setAttribute("type", "checkbox");
    inputCheckbox1.setAttribute("value", "提供车辆");
    inputCheckbox1.setAttribute("name", "request" + count);
    spanCheckbox1.innerHTML = '提供车辆';
    p3.appendChild(inputCheckbox1);
    p3.appendChild(spanCheckbox1);
    // ---------------checkbox1创建完毕-----------------------
    let inputCheckbox2 = document.createElement("input");
    let spanCheckbox2 = document.createElement("span");
    // 提供保险的checkbox
    inputCheckbox2.setAttribute("type", "checkbox");
    inputCheckbox2.setAttribute("value", "提供保险");
    inputCheckbox2.setAttribute("name", "request" + count);
    spanCheckbox2.innerHTML = '提供保险';
    p3.appendChild(inputCheckbox2);
    p3.appendChild(spanCheckbox2);
    // ---------------checkbox2创建完毕-----------------------

    // ------------p3'要求'元素标签组装完毕----------------------
    // 增加这些元素
    all.appendChild(p1);
    all.appendChild(p2);
    all.appendChild(p3);

    // -----------创建我的删除按钮------------
    let buttonDel = document.createElement("input");
    buttonDel.setAttribute("type", "button");
    buttonDel.setAttribute("value", "删除");
    all.appendChild(buttonDel);
    // 增加递增
    count++;
    // 移除减少
    buttonDel.onclick = function () {
        all.removeChild(p1);
        all.removeChild(p2);
        all.removeChild(p3);
        all.removeChild(buttonDel);
    }

}

// 验证账号
function valiName(index) {
    let userName = document.getElementById('username' + index).value.trim();
    let reg = /^0?[\u4e00-\u9fa5]{0,4}$/;
    if (reg.test(userName)) {
        document.getElementById('userName-span' + index).innerHTML = '√ 格式正确！';
        document.getElementById('btn-submit').disabled = '';

    } else {
        document.getElementById('userName-span' + index).innerHTML = '× 格式错误！姓名应由2~4个汉字组成';
        document.getElementById('btn-submit').disabled = 'disabled';
    }
}

// 提交按钮拿到数据
function saveData() {
    let showInfos = '';
    for (let i = 1; i <= count; i++) {
        if (document.getElementById("username" + i) != null) {
            let name = document.getElementById("username" + i).value.trim();
            let sex;
            if (document.getElementsByName('sex' + i)[0].checked === true) {
                sex = '男';
            } else if (document.getElementsByName('sex' + i)[1].checked === true) {
                sex = '女';
            }
            let req = '';
            for (let j = 0; j < document.getElementsByName('request' + i).length; j++) {
                if (document.getElementsByName('request' + i)[j].checked === true) {
                    req += document.getElementsByName('request' + i)[j].value + ',';
                }
            }
            req = req.substring(0, req.length - 1);
            showInfos += '姓名：' + name + '，性别：' + sex + '，已选要求：' + req + '\n';
        }
    }
    alert('您已成功提交的信息有：\n' + showInfos);
}