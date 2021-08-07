/**
 * @author Kevin KDA on 2020-04-17 22:00
 * @version 1.0.0
 */

function tj() {
    for (let i = 1; i < count; i++) {
        let xm = document.getElementById("account" + i).value;
        if (document.getElementsByName("sex" + i) !== 1) {
            let xb = "男";
        } else {
            let xb = "女";
        }
        let sfz = document.getElementById("sfzh" + i).value;
    }
    console.log(xm);
    console.log(xb);
    console.log(sfz);
}

//自驾游的活动  报名 人
//3口人 自驾游
//5口人自驾游
//1人去自驾游

function listenerName(count1) {
    //console.log(123);
    //console.log(count);
    //   table.setAttribute("border", "2");
    let accountId = "account" + count1;
    let val = document.getElementById(accountId).value;
    //console.log(val);
    document.getElementById(accountId).setAttribute("value", val);
}

function listenersfzh(count1) {
    //console.log(123);
    //console.log(count);
    //   table.setAttribute("border", "2");
    let accountId = "sfzh" + count1;
    let val = document.getElementById(accountId).value;
    //console.log(val);
    document.getElementById(accountId).setAttribute("value", val);
}

let count = 1;

function add() {
    //let info='<p>姓名:<input type="text"></p>';
    let str = document.getElementById("info").innerHTML;//获得标签的值
    let info = '<span id="span' + count + '"><p>姓名:<input type="text" id="account' + count + '" onblur="listenerName(' + count + ');"></p><p>性别：<input type="radio" value="1" name="sex' + count + '"/ checked="checked"><span>男</span><input type="radio" value="0" name="sex' + count + '"/><span>女</span></p><p>身份证号:<input type="text" id="sfzh' + count + '" onblur="listenersfzh(' + count + ');"></p><p><input type="button" value="删除" onclick="del(' + count + ');"></p><br></span>';
    //console.log(info);
    str += info;
    //console.log(info);
    document.getElementById("info").innerHTML = str;
    count++;
}

function del(id) {
    //alert(id);
    //.removeChild
    let big = document.getElementById("info");//取到info的元素节点信息
    let res = "span" + id;//外层容器
    let small = document.getElementById(res);//取到span标签元素节点信息
    big.removeChild(small);//从某个标签上移除某个节点信息
}